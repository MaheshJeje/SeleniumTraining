package datadriventest_2;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;



public class TestCase01 {
	@Test
	@Parameters({"author","searchkey"})
	public void testXMLParameter(String Author, String Searchkey) {
		System.out.println(Author);
		System.out.println(Searchkey);
	}

}
