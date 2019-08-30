package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ArchiveNavPage;
import pages.LoginPage;
import pages.PageURLs;

public class TestMainPage6 {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void archTest6() {
		
		driver.navigate().to(PageURLs.ARCH_HOME);
		driver.manage().window().maximize();
		
		ArchiveNavPage anv = new ArchiveNavPage(driver);
		LoginPage lp = new LoginPage(driver);
		
		anv.clickSignIn();
		Assert.assertTrue(lp.getLoginBtn().isDisplayed());
		
		lp.inputUsername();
		lp.inputPassword();
		lp.clickLoginBtn();
		
		Assert.assertTrue(lp.getErrorMessageText().contains("Email address and/or Password incorrect."));
	}

}
