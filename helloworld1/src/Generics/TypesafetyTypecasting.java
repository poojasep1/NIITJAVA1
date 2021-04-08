package Generics;

import java.util.ArrayList;

import java.util.Iterator;

public class TypesafetyTypecasting {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); 
			
		list.add("pooja");
		list.add("chandu");
		String str=list.get(1);
		System.out.println(str);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
