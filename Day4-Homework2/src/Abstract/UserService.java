package Abstract;

import Entity.User;

public interface UserService {
	
	void add(User user) throws Exception;
	void update(User user);
	void delete(User user);
}
