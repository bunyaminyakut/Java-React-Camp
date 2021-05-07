package besinciGunOdev;

import besinciGunOdev.businness.abstracts.UserService;
import besinciGunOdev.businness.concretes.UserManager;
import besinciGunOdev.dataAccess.concretes.HibernateUserDao;
import besinciGunOdev.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userService=new UserManager(new HibernateUserDao());
		
	    //Test kullanýcýsý ile kontrol
		User test = new User(1,"test","test 1","test1@gmail.com","123456789");
	    //Yeni Kullanýcý
		User user=new User(1,"Bünyamin","Yakut","bunyamin@gmail.com","123456");
		
		userService.checkUserEnail(test);
		
		userService.add(user);
		//Email Onaylama
		userService.verificationEmaik(user);
		
		//Giriþ
		userService.logIn(user);
		
		
	
	}

}
