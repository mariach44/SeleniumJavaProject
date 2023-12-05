package hccpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class assign2 {

	public <Webdriver> void f() throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriver webdriver;
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.get("https://demoqa.com/elements");
		
		
		//textbox check
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]")).click();
		//driver.findElement(By.id("userName")).sendKeys("maryam");
		//driver.findElement(By.id("userEmail")).sendKeys("maryamzia@gmail.com");
		//driver.findElement(By.id("currentAddress")).sendKeys("111Ublockfaridtown");
		//driver.findElement(By.id("permanentAddress")).sendKeys("168Wblockfaridtown");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div/button")).click();
		
		//upload and download
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[8] "));
			//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
			//	element.click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/form/div/input")).sendKeys("C:\\Users\\lenovo\\Downloads\\045ab8a9-e9ea-4268-a17c-6c7cb803528b.jpg");
		
		//check box
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/button")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[1]/span/button")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("		/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]")).click();
		
		//radio button
		
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[3]")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/label")).click();
		
		//alerts button
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[2]/div[2] "));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		//element.click();
		
		
		//Browser Window
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[1] ")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/button ")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/button ")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")).click();
		
		//Alret
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[3]/div/ul/li[2] ")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/button")).click();
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		
		//On button click, alert will appear after 5 seconds
				//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/button")).click();
				//Thread.sleep(2000);
				//driver.switchTo().alert().accept(); 
		//On button click, confirm box will appear
				//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[2]/button")).click();
				//Thread.sleep(2000);
				//driver.switchTo().alert().dismiss();
				
		//On button click, prompt box will appea
		//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[4]/div[2]/button")).click();
		//Thread.sleep(2000);
		//Alert alertwindow = driver.switchTo().alert();
		//System.out.println("This message displayed on alert"+alertwindow.getText());
		//alertwindow.sendKeys("The alert msg");
	//	alertwindow.accept();	
		
		//Date Picker
				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		WebElement element1 = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/span/div/div[2]/div[2] "));
		element1.click();
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,980)");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[4]/div/ul/li[3]")).click();
		    
		//Date picker
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement dateinput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div/input"));
		dateinput.clear();
		String newDate = "11/09/2022";
		dateinput.clear();
		dateinput.sendKeys(newDate);
		
		//DateandTime
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement timeinput = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/input"));
		timeinput.clear();
		String newTime = "August 09, 2020 15:06 PM";
		timeinput.clear();
		timeinput.sendKeys(newTime);
		

	}

}
