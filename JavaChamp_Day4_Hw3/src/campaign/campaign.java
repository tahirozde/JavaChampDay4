package campaign;

public class campaign {
	private int id;
	private String gameName;
	private String campaignName;
	private int discountPercent;
	public campaign(int id, String gameName, String campaignName, int discountPercent) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.campaignName = campaignName;
		this.discountPercent = discountPercent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public int getDiscountPercent() {
		return (int)(discountPercent*0.2);
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

}
