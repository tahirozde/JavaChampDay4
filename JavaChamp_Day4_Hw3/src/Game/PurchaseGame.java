package Game;

import Users.Player;

public class PurchaseGame implements GameManager {

	@Override
	public void addGame(Game game, Player player) {
		System.out.println("Oyun eklendi"+game.getGameName());
	     System.out.println("Oyun �zellikler"+game.getComment());
	     System.out.println("Fiyat�"+game.getUnitPrice());
		
	}

}
