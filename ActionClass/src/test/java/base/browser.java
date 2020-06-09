package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class browser {
	public WebDriver driver;
	@BeforeClass
	public void browserOpen() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.advanceshoppers.com/");
		
		Reporter.log("==landing page open==", true);
		
	}
	@AfterClass
	public void exBrowser() {
		driver.quit();
		Reporter.log("==Browser Close==", true);
		
		
	}

}
