package Entity;

public class Campaign {

	private int id;
	private String name;
	private int price;

	public Campaign() {

	}

	public Campaign(int id, String campaignName, int campaignPrice) {
		this();
		this.id = id;
		this.name = campaignName;
		this.price = campaignPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return name;
	}

	public void setCampaignName(String campaignName) {
		this.name = campaignName;
	}

	public int getCampaignPrice() {
		return price;
	}

	public void setCampaignPrice(int campaignPrice) {
		this.price = campaignPrice;
	}
}
