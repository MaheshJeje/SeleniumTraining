package datadriventest_3;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;

public class DataProviderClass {
	
	@DataProvider(name = "SearchProvider")
	public Object[][] getDataFromDataprovider(Method m){
		if(m.getName().equalsIgnoreCase("testMethodA")) {
		return new Object[][]
		{
			{"Mahesh","Jejurkar","Pune", "MS"},
			{"Dhruv", "Jejurkar", "Loni", "CD"},
			{"Purva", "Jejurkar", "Mumbai", "BF"}
		};}
		else {
			return new Object[][] {
				{"Canada"},
				{"Russia"},
				{"Japan"}
			};}
	}
}
