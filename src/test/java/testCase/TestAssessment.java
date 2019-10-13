package testCase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dxAssessment.dxJavaAssessment.TestBase;
import pageActions.HomePageAction;
import pageActions.JavaScriptPageAction;

public class TestAssessment extends TestBase{

	HomePageAction homePage;
	TestBase testBase;
	JavaScriptPageAction jsPage;
	
	   
	public TestAssessment(){
			super();
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		
		initialization();
		testBase = new TestBase();
		homePage = new HomePageAction(driver);
		jsPage = new JavaScriptPageAction(driver);
		
	}
	
	
	@Test
	public void verifyHomePage() throws InterruptedException{

		homePage.verifyPageLoad()
		.clickOnJavaScriptLink();
		jsPage.verifyPageLoadJavaScript()
		.clickOnJavaScriptLink()
		.acceptAlert()
		.resultVerification();
		driver.close();
				
	}
	

	@AfterTest
	public void tearDown(){
		driver.quit();
	}
	
	
	
}
