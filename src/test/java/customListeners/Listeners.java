package customListeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	public void onTestFailure(ITestResult result) {
		
		Reporter.log("<a href=\"C:\\Users\\The God\\Downloads\\owl.jpg\" target=\"_blank\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\Users\\The God\\Downloads\\owl.jpg\" target=\"_blank\"><img height=200 width=200 src=\"C:\\Users\\The God\\Downloads\\owl.jpg\"></a>");
		
		System.out.println("Capturing Screenshot for the Failed test -- "+result.getName());
	}
	
	public void onTestSucces(ITestResult result) {
		System.out.println("Passed Test - "+result.getName());
	}
	
}
