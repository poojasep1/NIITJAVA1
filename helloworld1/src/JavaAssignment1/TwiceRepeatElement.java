package JavaAssignment1;

public class TwiceRepeatElement {
	
	void RepeatedElements(int array[],int size) {
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				//comparing elements in an array
				if(array[i]==array[j]) {
					//if equal print that element
					System.out.println(array[i]);
				}
			}
		}
	}
	
	

}
