package Abstract;

import Entity.Campaign;
import Entity.Game;
import Entity.User;

public  class SaleManager implements SaleService{

	@Override
	public void sales(Game game, User user, Campaign campaign) {
		if (game.getId() > 0) {
			System.out.println(user.getFirstName() +" " + game.getPrice() + "TL fiyatýndaki "+ game.getName() +" oyununu " + campaign.getCampaignName() + " kampanyasýyla "+campaign.getCampaignPrice()+ " TL indirimli satýn aldý ");
		}

		else {
			System.out.println("Böyle bir oyunumuz bulunmamaktadýr!");
		}
	}
}
