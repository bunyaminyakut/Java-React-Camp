package Abstract;

import Entity.User;

public interface CheckRealPersonService {

	boolean checkRealPerson(User user) throws Exception;
}
