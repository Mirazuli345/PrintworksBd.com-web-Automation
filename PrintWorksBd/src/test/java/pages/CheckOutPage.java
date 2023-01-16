package pages;

import org.openqa.selenium.By;

public class CheckOutPage extends BasePageP {
	
	By FIRSTNAME = By.xpath("//input[@id='billing_first_name']");
	By LASTNAME = By.xpath("//input[@id='billing_last_name']");
	By ADDRESS = By.xpath("//input[@id='billing_address_1']");
	By POSTCODE = By.xpath("//input[@id='billing_postcode']");
	By PHONE = By.xpath("//input[@id='billing_phone']");
	By EMAIL = By.xpath("//input[@id='billing_email']");
	
	public void checkoutKeys() {
		
		sendKeys(FIRSTNAME, "Mirajul");
		sendKeys(LASTNAME, "Islam");
		sendKeys(ADDRESS, "Uttara,dhaka,Bangladesh");
		sendKeys(POSTCODE, "1746");
		sendKeys(PHONE, "01685555551");
		sendKeys(EMAIL, "mirazuli345@gmail.com");
		
	}

}
