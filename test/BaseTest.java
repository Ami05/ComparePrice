package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public WebDriver driver = null;
	public WebDriverWait wait = null;

	@BeforeSuite
	public void initialize() {

		System.setProperty("webdriver.chrome.driver","D:\\study\\MyWorkstation\\java\\test\\ZestMoney\\Zest\\driver\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");

		this.driver = new ChromeDriver(options);

		this.wait = new WebDriverWait(this.driver, 10);

		this.driver.get("https://www.google.com/");
	}

	@AfterSuite
	public void TeardownTest() {
		this.driver.quit();
	}
}
