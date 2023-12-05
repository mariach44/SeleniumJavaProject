package hccpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class hccclass {

	//public static String browser = "chrome"; // External configuration - XLS, CSV
	//public static WebDriver driver;

	public void f() throws InterruptedException {
		// TODO Auto-generated method stub

		//if (browser.equals("Firefox")) {
			//WebDriverManager.firefoxdriver().setup();
			//driver = new FirefoxDriver();
			// WebDriver webdriver;

	//	} //else if (browser.equals("chrome")) {
			//WebDriverManager.chromedriver().setup();
			//WebDriver driver = new ChromeDriver();
			// WebDriver webdriver;
		//}
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriver webdriver;

		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input[3]")).click();
		driver.close();

	}

}
