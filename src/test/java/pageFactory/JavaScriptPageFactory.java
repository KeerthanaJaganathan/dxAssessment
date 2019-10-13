package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class JavaScriptPageFactory {

	@FindBy(how = How.XPATH, using = "//li/button[text()='Click for JS Confirm']")
	public WebElement confirmJSButton;
	
	@FindBy(how = How.XPATH, using = "//p[@id='result']")
	public WebElement validateResult;
	
}
