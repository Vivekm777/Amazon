package automationcore;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public WebDriver driver;
	public WebDriver browserIntialization(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			
			driver=new FirefoxDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			
			
			driver=new EdgeDriver();
		}
    driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	return driver;
	}
	

}
