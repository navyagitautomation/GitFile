package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {

	@Test
	public void assertionClass()
	{
		//WebDriver driver =new ChromeDriver();
		//driver.get("https://www.td.com/us/en/personal-banking");
		
		//String title=driver.getTitle();//
		//System.out.println(title);
		
		
		
		
		SoftAssert softassert=new SoftAssert();
		
		String title="TD Bank";
		String extitle="TD  online Bank";
		
		
		
		softassert.assertTrue(title.equals(extitle));
		System.out.println(" soft assertion passed");
		softassert.assertAll();
		
		
		
		
		/*String actualtitle=driver.getTitle();
	    System.out.println(actualtitle);
		String expectedtitle="Online Banking, Loans";
		
		Assert.assertTrue(actualtitle.equals(expectedtitle));//fail
		
				
	/*	
		// soft assertion or verify
		
		SoftAssert softassert=new SoftAssert();
		softassert.assertTrue(actualtitle.equals(expectedtitle));
		softassert.assertFalse(true);
		
		System.out.println("Assertion passed");
		*///
		
	
	}
	
	
	
}
