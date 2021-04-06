package constructor;

public class copyConstructor {
	int roll;
	String name;
	copyConstructor(int i,String j)
	{
		roll=i;
		name=j;
	}
	copyConstructor(copyConstructor c)
	{
		roll=c.roll;
		name=c.name;
	}
	void display()
	{
		System.out.println(roll+" "+name);
	}
	public static void main(String args[])
	{
		copyConstructor obj=new copyConstructor(577,"pooja");
		copyConstructor obj1=new copyConstructor(obj);
		obj.display();
		obj1.display();
	}
	

}
