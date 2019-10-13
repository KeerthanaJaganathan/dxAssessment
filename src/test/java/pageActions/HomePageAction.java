package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageFactory.HomePageFactory;

public class HomePageAction extends HomePageFactory {

	WebDriver driver;
	
	public HomePageAction(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public HomePageAction verifyPageLoad() {

		try{
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(javaScriptLink));
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	
	public HomePageAction clickOnJavaScriptLink() {

		try{
			javaScriptLink.click();
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return this;
	}
	
}
