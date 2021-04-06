package Generics;

import java.util.ArrayList;

public class Typesafety {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] students=new String[3];
		students[0]="pooja";
		//students[1]=10;
		ArrayList studentsList =new ArrayList();
		studentsList.add("pooja");
		studentsList.add(new Integer(10));
		System.out.println(studentsList);
		String name=(String)studentsList.get(1);
		System.out.println(studentsList.get(0));
		System.out.println(name);
		// error because typesafety is not present in collections so we are going for generics
		//these is example of need to generic 
		//to over these problem we are moving to generics
		

	}

}
