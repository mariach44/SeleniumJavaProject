package assignment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//with page factory
public class login2 {
	 WebDriver driver;
	 //constrctor
	 login2(WebDriver d)
	 {
		 driver = d;
		 //this method will create web element
		 PageFactory.initElements(driver, this);
	 }
	 
	 //identify web element
	 
	@FindBy(id="user-name")
		WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login-button")
	WebElement loginBtn;
	public void enterUsername(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}
	 
	

}
