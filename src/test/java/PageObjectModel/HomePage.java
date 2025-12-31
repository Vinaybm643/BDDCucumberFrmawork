package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public WebDriver driver;

	By search = (By.cssSelector(".search-keyword"));
	By productName = (By.xpath("//h4[normalize-space()='Tomato - 1 Kg']"));
	By toplink = (By.linkText("Top Deals"));

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void geturl() {
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	public void searchProduct(String name) {

		driver.findElement(search).sendKeys(name);
	}

	public String producVerify() {
		return driver.findElement(productName).getText().split("-")[0].trim();
	}

	public void topClick() {

		driver.findElement(toplink).click();
	}
}
