package Inbuilt.Functional.interfaces;

import java.util.function.Predicate;

public class predicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p =i->i%2==0;
		System.out.println(p.test(10));

	}

}
