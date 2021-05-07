package besinciGunOdev.dataAccess.abstracts;

import besinciGunOdev.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void verificationEmail(User user);
	void logIn(User user);
}
