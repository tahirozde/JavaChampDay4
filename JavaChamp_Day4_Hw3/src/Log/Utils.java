package Log;

import java.sql.Date;

public class Utils {
	public static void runLogger(Logger[]loggers, String nationalid,String firstName, String lastName, Date ateofBirt) {
		for(Logger logger:loggers) {
			logger.log(nationalid, firstName, lastName, ateofBirt);
		}
	}

}
