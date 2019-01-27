 package WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_101_Verification_Mouseover {
	public static String username="admin";
	public static String password="admin";
	public static void main(String args[]) throws Exception{
		System.setProperty("webdriver.chrome.driver","D:\\Testing_Teja\\Selenium_Student_SW\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(3000);
		//Verify Title
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
		}
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login Completed");
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
		}
		Thread.sleep(3000);
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
		//logout
		driver.findElement(By.linkText("Logout")).click();
		//Close application
		driver.close();
		
		   
		
		
		
		
		
	}
}
