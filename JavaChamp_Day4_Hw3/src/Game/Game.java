package Game;

public class Game {
	private int Id;
	private String gameName;
	private String comment;
	private double unitPrice;
	
	public Game(int id, String gameName, String comment, double unitPrice) {
		super();
		Id = id;
		this.gameName = gameName;
		this.comment = comment;
		this.unitPrice = unitPrice;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
