package lamdaexpressions.collections;

public class Comparator implements java.util.Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		/*if (o1<o2) return -1;//if we want o1 to come before o2 return -ve value
		else if(o1>o2)return 1;//if we want 02 before 0o1 return +ve number
		else return 0;//if o1 a o2 are equal*/
		return(o1<o2)?-1:(o1>o2)?1:0;// we can write all the three lines above in single byusing ternary operator
		//lamda expression for above code is
		//(o1,o2)->(o1<o2)?-1:(o1>o2)?1:0;
		
	}
	

}
