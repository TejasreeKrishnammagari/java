package WebDriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertTrue;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class TC_101_Robotclass_Dropdown {
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
		assertTrue(driver.findElement(By.xpath("//*[@id=\'Table_01\']/tbody/tr[1]/td[2]/table/tbody/tr[3]/td[1]")).getText().matches("Password :"));
		System.out.println("Varified password label");
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		//Alert
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='clear']")).click();
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		//Enter tab and type password using robot class
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		//Navigation on admin
		Actions ac=new Actions(driver);
		WebElement element=driver.findElement(By.linkText("Admin"));
		ac.moveToElement(element).perform();
		System.out.println("Mouse overed on admin tab");
		Thread.sleep(3000);
		//navigation on data import/export
		WebElement data=driver.findElement(By.linkText("Data Import/Export"));
		ac.moveToElement(data).perform();
		//Click on export
		driver.findElement(By.linkText("Export")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("rightMenu");
		//Select any value from dropdown
		Select drpdwn=new Select(driver.findElement(By.id("cmbExportType")));
		drpdwn.selectByVisibleText("Millenium Payroll Export (+)");
		Thread.sleep(3000);
		driver.findElement(By.id("btnExport")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		//Click save or ok button from download popup
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);;
		r.keyRelease(KeyEvent.VK_S);		
		Thread.sleep(2000);
		//Open new tab
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_S);
		Thread.sleep(3000);
		//Close current window or tab
		
		//logout
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		//Close application
		driver.quit();
		
		
		
	
		
		
	}
}
