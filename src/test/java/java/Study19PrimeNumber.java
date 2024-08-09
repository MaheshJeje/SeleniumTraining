package java;

public class Study19PrimeNumber {

	public static void main(String[] args) {
		int remainder;
		boolean isPrime = true;
		
		int numberToCheck;
		
		for(numberToCheck = 1; numberToCheck <=100; numberToCheck++) {	
			for(int i=2; i<=numberToCheck/2; i++) {
				remainder = numberToCheck % i;
				
				if(remainder == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime==true)
				System.out.println(numberToCheck+" : No. is prime... ");
			else 
				System.out.println(numberToCheck+" : No. is not prime...");
		}	
	}
}