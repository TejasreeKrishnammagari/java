//Interface In Java 
package JavaExample;
interface WebDriver{
	public void get();
	public void close();
}
class FirefoxDriver implements WebDriver{
	public void get() {
		System.out.println("To open application in firefox driver");
	}
	public void close() {
		System.out.println("To close application in firefox driver");
	}
}
public class ChromeDriver implements WebDriver{
	public void get() {
		System.out.println("To open application in chrome driver");
	}
	public void close() {
		System.out.println("To close application in chrome driver");
	}

public static void main(String args[]) {
	//Creating object for ChromeDriver class directly
	ChromeDriver driver=new ChromeDriver();
	driver.close();
	driver.get();
	//creating object for WebDriver(interface) indirectly-with the reference of ChromeDriver class
	WebDriver driver2=new ChromeDriver();
	driver2.get();
	driver2.close();
	//Creating object for FirefoxDriver class directly
	FirefoxDriver ff=new FirefoxDriver();
	ff.get();
	ff.close();
	//Creating object for WebDriver(interface)indirectly - with the reference of FirefoxDriver class
	WebDriver f=new FirefoxDriver();
	f.get();
	f.close();
}
}