package First_Testcase;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Create_Account_Successfully{
	WebDriver driver;
	WebDriverWait wait;
	String testURL = "http://automationpractice.com/index.php";

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(testURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void CREATE_ACCOUNT() {
		// Click to Sign in
		WebElement LOGIN = driver.findElement(By.xpath("//a[@class='login']"));
		// wait.until(ExpectedConditions.visibilityOf(LOGIN));
		LOGIN.click();
		WebElement EMAIL_CREATE = driver.findElement(By.xpath("//input[@id='email_create']"));
		EMAIL_CREATE.clear();
		EMAIL_CREATE.sendKeys("abc123@gmail.com");
		WebElement CREATE_AN_ACCOUNT_BTN = driver.findElement(By.xpath("//button[@id='SubmitCreate']"));
		CREATE_AN_ACCOUNT_BTN.click();
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
