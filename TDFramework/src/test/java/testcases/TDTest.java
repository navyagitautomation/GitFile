package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TDLogin;
import pageObjects.TdHome;
import resources.BaseClass;

// step 6
public class TDTest  extends BaseClass{
	
	// step 7
	@Test
	public void BaseNavigation() throws IOException
	{
		driver=initializeBrowser();
		prop=propertiesClass();
		
		// launch url
		
		driver.get(prop.getProperty("url"));
		
		// Step 9
		
		TdHome th=new TdHome(driver);
		Assert.assertTrue(th.logo().isDisplayed());//true
		
		System.out.println("Logo displayed");
		
		Assert.assertTrue(th.smallBusiness().isDisplayed());
		System.out.println("small business header displayed");   
		
		// to verify login is displayed
		
		Assert.assertTrue(th.login().isDisplayed());
		System.out.println("Login displayed");
		
		// click on login
		
		th.login().click();
		
		// to call methods in TDLogin page
		
		TDLogin tl=new TDLogin(driver);
		
		tl.username().sendKeys("NAvya");
		tl.pwd().sendKeys("677");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
