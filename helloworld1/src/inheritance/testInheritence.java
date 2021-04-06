package inheritance;

public class testInheritence {
	public static void main(String args[]) {
		incomeTax incometax=new incomeTax();
		System.out.println("your tax=" +incometax.calculateTax(1200000));
	}

}
