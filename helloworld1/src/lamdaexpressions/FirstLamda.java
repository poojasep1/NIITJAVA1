package lamdaexpressions;

import java.util.function.Function;

public class FirstLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int sq4=square(4);
		//System.out.println(sq4);
		
		
		
		Function<Integer,Integer> b =n -> n*n*n;
		System.out.println(b.apply(4));
		int c=add(4,5);
		
		System.out.println(c);
		
		FunctinalInterface fi=()->System.out.println("pooja");
		fi.m1();
		Sum s=(a, d)->a+d;
		System.out.println(s.add(4,5));
		
		
		
		
		
		//lamda expression is
		//Function <Integer, Integer> g=(a,b) ->a+b;
		//System.out.println(g.apply(4));
		//() ->System.out.println(pooja);

	}
	/*public static int square(int n) {
		return n*n;
	}*/
	public static void m1()
	{
		System.out.println("pooja");
		//() ->System.out.println(pooja);//lamda expression
	}
	public static int add(int a,int d) {
		//(a,b)->a+b;
		return a+d;
	}

}
