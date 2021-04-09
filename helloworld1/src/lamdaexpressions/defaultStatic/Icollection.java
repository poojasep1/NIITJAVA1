package lamdaexpressions.defaultStatic;

public interface Icollection {
	void add();
	void remove();
	default void append() {System.out.println("welcome to append");}
	default void removeAll() {System.out.println("welcome to removeall");}

}
