package methodOverloading;

public class methodOver {
static int add(int a, int b) {
	return a+b;
}
 static int add(int a, int b, int c) {
	return a+b+c;
}
public static void main(String args[])
{
	/*methodOver obj =new methodOver();
	obj.add(2, 3);
	obj.add(4,6 , 8);*/
	System.out.println("addition of a and b are :"+methodOver.add(2,3));
	System.out.println("addition of a and b  and c are :"+methodOver.add(2,3,5));
}

}
