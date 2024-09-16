package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TdHome {
	
	// step 8
	WebDriver driver;
	
	public TdHome(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By logo=By.xpath("//*[@id=\"container-12ee37eb01\"]/div[2]/div/div/div[1]/div/a/img");
	By smallBusiness=By.xpath("//a[text()='Small Business']");
	By login=By.xpath("//*[@id=\"button-37fbca6eb5\"]/span[2]");
	
	public WebElement logo()
	{return driver.findElement(logo);
			
	}
	public WebElement smallBusiness()
	{
		return driver.findElement(smallBusiness);
			
	}
	public WebElement login()
	{
		return driver.findElement(login);
			
	}

}
