package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Helper;
import common.Locators;

public class ProductInFlipkartPage {

	WebDriver driver;
	WebDriverWait wait;
	String url = "https://www.flipkart.com/";

	public ProductInFlipkartPage(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}

	public int launchAndSearchProduct(String productName) {
		String price = "";
		driver.get(url);
		Locators loc = new Locators();
		Helper helper = new Helper();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(loc.closePopupFlipkart))));
		driver.findElement(By.xpath(loc.closePopupFlipkart)).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(loc.searchBarFlipkart))));
		driver.findElement(By.name(loc.searchBarFlipkart)).sendKeys(productName);
		driver.findElement(By.xpath(loc.submitButtonFlipkart)).click();

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(loc.productPriceFlipkart))));
		
		String name = driver.findElement(By.cssSelector(loc.productNameFlipkart)).getText();
		price = driver.findElement(By.xpath(loc.productPriceFlipkart)).getAttribute("innerText");
		return helper.getPrice(price);

	}

}
