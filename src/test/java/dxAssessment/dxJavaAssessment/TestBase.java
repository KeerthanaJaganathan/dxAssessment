package dxAssessment.dxJavaAssessment;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;

	
	public static void initialization() {
		String browserName = "chrome";

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

		driver.get("http://the-internet.herokuapp.com/");

	}
}
