package DateFunctions;

import java.time.Year;

public class LeafYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Year year=Year.of(2020);
		if(year.isLeap())
		{
			System.out.println("leap year");
		}
		else {
			System.out.println("notleap year");
		}

	}
private static int add(int i,int j) {
	return i+j;
}
}
