package DateFunctions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localdate=LocalDate.now();
		int day=localdate.getDayOfMonth();
		LocalDateTime localdatetime=LocalDateTime.now();
		int c=add(10,20);
		LocalTime ltime=LocalTime.now();
		System.out.println(ltime.plusMinutes(39));

	     }
	private static int add(int i,int j) {
		return i+j;
	}

}
