package lamdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(15);
		a1.add(4);
		a1.add(12);
		a1.add(3);
		a1.add(24);
		System.out.println(a1);
		//using lamda expression
		Comparator<Integer> c=(o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
		Collections.sort(a1,c);
		System.out.println("Lamda Expression usage");
		System.out.println(a1);
		System.out.println("Without using lamda expressions");
		Collections.sort(a1);
		System.out.println(a1);
		
		

	}

}
