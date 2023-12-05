package hccpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class dropdwn {

	public void f() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriver webdriver;
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		driver.manage().window().maximize();
		
		WebElement ddrop = driver.findElement(By.className("product_sort_container"));
		Select select = new Select(ddrop);
		
		//select.selectByValue("lohi");
		//select.selectByVisibleText("Price (low to high)");
		select.selectByIndex(2);
		
		
		
		
		
		
	
	}

}
