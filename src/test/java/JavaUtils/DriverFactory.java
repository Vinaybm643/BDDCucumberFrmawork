package JavaUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	WebDriver driver;
	public WebDriver  initDriver() {
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
}
