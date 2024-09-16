package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrshot {
	
	
	@Test
	public void srshot() throws IOException
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.td.com/us/en/personal-banking");
		
		
	
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\bhask\\Screenshot2\\imag2.png"));
	}

}
