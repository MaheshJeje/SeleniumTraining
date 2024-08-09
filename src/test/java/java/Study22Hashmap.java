package java;

import java.util.HashMap;

public class Study22Hashmap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "One@One");
		hm.put(2, "Two@Two");
		hm.put(3, "Three@Three");
		hm.put(4, "Four@Four");
		hm.put(5, "Five@Five");
		hm.put(6, "Six@Six");
		hm.put(7, "Seven@Seven");
		hm.put(8, "Eight@Eight");
		hm.put(9, "Nine@Nine");
		hm.put(10, "Ten@Ten");
		
		System.out.println(hm.size()+"\n");
		
		for(int i=1; i<=10; i++) {
			String hmdata = hm.get(i);
			String hmdataArray []= hmdata.split("@");
			
			System.out.print(hmdataArray[0]+"\t");
			System.out.println(hmdataArray[1]);
		}
	}
}