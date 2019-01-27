package WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverWithTestng {
	WebDriver driver;
	@BeforeClass
	public void startup() {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Teja\\Selenium_Student_SW\\Drivers\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	@Test(description="OrangeHRM")
	public void login() throws Exception {
		Reporter.log("Testcase Steps");
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		Reporter.log("1.Application opend");
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		Reporter.log("2.Typing user name");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		Reporter.log("3.Typing passwrod");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Reporter.log("4.Login completed");
		
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
