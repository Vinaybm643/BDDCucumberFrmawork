package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	WebDriver driver;

	public OfferPage(WebDriver driver) {
		this.driver = driver;

	}

	By offerSearch = (By.id("search-field"));
	By OfferVerify = (By.cssSelector("tbody tr td:nth-child(1)"));

	public void searchProduct(String name) {
		driver.findElement(offerSearch).sendKeys(name);
	}

	public String verifyProduct() {
		return driver.findElement(OfferVerify).getText();

	}

}
