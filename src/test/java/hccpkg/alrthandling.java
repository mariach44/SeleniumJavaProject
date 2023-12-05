package hccpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class alrthandling {

	public void f() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver webdrover;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[1]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept(); //OK
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss(); //cancel
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button")).click();
		Thread.sleep(2000);
		Alert alertwindow = driver.switchTo().alert();
		System.out.println("This message displayed on alert"+alertwindow.getText());
		alertwindow.sendKeys("The alert msg");
		alertwindow.accept();	
		
		
		
	}

}
