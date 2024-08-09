package java;

import java.util.ArrayList;

public class Study25ArrayList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Mahesh");
		names.add("Jejurkar");
		names.add("Engineer");
		names.add("Pune");

		System.out.println(names);
		
		System.out.println("For loop : ");
		for(String n : names) {
			System.out.println(n);
		}
		
		System.out.println("For each loop : ");
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("Printing single element : ");
		System.out.println(names.get(1));
		System.out.println(names.contains("Engineer"));
	}
}