package testcases;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class TestCase2 extends BaseTest{

	
	@Test(groups="smoke")
	public void validateTitles() {
		
		System.out.println("Beginning");
		String expected_title = "Yahoo.com";
		String actual_title = "Gmail.com";
				
		SoftAssert softAssert = new SoftAssert();
		
		System.out.print("Validating title");
		softAssert.assertEquals(actual_title, expected_title);
		
		System.out.println("Validating image");
		softAssert.assertEquals(true, false, "image not present");
		
		System.out.println("validate text box presence");
		softAssert.assertEquals(true, false,"test box not present");
		
		System.out.println("Ending");
		
		softAssert.assertAll();
	}
	
}
