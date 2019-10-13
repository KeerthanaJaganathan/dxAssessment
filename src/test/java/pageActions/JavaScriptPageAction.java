package pageActions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageFactory.JavaScriptPageFactory;

public class JavaScriptPageAction extends JavaScriptPageFactory {
	
	WebDriver driver;

	public JavaScriptPageAction(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public JavaScriptPageAction verifyPageLoadJavaScript() {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.visibilityOf(confirmJSButton));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public JavaScriptPageAction clickOnJavaScriptLink() {

		try {
			confirmJSButton.click();;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	
	public JavaScriptPageAction acceptAlert() {
		try {
			driver.switchTo().alert().accept();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
	public JavaScriptPageAction resultVerification() {
		try {
			String result = validateResult.getText();
			assertEquals("You clicked: Ok", result);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return this;
	}
}
