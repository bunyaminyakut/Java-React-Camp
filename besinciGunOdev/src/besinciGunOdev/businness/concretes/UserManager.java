package besinciGunOdev.businness.concretes;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import besinciGunOdev.businness.abstracts.UserService;
import besinciGunOdev.dataAccess.abstracts.UserDao;
import besinciGunOdev.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private ArrayList<User> fakeUserList = new ArrayList<User>();
	
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
		fakeInMemoryData();
	}
	
	@Override
	public void add(User user) {
		if(user.getFirstName()!=null && user.getLastName() != null && 
				user.getEmail() !=null && user.getPassword() !=null && user.getId()>0) {
			
			
			if(user.getFirstName().length()<3 || user.getLastName().length()<3) {
				System.out.println("Ad ve Soyad en az 2 karakter olmalýdýr!");
				return;
			}
			else if(user.getPassword().length()<6) {
				System.out.println("Parola en az 6 karakter olmalýdýr!");
				return;
			}
			else if(! valEmail(user.getEmail())) {
				System.out.println("Geçerli bir email giriniz lütfen ");
				return;
			}
			this.userDao.add(user);
		}
		else {
			System.out.println("Gerekli Bilgileri Boþ Býrakmayýnýz");
		}
	}

	@Override
	public void logIn(User user) {
		
		this.userDao.logIn(user);
	}

	
	
	@Override
	public boolean valEmail(String input) {
		String emailRaggex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat= Pattern.compile(emailRaggex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(input);
		return matcher.find();
	}

	@Override
	public boolean verificationEmaik(User user) {
		System.out.println("Email' inizi doðrulamak için 'DOGRULA' yazýnýz. ");
		String verificate = "DOGRULA";
		if (verificate=="DOGRULA") {
			System.out.println("Email onayý baþarýlý. Artýk Giriþ Yapabilirsiniz");
			user.setValidated(true);
			return true;
		}
		else {
			System.out.println("Hatalý giris!");
			return false;
		}
		
	}
	
	private void fakeInMemoryData() {
        User fakeUser = new User(1,"test","test 1","test1@gmail.com","123456789");
        User fakeUser1 = new User(2,"test1","test 2","test2@gmail.com","123456789");
        User fakeUser2 = new User(3,"test2","test 3","test3@gmail.com","123456789");
        User fakeUser3 = new User(4,"test3","test 4","test4@gmail.com","123456789");

        fakeUserList.add(fakeUser);
        fakeUserList.add(fakeUser1);
        fakeUserList.add(fakeUser2);
        fakeUserList.add(fakeUser3);
    }

	@Override
	public boolean checkUserEnail(User users) {
		for(User user:fakeUserList){
            if(user.getEmail() != users.getEmail()){
                return true;
            }else{
            	System.out.println("Bu Emaile kayýtlý bir hesap bulunmaktadýr");
                return false;
            }
        }
		return false;
	}
	

	
}
