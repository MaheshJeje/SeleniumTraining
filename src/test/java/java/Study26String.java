package java;

import java.util.List;

public class Study26String {

	public static void main(String[] args) {
		String name1 = new String("Mahesh");
		String name2 = new String("Jejurkar");
		String name3 = new String("Pune");
		
		String s = new String ("Mahesh Jejurkar Engineer");
		System.out.println(s);
		
		String[] newString = s.split(" ");
		for(int i=0; i<newString.length; i++) {
			System.out.println(newString[i]);
		}
		
		String[] newString2 = s.split("Jejurkar");
		System.out.println(newString2[0]);
		System.out.println(newString2[1]);
		
		for(int i=s.length()-1; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
	}

}
