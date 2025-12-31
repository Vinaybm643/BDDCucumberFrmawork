package JavaUtils;

import org.openqa.selenium.WebDriver;

import PageObjectModel.PageObjectManager;

public class TestContext {
  public WebDriver driver;
  public PageObjectManager pageObjectManager;
  public String productName;
  public String offerProductName;
  public  WindowHandles windowHandles;
  
  public TestContext() {
	     driver= new DriverFactory().initDriver();
	     pageObjectManager= new PageObjectManager(driver);
	     
	     windowHandles=  new WindowHandles(driver);
  }
}
