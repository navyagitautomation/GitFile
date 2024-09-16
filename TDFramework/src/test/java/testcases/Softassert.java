package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Softassert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.td.com/us/en/personal-banking");
		
		String actualtitle=driver.getTitle();
	//	System.out.println(title);
		String expectedtitle="Online Banking, Loans";
		
		//Assert.assertTrue(actualtitle.equals(expectedtitle));//fail
		
				
		
		// soft assertion or verify
		
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(actualtitle.equals(expectedtitle)); 
		softassert.assertFalse(true);
		
		
		System.out.println("Assertion passed");
		softassert.assertAll();
		
	}

}
