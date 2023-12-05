package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class logintest {

	public void f() throws InterruptedException {
		// TODO Auto-generated method stu


		//WebDriver webdriver;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
		loginwithpagefactory lg = new loginwithpagefactory(driver);  //callwithoutpagefactorycall
		//login2 lg = new login2(driver);
		driver.get("https://www.google.com/");
		
	
		driver.navigate().to("https://www.saucedemo.com/v1/");
		lg.enterUsername("standard_user");
		lg.enterPassword("secret_sauce");
		lg.clickOnLoginBtn();
		lg.Addtoocard();
	}

}
