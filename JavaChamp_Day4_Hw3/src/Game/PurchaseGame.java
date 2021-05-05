package Game;

import Users.Player;

public class PurchaseGame implements GameManager {

	@Override
	public void addGame(Game game, Player player) {
		System.out.println("Oyun eklendi"+game.getGameName());
	     System.out.println("Oyun özellikler"+game.getComment());
	     System.out.println("Fiyatý"+game.getUnitPrice());
		
	}

}
