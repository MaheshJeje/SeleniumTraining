package java;

public class Study05CompareString {
	
	public static boolean compareTwoString(String str1, String str2) {
		int str1Lenght= str1.length();
		int str2Length= str2.length();
		
		if(str1Lenght!=str2Length){
			return false;
		}
		else {
			for(int i=0; i<str1Lenght; i++) {
				if(str1.charAt(i)!=str2.charAt(i)) {
					return false;
				}
				else {
					return true;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(compareTwoString("Mahesh", "Mahesh"));
	}
}