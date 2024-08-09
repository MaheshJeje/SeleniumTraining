package java;

public class Study21FibonacciSr {

	public static void main(String[] args) {
		int previousNumber = 0;
		int nextNumber = 1;
		int maxNumber = 20;
		
		for(int i=0; i<=maxNumber; i++)
		{
			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
			
			System.out.print(sum+"\t");
		}
	}
}