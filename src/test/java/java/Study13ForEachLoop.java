package java;

public class Study13ForEachLoop {

	public static void main(String[] args) {
		String data[] = {"Alpha","Beta","Gamma","Delta","Sigma"};
		
		//The traditional approach of using For loop :
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]+"\t");
		}
		System.out.println();
		//The optimized approach of using For loop :
		for(String temp : data) {
			System.out.print(temp+"\t");
		}
		
	}
}