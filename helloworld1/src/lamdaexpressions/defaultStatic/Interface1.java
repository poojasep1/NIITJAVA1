package lamdaexpressions.defaultStatic;

public interface Interface1 {
	public void m1();
	public void m2();
	default public void m3()
	{
		System.out.println("these is default interface");
	}

}
