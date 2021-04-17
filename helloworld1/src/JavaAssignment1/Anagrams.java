package JavaAssignment1;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// Reading two strings statically
		String s1="pooja";
		String s2="vasan";
		//Comparing length of two strings
		if(s1.length()==s2.length()) {
			char[] str1=s1.toCharArray();
			char[] str2=s2.toCharArray();
			//sorting elements in each character in  two strings
			Arrays.sort(str1);
			Arrays.sort(str2);
		//if elements in two strings are equals then anagrams
		
		if(Arrays.equals(str1,str2)==true){
			System.out.println("Anagrams");
		}
		else {
			//if characters are not equals then not anagrams
			System.out.println("Not Anagrams");
		}

	}

}
}