package constructor;

public class copyConstructor1 {
	int roll;
	String name;
	copyConstructor1(int i, String j)
	{
		roll=i;
		name=j;
	}
	copyConstructor1()
	{}
	void display()
	{
		System.out.println(roll+" "+name);
	}

	public static void main(String[] args) {
		copyConstructor1 obj=new copyConstructor1(577,"pooja");
		copyConstructor1 obj1=new copyConstructor1();
		obj1.roll=obj.roll;
		obj1.name=obj.name;
		obj.display();
		obj1.display();
		// TODO Auto-generated method stub

	}

}
