package java;

import org.testng.annotations.Test;

public class PS1 extends PS3{
	
	@Test
	public void testRun() {
		//int a = 3;
		PS2 ps2 = new PS2(3);
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		System.out.println(ps2.multilyTwo());
		System.out.println(ps2.multilyThree());
	}
}