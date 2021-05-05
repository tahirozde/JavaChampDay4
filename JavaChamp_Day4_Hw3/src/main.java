import java.sql.Date;

import Game.Game;
import Game.PurchaseGame;
import Log.Logger;
import Log.MailLogs;
import Users.Player;
import Users.PlayerManager;
import campaign.CampaignProvider;
import campaign.campaign;

public class main {

	public static void main(String[] args) {
		Logger[] loggers= {new MailLogs()};
		
		PlayerManager playerManager= new PlayerManager(loggers);
		Player player=new Player(1, "TAHÝR", "ÖZDE", "555555", new Date(1996),"TAHO" ,"199666155" );
		
		Game game= new Game(1, "GTA 5", "60 GB", 300);
		PurchaseGame purchaseGame= new PurchaseGame();
		
		campaign campaign= new campaign(3, "Yeni indirim","BAHAR ÝNDÝRÝMÝ" ,20);
		CampaignProvider campaignProvider=new CampaignProvider();

	}

}
