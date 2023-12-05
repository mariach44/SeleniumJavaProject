package finalpaper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class formtesting {

	public <Webdriver> void f() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriver webdriver;
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.get("https://demoqa.com/automation-practice-form");
		
	
		//name test
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.id("firstName")).sendKeys("maryam");
				driver.findElement(By.id("lastName")).sendKeys("zia");
				driver.findElement(By.id("userEmail")).sendKeys("maryamzia@gmail.com");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[3]/div[2]/div[2]")).click();
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.findElement(By.id("userNumber")).sendKeys("03097456271");
		
				//Date of birth
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				WebElement dateinput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[1]/div/input"));
				dateinput.clear();
				String newDate = "13 Sep 2000";
				dateinput.clear();
				dateinput.sendKeys(newDate);
				

				//check box
								driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
								WebElement element = driver.findElement(By.id("hobbies-checkbox-2 "));
								((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
								element.click();


				//subjects                    
								driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
								driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]/div[2]/div/input")).sendKeys("Computer Science");
								driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]/div[1]/div[1]")).click();
								
				
				
				//download
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[8]/div[2]/div/input")).sendKeys("C:\\Users\\lenovo\\Downloads\\logo3.png");
				
				//area text
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[9]/div[2]/textarea")).sendKeys("Hello I'm maryan");
				
				//dropdown state
				WebElement ddrop = driver.findElement(By.className(" css-tlfecz-indicatorContainer"));
				Select select = new Select(ddrop);
				select.selectByIndex(2);
				
				//dropdown of city
				WebElement ddrop2 = driver.findElement(By.className("   css-1wa3eu0-placeholder"));
				Select select1 = new Select(ddrop2);
				select1.selectByIndex(2);
				
				//submit
				driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[11]/div/button")).click();

			
				
				
				//

	}

}
