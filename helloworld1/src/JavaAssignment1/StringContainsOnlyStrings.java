package JavaAssignment1;

public class StringContainsOnlyStrings {
	public static boolean	isAllDigits(String str) {
		for(int i=0; i<str.length() ;i++) {
			//comparing string contains digits are not
			//if yes it print true otherwise false
			if(Character.isDigit(str.charAt(i))) {
				i++;
			}
			else 
				return false;
		}
		return true;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAllDigits("12345678"));
	}
}

