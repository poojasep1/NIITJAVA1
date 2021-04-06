package staticKeyword;



public class staticMethod {
	int roll;
	String name;
	static String college="aits";
	static void change()
	{
		college="annamacharya";
	}
	staticMethod(int i,String j)
	{
		roll=i;
		name=j;
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+college);
	}

	public static void main(String[] args) {
		staticMethod.change();
		staticMethod s1=new staticMethod(577,"pooja");
		staticMethod s2=new staticMethod(580,"prathyusha");
		staticMethod s3= new staticMethod(572,"pandhi");
		s1.display();
		s2.display();
		s3.display();
		// TODO Auto-generated method stub

	}

}
