package launchBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		launchBrowser();
		loginTest();
		tearDown();

	}

	public static void launchBrowser() {

		// Setting the Property
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// Creating an object for chrome driver
		driver = new ChromeDriver();
		// Navigating to the website
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		// Maximizing the window
		driver.manage().window().maximize();

	}

	public static void loginTest() throws InterruptedException {
		// Identifying the web element and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// Identifying the web element and pass password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// Identifying the web element and click on the sign in button
		driver.findElement(By.name("login")).click();

		// stop the driver
		Thread.sleep(2000);

	}

	public static void loginTest1() throws InterruptedException {
		// Identifying the web element and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// Identifying the web element and pass password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// Identifying the web element and click on the sign in button
		driver.findElement(By.name("login")).click();

		// stop the driver
		Thread.sleep(2000);

	}

	public static void tearDown() {
		// close window
		driver.close();
	}

}
