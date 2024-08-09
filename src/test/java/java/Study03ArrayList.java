package java;

import java.util.ArrayList;

public class Study03ArrayList {

	public static void main(String[] args) {
		ArrayList<String> at = new ArrayList<String>();
		System.out.println(at.size()+" => "+at);
		at.add("M");
		at.add("A");
		at.add("H");
		at.add("E");
		at.add("S");
		at.add("H");

		
		System.out.println(at.size()+" => "+at);
		
		at.remove(1);
		System.out.println(at.size()+" => "+at);
		
		at.remove("H");
		System.out.println(at.size()+" => "+at);
		
		at.remove("H");
		System.out.println(at.size()+" => "+at);
		
		at.remove("1");
		System.out.println(at.size()+" => "+at);
		
		at.remove("K");
		System.out.println(at.size()+" => "+at);
	}
}