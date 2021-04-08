package lamdaexpressions.collections;

import java.util.ArrayList;

public class TestEmployee {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("vasanthi",1234));
		employees.add(new Employee("aruna",2345));
		employees.add(new Employee("prathyusha",7890));
		employees.add(new Employee("chandu",5678));
		employees.add(new Employee("pooja",4567));
		
		System.out.println(employees);
		//sort the employees based on their eid in ascending order
		// TODO Auto-generated method stub

	}

}
