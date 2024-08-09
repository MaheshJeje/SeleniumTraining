package java;

public class Study20StringToChar {

	public static void main(String[] args) {
		String str = "Mahesh";
		char charArray[] = new char[20]; 

		for(int i=0; i<str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		
		System.out.println(charArray);
		
		for(int i=str.length(); i>=0; i--) {
			System.out.print(charArray[i]);
		}
	}
}