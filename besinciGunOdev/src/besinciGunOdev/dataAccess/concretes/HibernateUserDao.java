package besinciGunOdev.dataAccess.concretes;

import besinciGunOdev.dataAccess.abstracts.UserDao;
import besinciGunOdev.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {

		System.out.println(user.getFirstName()+" Sektöre Kayýt için. Doðrulama e-postasý gönderildi.");
		
	}

	@Override
	public void logIn(User user) {
		System.out.println(user.getFirstName()+" Sektöre Tekrar Hoþgeldin...");
		
	}

	@Override
	public void verificationEmail(User user) {
		System.out.println("Email doðrulama tamamlandý. Sektöre Hoþgeldin.");
		
	}

}
