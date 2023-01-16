package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static utilities.SetupDriverP.getDriver;

import java.time.Duration;;

public class BasePageP {
	
	public WebElement getElement(By locator) {
		
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(20));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}
	
	public void sendKeys(By locator,String text) {
		
		getElement(locator).sendKeys(text);
	}
	

	
	public void clickElement(By locator) {
		WebDriverWait wait= new WebDriverWait(getDriver(), Duration.ofSeconds(20));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		element.click();
	}
	
	public void hoverElement(By locator) {
		Actions action = new Actions(getDriver());
		action.moveToElement(getElement(locator)).perform();
	}
	
	
	public void scrollPage(By locator) {
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("arguments[0].scrollIntoView();", getElement(locator));
	}
	

}
