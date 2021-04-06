package Generics;



public class MainForGeneral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GeneralGenricClass<String> g1=new GeneralGenricClass<String>("pooja");
		g1.show();
		System.out.println(g1.getob());
		GeneralGenricClass<Integer> g2=new GeneralGenricClass<Integer>(new Integer(10));
		g2.show();
		System.out.println(g2.getob());
		BoundedTypes<MyNumber> myTest = new BoundedTypes<MyNumber>(new Mynumber(), new MyNumber());
		
		
		
	}

}
