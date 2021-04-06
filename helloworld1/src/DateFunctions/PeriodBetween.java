package DateFunctions;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today=LocalDate.now();
		LocalDate dob=LocalDate.of(2000 ,01 ,01);
		Period period =Period.between(dob, today);
		LocalDate lastDay=dob.plusYears(60);
		Period periodLeft=Period.between(today, lastDay);
		System.out.printf("no of years=%d, no of months=%d,no of days=%d",period.getYears(),period.getMonths(),period.getDays());
;
		System.out.printf("no of years left=%d, no of months=%d,no of days=%d",periodLeft.getYears(),periodLeft.getMonths(),periodLeft.getDays());


	}
	private static int add(int i,int j) {
		return i+j;
	}

}
