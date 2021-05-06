package Abstract;
import Entity.Campaign;

public  class CampainManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya baþarýyla eklendi "+ campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya baþarýyla silindi "+ campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya baþarýyla güncellendi "+ campaign.getCampaignName());
		
	}

}
