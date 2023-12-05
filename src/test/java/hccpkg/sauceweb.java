package hccpkg;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class sauceweb {

	public void f() throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriver webdriver;

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class='inventory_list\']/div"));
		System.out.print(webelements);

		driver.navigate().to("https://nxtgenaiacademy.com/multiplewindows/");
		String windowhandle = driver.getWindowHandle();
		System.out.print(windowhandle);
		driver.findElement(
				By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/section[3]/div/div[1]/div/div/div/center/button"))
				.click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,992)", "");

		// JavascriptExecutor js1 = (JavascriptExecutor) driver;
		// js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}
