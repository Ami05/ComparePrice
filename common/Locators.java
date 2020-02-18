package common;

public class Locators {
	public String searchBarAmazon="twotabsearchtextbox";
	public String submitButtonAmazon = "//input[@class='nav-input' and @type='submit']";
	public String listProductAmazon = "//div[contains(@data-cel-widget,'search_result_')]";
	public String productNameAmazon ="//h2//span";
	public String productPriceAmazon = "//*[@data-a-color='price']/span[@class='a-offscreen']";
	public String contactUsAmazon ="//*[contains(text(),'contact us')]";
	
	public String closePopupFlipkart="//button[@class='_2AkmmA _29YdH8']";
	public String searchBarFlipkart = "q";
	public String submitButtonFlipkart = "//button[@type='submit']";
	public String productNameFlipkart ="div._3wU53n";
	public String productPriceFlipkart = "//div[@class='_1vC4OE _2rQ-NK']";
	public String helpMeFlipkart ="//span[text()='Help me decide']";

}
