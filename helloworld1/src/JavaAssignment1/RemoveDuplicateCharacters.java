package JavaAssignment1;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {
		
		
		//reading string statically
String s="pooja";
char arr[]=s.toCharArray();
String output="";
for(char i:arr) {
	if(output.indexOf(i)==-1) {
		output+=i;
	}
}
//print elemetnts after removing duplicating characters
System.out.println("String after removing duplicate elements"+output);
         }

}
