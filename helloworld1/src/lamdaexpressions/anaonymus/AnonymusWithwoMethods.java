package lamdaexpressions.anaonymus;

public class AnonymusWithwoMethods {

	public static void main(String[] args) {
		Interface inter = new Interface() {
			public void m2() {
				System.out.println("m2----->interface");
			}
			public void m1() {
				System.out.println("m1------->interface");
			}
			
		};
		inter.m1();
		inter.m2();
		

	}

}
