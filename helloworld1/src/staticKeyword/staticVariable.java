package staticKeyword;

public class staticVariable {
	int roll;
	String name;
	static String college="AITS";
	staticVariable(int i,String j){
		roll=i;
		name=j;
		
	}
	void display()
	{
		System.out.println(roll+" "+name+" "+college);
	}


	public static void main(String[] args) {

		staticVariable s1=new staticVariable(577,"pooja");
		staticVariable s2=new staticVariable(572,"niveda");
		s1.display();
		s2.display();
		
		
		// TODO Auto-generated method stub

	}

}
