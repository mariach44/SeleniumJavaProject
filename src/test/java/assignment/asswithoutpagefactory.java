package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class asswithoutpagefactory {

	public void f() throws InterruptedException {
		
		WebDriver webdriver;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		//driver.quit();		
		 
		List<WebElement> addToCartButtons = driver.findElements(By.className("btn_inventory"));
        for (WebElement button : addToCartButtons) {
            button.click();
        }
		
		WebElement element = driver.findElement(By.className("shopping_cart_container"));
		element.click();
		
		
		WebElement filterDropdown = driver.findElement(By.className("product_sort_container"));
        filterDropdown.click();
        
        WebElement filterOption = driver.findElement(By.xpath("//option[@value='lohi']"));
        filterOption.click();
        driver.quit();        
        
		
	
}
}
