package pages;

import org.openqa.selenium.By;

public class FictionPage extends BasePageP {
	
	By ALICE = By.xpath("//li[@class='show-outimage-q-onimage pcols-md-first post-10409 product type-product status-publish has-post-thumbnail product_cat-fiction-fantasy product_cat-lewis-carroll product_cat-macmillan product_cat-story-books product_tag-macmillan  instock featured shipping-taxable purchasable product-type-simple']");
	By NEXT = By.linkText("2");
	By GEORGE = By.xpath("//li[@class='show-outimage-q-onimage pcols-md-first post-8941 product type-product status-publish has-post-thumbnail product_cat-corgi product_cat-fiction-fantasy product_cat-stephen-hawking product_cat-story-books product_tag-corgi-books product_tag-lucy-stephen-hawking  instock sale featured shipping-taxable purchasable product-type-simple']");
	By ADDCART = By.xpath("//button[@name='add-to-cart']");
	
	By CARTHOVER = By.xpath("//div[@data-delay='50']");
	By CHECKOUT = By.xpath("//a[@class='button checkout wc-forward']");
	
	
	public void hoverAlice() {
		scrollPage(ALICE);
	}
	
	public void clickNext() {
		clickElement(NEXT);
	}
	
	public void george() {
		scrollPage(GEORGE);
		clickElement(GEORGE);
		clickElement(ADDCART);
	}
	
	public void cart() {
		
		hoverElement(CARTHOVER);
		clickElement(CHECKOUT);
		
	}

}
