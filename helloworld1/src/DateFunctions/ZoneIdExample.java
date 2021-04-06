package DateFunctions;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		ZoneId zone2=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zdt=ZonedDateTime.now(zone2);
		System.out.println("date and time in los angles now is"+zdt);

	}

}
