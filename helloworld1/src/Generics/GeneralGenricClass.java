package Generics;

public class GeneralGenricClass<T> {
	T ob;
	public GeneralGenricClass( T ob) {
		this.ob=ob;
	}
	public void show()
	{
		System.out.println("the type of the class is ");
	}
	public T getob() {
		return ob;
	}

}
