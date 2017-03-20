package objectsRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signInPage {

	public static WebDriver driver;

	public signInPage(WebDriver driver) {
		this.driver=driver;
	}

	By username = By.xpath(".//*[@id='login-email']");
	By pswd = By.id("login-password");
	By signin = By.id("login-submit");
	
	public WebElement EmailId(){
		return driver.findElement(username);
	}
	
	public WebElement Password(){
		return driver.findElement(pswd);
	}
	
	public WebElement SignIn(){
		return driver.findElement(signin);
	} 
	
}
