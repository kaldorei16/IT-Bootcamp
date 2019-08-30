package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ArchiveNavPage;
import pages.PageURLs;
import pages.UploadPage;

public class TestMainPage5 {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void archTest5() {
		
		driver.navigate().to(PageURLs.ARCH_HOME);
		driver.manage().window().maximize();
		
		UploadPage up = new UploadPage(driver);
		ArchiveNavPage anv = new ArchiveNavPage(driver);
		
		anv.clickUpload();
		
		Assert.assertTrue(up.getLogInOrSignUpText().contains("Log in or Sign up"));
	}

}
