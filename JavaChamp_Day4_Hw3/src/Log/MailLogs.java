package Log;

import java.sql.Date;

public class MailLogs implements Logger {

	@Override
	public void log(String nationaltyId, String firstName, String lastname, Date DateOfBirt) {
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("TC Kimlik no;  "+nationaltyId);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("ÝSÝM  :"+firstName);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Soyisim   :"+lastname);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Doðum Tarihi  :"+DateOfBirt);
		
	}

}
