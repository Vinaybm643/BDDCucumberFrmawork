package PageObjectModel;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	
	public WebDriver driver;
	public HomePage getHome;
	public OfferPage OfferPage;
	
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	public HomePage getHomePage() {
		if(getHome==null) 
		{
		
		 getHome= new HomePage(driver);
		}
		return getHome;
		
	}
	
	public OfferPage getofferPage() {
		if(OfferPage==null) {
			
		
	 OfferPage= new OfferPage(driver);
		
		}
		return OfferPage;
	}
}
