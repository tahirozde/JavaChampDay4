package campaign;

import Game.Game;

public interface campaignManager {

	void discount(campaign campaign);
	void addCampaing(campaign campaign,Game game);
	void deleteCampaing(campaign campaign, Game game);
}
