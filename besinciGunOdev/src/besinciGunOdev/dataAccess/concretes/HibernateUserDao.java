package besinciGunOdev.dataAccess.concretes;

import besinciGunOdev.dataAccess.abstracts.UserDao;
import besinciGunOdev.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {

		System.out.println(user.getFirstName()+" Sekt�re Kay�t i�in. Do�rulama e-postas� g�nderildi.");
		
	}

	@Override
	public void logIn(User user) {
		System.out.println(user.getFirstName()+" Sekt�re Tekrar Ho�geldin...");
		
	}

	@Override
	public void verificationEmail(User user) {
		System.out.println("Email do�rulama tamamland�. Sekt�re Ho�geldin.");
		
	}

}
