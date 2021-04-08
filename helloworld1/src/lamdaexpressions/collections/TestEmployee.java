package lamdaexpressions.collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class TestEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("vasanthi",1234));
		employees.add(new Employee("aruna",2345));
		employees.add(new Employee("prathyusha",7890));
		employees.add(new Employee("chandu",5678));
		employees.add(new Employee("pooja",4567));
		System.out.println("before sorting:");
		System.out.println(employees);
		//sort the employees based on their eid in ascending order
		System.out.println("sorting based on eid:");
    Comparator<Employee> c = (e1,e2) -> (e1.eid < e2.eid)? -1 :(e1.eid > e2.eid)? 1 :0;
    Collections.sort(employees,c);
	//new EmployeeComparator());
System.out.println(employees);
    //sorting based on name
System.out.println("sorting based on name:");
    Comparator <Employee> n =(e1,e2)->e1.name.compareTo(e2.name);
    Collections.sort(employees,n);
    System.out.println(employees);
		
		// TODO Auto-generated method stub

	}

}
