package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import JavaUtils.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenKart {

 TestContext testContext;
 
 public GreenKart(TestContext context) {
	 this.testContext=context;
 }
 
	@Given("User is on GrenKart page")
	public void user_is_on_gren_kart_page() {
		testContext.pageObjectManager.getHomePage().geturl();
	}

	@When("User search the productName {string}")
	public void user_search_the_product_name(String shortName) {
		
		testContext.pageObjectManager.getHomePage().searchProduct(shortName);
		
		
		
	}

	@When("Grab the PdoductName") // testConetxt
	public void grab_the_pdoduct_name() throws InterruptedException {
		testContext.productName =testContext.pageObjectManager.getHomePage().producVerify();
		Thread.sleep(2000);
		testContext.pageObjectManager.getHomePage().topClick();
		
		
	}

	@Then("search the same ProductName {string} in Top details page")
	public void search_the_same_product_name_in_top_details_page(String shortName) {
	
		testContext.windowHandles.getWindowChild();
		
		 testContext.pageObjectManager.getofferPage().searchProduct(shortName);
	testContext.offerProductName= testContext.pageObjectManager.getofferPage().verifyProduct();
		
		
	
	
	}

	@Then("Validate ProductName")
	public void validate_product_name() {
	
		Assert.assertEquals( testContext.productName,  testContext.offerProductName);
		
	}

}
