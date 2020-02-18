package common;

public class Helper {

	public int getPrice(String price) {

		price = price.replace(",", "").substring(1);
		return Integer.parseInt(price);
	}

}
