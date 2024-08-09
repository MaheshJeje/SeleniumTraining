package java;

import org.testng.annotations.Test;

public class PS4 {
	int a;
	
	public PS4(int a) {
		this.a=a;
	}

	@Test
	public int multilyTwo() {
		a=a*2;
		return a;
	}
	
	@Test
	public int multilyThree() {
		a=a*3;
		return a;
	}
}