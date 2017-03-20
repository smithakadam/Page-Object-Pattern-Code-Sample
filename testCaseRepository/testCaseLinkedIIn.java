package testCaseRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectsRepository.signInPage;

public class testCaseLinkedIIn {

	public static WebDriver driver;

	@Test
	public void testCases() {
		System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		
		signInPage sp = new signInPage(driver);
		sp.EmailId().sendKeys("sednhi");
		sp.Password().sendKeys("hswavb");
		sp.SignIn().click();
		
	}
}
