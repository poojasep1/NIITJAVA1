package Generics;

import java.util.ArrayList;

public class CollectionToGenericsConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] students=new String[3];
students[0]="pooja";
students[1]="chandu";
 String name=students[0];//no need to typecaste
 ArrayList<String> StudentsList=new ArrayList<String>();
 StudentsList.add("vasan");
 System.out.println(StudentsList);
 String name1=StudentsList.get(1);//no need to typecaste
 System.out.println(name1);
	}

}
