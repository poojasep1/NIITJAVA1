package Generics;

public class Genericclass<E> {
	E obj;
	public void add(E obj)
	{
		this.obj=obj;
		
	}
	E get() {
return obj;	}

}
