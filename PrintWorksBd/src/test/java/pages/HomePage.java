package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePageP {
	
	By STORY_BOOKS = By.xpath("//li[@id='nav-menu-item-720']");
	By FICTION = By.xpath("//li[@id='nav-menu-item-2584']");
	
	
	public void storyBookHover() {
		hoverElement(STORY_BOOKS);
	}
	
	public void clickFiction() {
		clickElement(FICTION);
	}
	

}
