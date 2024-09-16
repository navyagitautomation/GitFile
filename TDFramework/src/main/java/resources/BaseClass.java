package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	// Step2
	public WebDriver driver;
	public Properties prop;
	// step 3
	public Properties propertiesClass() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\bhask\\eclipse-workspace\\TDFramework\\src\\main\\java\\resources\\data.properties");
	
		prop.load(fis);
		
		return prop;
	
	}
	//step 4
	public WebDriver initializeBrowser() throws IOException
	{
		prop=propertiesClass();
		String browsername=prop.getProperty("browser");
		
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
			System.out.println("browser= Chrome");
		}
		else if(browsername.equals("firefox"))
		{
			driver=new FirefoxDriver();
			System.out.println("browser= firefox");
		}
		else if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
			System.out.println("EDGE");
		}
		
		// step 5
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
