package Users;

import Log.Logger;

public class PlayerManager {
	private Logger[] loggers;

	public PlayerManager(Logger[] loggers) {
		super();
		this.loggers = loggers;
	}

	public Logger[] getLoggers() {
		return loggers;
	}

	public void setLoggers(Logger[] loggers) {
		this.loggers = loggers;
	}
	void register(Player player) {
		System.out.println("Username   :  " + player.getUserName());
		System.out.println("Pasword    :  "+player.getPassword());
		System.out.println();
	}
	

}
