package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//without page factory
public class loginwithpagefactory {
	
	WebDriver driver;
	//constructor
	loginwithpagefactory(WebDriver d)
	{
		driver = d;
	}
	
	//webelementlocate
	
	By username = By.id("user-name");
	By password = By.id("password");
	By loginbtn = By.id("login-button");
	//By addtocard = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button");
	
	//findnowbyusingmethod
	
	public void enterUsername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLoginBtn()
	{
		driver.findElement(loginbtn).click();
	}
	
	public void Addtoocard() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]"));
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")).click();
	}
	
	
	
	
	

}
