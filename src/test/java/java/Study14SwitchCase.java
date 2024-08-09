package java;

public class Study14SwitchCase {

	public static void main(String[] args) {
	String no = "Two";
	switch (no) {
	case "One":
		System.out.println("One");
		break;

	case "Two":
		System.out.println("Two");
		break;
		
	case "Three":
		System.out.println("Three");
		break;
		
	case "Four":
		System.out.println("Four");
		break;
		
	case "Five":
		System.out.println("Five");
		break;
		
	default:
			System.out.println("Not in the list...");
			break;
	}
  }
}
