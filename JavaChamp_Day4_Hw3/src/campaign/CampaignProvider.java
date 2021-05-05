package campaign;

import Game.Game;
import Game.GameManager;

public class CampaignProvider implements campaignManager  {

	@Override
	public void discount(campaign campaign) {
		System.out.println("Game discont uygulandý"+campaign.getDiscountPercent());
		
		
	}

	
		
	

	@Override
	public void deleteCampaing(campaign campaign, Game game ) {
		System.out.println("oyun kaldýrýldý"+ game.getGameName());
		
	}

	@Override
	public void addCampaing(campaign campaign, Game game) {
		System.out.println("Oyun eklend,"+game.getGameName());
		
	}

}
