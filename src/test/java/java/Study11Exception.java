package java;

public class Study11Exception {

	public static void main(String[] args) {
		try {
			int d = 0;
			int n = 20;
			int fraction = n/d;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("In the catch block due to exception : "+e);
		}
		finally {
			System.out.println("In a finally block...");
		}

		System.out.println("End of Main...");
	}
}