package superPackage;

public class dogForMethod extends inheritImmediateParentClassMethod {
	void sum()
	{
		System.out.println("hlo niveda");
	}
	void chandu()
	{
		System.out.println("hi chandu");
	}
	void prathyusha()
	{
		super.sum();
		chandu();
		
	}

}
