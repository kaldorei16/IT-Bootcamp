package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ArchiveNavPage;
import pages.MainPage;
import pages.PageURLs;

public class TestMainPage3 {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void archTest3() throws Exception {
		
		driver.navigate().to(PageURLs.ARCH_HOME);
		driver.manage().window().maximize();
		
		MainPage mp = new MainPage(driver);
		ArchiveNavPage anv = new ArchiveNavPage(driver);
		
		anv.clickNavBar(1);
		anv.clickLinkTextNav(0);
		String url1 = driver.getCurrentUrl();
		
		driver.navigate().back();

		mp.clickFloatBtns(1);
		String url2 = driver.getCurrentUrl();
		Assert.assertTrue(url1.equals(url2));
	}

}
