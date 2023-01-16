package testCases;

import org.testng.annotations.Test;


import pages.HomePage;
import utilities.SetupDriverP;
import pages.FictionPage;
import pages.CheckOutPage;

public class TestCase extends SetupDriverP {
	
	FictionPage fictionPage = new FictionPage();
	HomePage homePage = new HomePage();
	CheckOutPage checkOutPage = new CheckOutPage();
	

	@Test
	public void homePageTest() throws InterruptedException {
		
		
		getDriver().get("https://www.printworksbd.com/");
		
		homePage.storyBookHover();
		homePage.clickFiction();
		fictionPage.hoverAlice();
		fictionPage.clickNext();
		fictionPage.george();
		fictionPage.cart();
		
		checkOutPage.checkoutKeys();
		Thread.sleep(5000);
	}


}
