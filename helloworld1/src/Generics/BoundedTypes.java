package Generics;

public class BoundedTypes<T extends Number & Runnable>{

T a,b;
		
		public BoundedTypes(T a ,T b){
			this.a = a;
			this.b = b;
		}
		public BoundedTypes(MyNumber myNumber, MyNumber myNumber2) {
			// TODO Auto-generated constructor stub
		}
		public void arithematicOperations() {
			System.out.println();
		}

}
