package JavaAssignment1;

public class firstNonRepeatedElement {

	public static void main(String[] args) {
		//printing first non repeating character to string
		String input="pooja";
		for(int i=0;i<input.length();i++) {
			boolean nonRepeated=true;
			for(int j=0;j<input.length();j++) {
				if(i!=j && input.charAt(i)==input.charAt(j)) {
					nonRepeated=false;
					break;
				}
			}
			if(nonRepeated==true) {
				System.out.println("Non repeated first character is: "+input.charAt(i));
				break;
			}
		}

	}

}
