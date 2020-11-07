package launchBrowser;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchChromeWithJunit {
	WebDriver driver;

	@Before
	public void launchBrowser() {

		// Setting the Property
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// Creating an object for chrome driver
		driver = new ChromeDriver();
		// Navigating to the website
		driver.get("http://www.techfios.com/ibilling/?ng=admin/");
		// Maximizing the window
		driver.manage().window().maximize();
		// Use Implicitly wait
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	// @Test
	public void loginTest1() throws InterruptedException {

		try {
			// Identifying the web element and pass user name
			driver.findElement(By.id("username1")).sendKeys("demo@techfios.com");
			// Identifying the web element and pass password
			driver.findElement(By.id("password")).sendKeys("abc123");
			// Identifying the web element and click on the sign in button
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("login"))));
			driver.findElement(By.name("login")).click();

			// stop the driver
			Thread.sleep(2000);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	@Test
	public void loginTest2() throws InterruptedException {
		// Identifying the web element and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// Identifying the web element and pass password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// Identifying the web element and click on the sign in button
		driver.findElement(By.name("login")).click();

		System.out.println(driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/a/span[1]")).getText());
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[10]/a/span[1]")).click();

		// stop the driver
		Thread.sleep(3000);

	}

	// @Test
	public void loginTest3() throws InterruptedException {
		// Identifying the web element and pass user name
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// Identifying the web element and pass password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// Identifying the web element and click on the sign in button
		driver.findElement(By.name("login")).click();

		// stop the driver
		Thread.sleep(2000);

	}

	@After
	public void tearDown() {
		// close window
		driver.close();
	}

}
