import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//reading input dynamically
		String s=sc.nextLine();
		String reverse="";
		for(int i=s.length()-1;i>=0;i--)
			reverse+=s.charAt(i);
				if(s.equals(reverse))
					System.out.println("string is polindrome");
				else
					System.out.println("not polindrome");		
		}

	}


