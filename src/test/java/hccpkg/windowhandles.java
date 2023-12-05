package hccpkg;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class windowhandles {

	public void f() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver webdrover;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String ParentHandle =	driver.getWindowHandle();
	      System.out.println("parent window -"+ParentHandle);
	      Thread.sleep(2000);
	      
	      driver.findElement(By.id("newWindowBtn")).click();
	      Set<String>handles = driver.getWindowHandles();
	      for(String String : handles);
	      System.out.println(handles);
	      driver.close();
		
		
		

	}

}
