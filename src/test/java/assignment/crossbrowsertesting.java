package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class crossbrowsertesting {

 
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String browser)
	{
		switch(browser.toLowerCase())
		{
		case"chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		
		
		case"msedge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;
		
		default:
			driver = null;
			break;
		
		}
	}
	@Test
	public void verifyTitle()
	{
		driver.get("https://www.google.com/");
		String expectedTitle = "Google";
		
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	@AfterMethod
	public void Quit()
	{
		driver.quit();
	}
}
