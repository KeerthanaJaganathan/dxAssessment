package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageFactory {

	@FindBy(how = How.XPATH, using = "//li/a[text()='JavaScript Alerts']")
	public WebElement javaScriptLink;
	
	
}
