package constructor;

public class defaultConstructor1 {
	int roll;
	String name;
	public void display()
	{
		System.out.println("hello pooja!.......these are ur defualt values");
		/*these default constructor provides default values because here we are not
		 there no constructor created so that the values are also default as zero or null
		 */ 
		System.out.println(roll+" "+name);
	}
	public static void main(String args[])
	{
		defaultConstructor1 obj=new defaultConstructor1();
		defaultConstructor1 obj1=new defaultConstructor1();
		obj.display();
		obj1.display();
	}
}
