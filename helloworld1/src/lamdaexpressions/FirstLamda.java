package lamdaexpressions;

import java.util.function.Function;

public class FirstLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sq4=square(4);
		//System.out.println(sq4);
		Function<Integer,Integer> b =n -> n*n*n;
		System.out.println(b.apply(4));
		

	}
	/*public static int square(int n) {
		return n*n;
	}*/

}
