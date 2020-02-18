package page;

import java.beans.Visibility;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Helper;
import common.Locators;

public class ProductInAmazonPage {

	WebDriver driver;
	WebDriverWait wait;
	String url ="https://www.amazon.in/";
	public ProductInAmazonPage(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public int launchAndSearchProduct(String productName){
		String price ="";
		driver.get(url);
		Locators loc = new Locators();
		Helper helper = new Helper();
		driver.findElement(By.id(loc.searchBarAmazon)).sendKeys(productName);
		driver.findElement(By.xpath(loc.submitButtonAmazon)).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(loc.contactUsAmazon))));
		
		List<WebElement> list = driver.findElements(By.xpath(loc.listProductAmazon));
		for(WebElement elem: list){
			String name = elem.findElement(By.xpath(loc.productNameAmazon)).getText();
			if(name.contains(productName)){
				price = elem.findElement(By.xpath(loc.productPriceAmazon)).getAttribute("innerText");
			}
		}
		return helper.getPrice(price);
		
	}

}
