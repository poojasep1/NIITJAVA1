package constructor;

public class constructorOverloading {
	int age;
	String name;
	int roll;
	constructorOverloading(int i,String n)
	{
		age=i;
		name=n;
		
	}
	constructorOverloading(int i,String n,int j)
	{
		age=i;
		name=n;
		roll=j;
	}
void display()
{
	System.out.println(age+" "+name+" "+roll);
}
	public static void main(String[] args) {
		constructorOverloading obj=new constructorOverloading(20,"pooja");
		constructorOverloading obj1=new constructorOverloading(20,"pooja",30);
		// TODO Auto-generated method stub
		obj.display();
		obj1.display();

	}

}
