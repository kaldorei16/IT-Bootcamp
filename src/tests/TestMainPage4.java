package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ArchiveNavPage;
import pages.MainPage;
import pages.PageURLs;

public class TestMainPage4 {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void archTest4() {
		
		driver.navigate().to(PageURLs.ARCH_HOME);
		driver.manage().window().maximize();
		
		MainPage mp = new MainPage(driver);
		ArchiveNavPage anv = new ArchiveNavPage(driver);
		
		mp.inputTextSearch();
		Assert.assertTrue(mp.getHiddenSearchOptions().isDisplayed());
		mp.clickSearchBtn();
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("?query=qa"));
	}

}
