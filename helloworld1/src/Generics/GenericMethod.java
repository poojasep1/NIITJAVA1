package Generics;

public class GenericMethod {
	public static<E> void printValues(E[] elements) {
		for(E element:elements) {
			System.out.println(element);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		Integer[] intArray= {10,20,30,40,50	};
	
		String [] stringarray= {"pooja","vasan","chandu","prathyusha","anu"};
	System.out.println("printing array elements");
		printValues(intArray);
		System.out.println("printing string elements");
		printValues(stringarray);
		}
		
}
