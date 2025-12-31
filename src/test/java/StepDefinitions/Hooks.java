package StepDefinitions;

import JavaUtils.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	TestContext testContext;
	
	public Hooks(TestContext context) {
		this.testContext=context;
	}
	@Before
	public void setUp() {
		
	}
	@After
	public void tearDown() {
		
		testContext.driver.quit();
	}
}
