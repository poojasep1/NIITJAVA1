package JavaAssignment1;

public class MainTwiceRepeat {

	public static void main(String[] args) {
		//reading elements into an array statically
		int arr[]= {1,2,3,2,4,5};
		int array_size=arr.length;
		TwiceRepeatElement repeat=new TwiceRepeatElement();
		repeat.RepeatedElements(arr,array_size);
		

	}

}
