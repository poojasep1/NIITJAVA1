package JavaAssignment1;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		/*polindrome means if if we reverse the string also the same string
		need to encounter*/
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		//reading input dynamically
String s1="";
for(int i=input.length()-1;i>=0;i--)
{
	//adding string  to s1 from input
	s1+=input.charAt(i);
}
if(input.contentEquals(s1)) {
	System.out.println("polindrome");
}
else {
	System.out.println("Not Polindrome");
}
	}

}
