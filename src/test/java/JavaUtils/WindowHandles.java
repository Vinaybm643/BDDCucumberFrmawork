package JavaUtils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHandles {

	public WebDriver driver;
	public String parentWindow;
	public String chiidWindow;

	public WindowHandles(WebDriver driver) {
		this.driver = driver;
	}

	public void getWindowChild() {

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentWindow = it.next();
		String chiidWindow = it.next();
		driver.switchTo().window(chiidWindow);
	}
	
	public void switchToParentHandle() {
		driver.switchTo().window(parentWindow);
	}
}
