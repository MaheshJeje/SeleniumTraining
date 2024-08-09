package datadriventest_3;

import org.testng.annotations.*;

public class TestCase01 {

	@Test(dataProvider = "SearchProvider", dataProviderClass = datadriventest_3.DataProviderClass.class)
	public void testMethodA(String firstName, String lastName, String loc, String degree) {
		System.out.println(firstName+" "+lastName+" "+loc+" "+degree);
	}	
	
	@Test(dataProvider = "SearchProvider", dataProviderClass = datadriventest_3.DataProviderClass.class)
	public void testMethodB(String Name) {
		System.out.println(Name);
	}
}