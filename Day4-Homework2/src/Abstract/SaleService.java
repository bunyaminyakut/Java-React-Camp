package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.User;

public interface SaleService {
	void sales(Game game , User user,Campaign campaign);
}
