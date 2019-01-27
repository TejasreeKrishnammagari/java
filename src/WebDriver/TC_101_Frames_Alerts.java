package WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
public class TC_101_Frames_Alerts {
	public static String username="admin";
	public static String password="admin";
	
public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver", "D:\\Testing_Teja\\Selenium_Student_SW\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	Thread.sleep(3000);
	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
		System.out.println("Title matched");
	}
	else {
		System.out.println("Title not matched");
	}
	Thread.sleep(3000);
	//username text verification
	assertTrue(driver.findElement(By.xpath("//table[@id='Table_01']/tbody/tr/td[2]/table/tbody/tr[2]/td[1]")).getText().matches("Login Name :"));
	System.out.println("Verified text of Username");
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(username);
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	//Handling alerts
	Alert al=driver.switchTo().alert();
	System.out.println(al.getText());
	al.accept();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='clear']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(username);
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
	//Explicit wait for login button
	WebDriverWait wait=new WebDriverWait(driver, 15);
	wait.until(ExpectedConditions.elementToBeClickable(By.name("Submit")));
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	//Title verifying
	if(driver.getTitle().equals("")) {
		System.out.println("Title matched");
	}
	else {
		System.out.println("Title not matched");
	}
	Thread.sleep(3000);
	//navigate to pim
	Actions ac=new Actions(driver);
	WebElement pim=driver.findElement(By.linkText("PIM"));
	ac.moveToElement(pim).perform();
	System.out.println("Navigated on pim menu");
	driver.findElement(By.linkText("Add Employee")).click();
	Thread.sleep(3000);
	//Entered into frame
	driver.switchTo().frame("rightMenu");
	driver.findElement(By.name("txtEmpLastName")).sendKeys("Selenium");
	Thread.sleep(3000);
	driver.findElement(By.name("txtEmpFirstName")).sendKeys("Suresh");
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	//Print emp code
	String empid=driver.findElement(By.name("txtEmployeeId")).getAttribute("value");
	System.out.println(empid);
	Thread.sleep(3000);
	//FileUpload
	WebElement fileInput=driver.findElement(By.name("photofile"));
	fileInput.sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='Save']")).click();
	driver.switchTo().defaultContent();//Exit from frame
	Thread.sleep(3000);
	//logout
	driver.findElement(By.linkText("Logout")).click();
	Thread.sleep(3000);
	//Close application
	driver.close();
	
	
	
	
	
	
	
	
}
}
