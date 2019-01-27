package WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertTrue; 

public class TC_101_VerifyLogin {
	public static void main(String args[]) throws Exception{
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Teja\\Selenium_Student_SW\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		//open application
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(3000);
		//Verify Title
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
		}
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
		}
		Thread.sleep(3000);
		//Text verification
		assertTrue(driver.findElement(By.xpath("//ul[@id='option-menu']/li")).getText().matches("Welcome admin"));
		Thread.sleep(3000); 
		//logout
		driver.findElement(By.linkText("Logout")).click();
		//Close application
		driver.close();
	}

}
