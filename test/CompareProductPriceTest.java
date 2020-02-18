package test;

import org.testng.annotations.Test;

import page.ProductInAmazonPage;
import page.ProductInFlipkartPage;

public class CompareProductPriceTest extends BaseTest {

	@Test
	public void main() throws Exception {

		String productName = "iPhone XR (64GB) - Yellow";
		ProductInAmazonPage searchInAmazon = new ProductInAmazonPage(driver,wait);
		ProductInFlipkartPage searchInFlipKart = new ProductInFlipkartPage(driver,wait);

		int priceFromAmazon = searchInAmazon.launchAndSearchProduct(productName);
		int priceFromFlipkart = searchInFlipKart.launchAndSearchProduct(productName);

		if (priceFromAmazon > priceFromFlipkart)
			System.out.println("Price of " + productName + " with price "+ priceFromFlipkart +"is lesser on Flipkart");
		else
			System.out.println("Price of " + productName + " with price "+ priceFromAmazon+" is lesser on Amazon");
	}
}
