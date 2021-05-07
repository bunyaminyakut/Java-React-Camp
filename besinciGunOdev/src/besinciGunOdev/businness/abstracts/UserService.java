package besinciGunOdev.businness.abstracts;

import besinciGunOdev.entities.concretes.User;

public interface UserService {

	 void add(User user);
	 void logIn(User user);
	 boolean valEmail(String input);
	 boolean verificationEmaik(User user);
	 boolean checkUserEnail(User users);
	
	
}
