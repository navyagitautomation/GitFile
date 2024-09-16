package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.BaseClass;

//step 10
public class Listeners  extends BaseClass implements ITestListener {

	WebDriver driver;
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test case failed");
		
		//String TestmethodName=result.getMethod().getMethodName();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(src, new File("C:\\Users\\bhask\\Screenshot2\\image2.png"));
			
		
		} catch (ArithmeticException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 
		}
		
	
	}

}
