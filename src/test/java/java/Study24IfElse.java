package java;

public class Study24IfElse {

	public static void main(String[] args) {
		int no[] = {2,4,6,8,2,1,3,4,43,465,4424};
		
		for(int n : no) {
			if(n%2==0) {
				System.out.println("Even no. : "+n);
			}
			else {
				System.out.println("Odd no. : "+n);
			}
		}
	}
}