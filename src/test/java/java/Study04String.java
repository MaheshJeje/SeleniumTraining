package java;

public class Study04String {
	public static void main(String s[]) {
		String str1 = "rock";
		String str2 = "Star";
		
		System.out.println(str1.concat(str2));
		String str3 = str1 + str2;
		System.out.println(str3);
		
		System.out.println(str3.length());
		System.out.println(str3.charAt(3));
		System.out.println(str3.indexOf("S"));
		
		System.out.println(str3.contains("tar"));
		System.out.println(str3.endsWith("t"));
		System.out.println(str3.startsWith("Rock"));
		System.out.println(str3.replaceAll("r","a"));
		
		String strTest = "99";
		int iTest = Integer.valueOf(strTest);
		System.out.println(iTest);
	}
}