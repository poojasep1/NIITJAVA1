package JavaAssignment1;

public class MinMaxElements {

	public static void main(String[] args) {
		
			 
			 //reading array of numbers statically
			 int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
			 
			 //assigning first element of an array to largest and smallest
			 int smallest = arr[0];
			 int largest = arr[0];
			 
			 for(int i=1; i< arr.length; i++)
			 {
			 if(arr[i] > largest)
			 largest = arr[i];
			 else if (arr[i] < smallest)
			 smallest = arr[i];
			 
			 }
			 System.out.println("Smallest Number is : " + smallest);
			 System.out.println("Largest Number is : " + largest); 
			 }
			

	}


