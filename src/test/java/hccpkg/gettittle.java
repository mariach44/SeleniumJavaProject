package hccpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class gettittle {

	public void f() throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriver webdriver;
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.orangehrm.com/");
		String tittle = driver.getTitle();
		System.out.println("this is the tittle" + tittle);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		
		//test element code
		
		WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div/div/section[1]/div[2]/div/div/div/h1"));
		System.out.print(element.getText());

	}

}
