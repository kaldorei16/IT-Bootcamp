package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.ArchiveNavPage;
import pages.LoginPage;
import pages.MainPage;
import pages.PageURLs;
import pages.UploadPage;

public class TestsMainPage {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void archTest1() throws Exception {

		driver.navigate().to(PageURLs.ARCH_HOME);
		driver.manage().window().maximize();

		ArchiveNavPage anv = new ArchiveNavPage(driver);
		MainPage mp = new MainPage(driver);
		LoginPage lp = new LoginPage(driver);

		Assert.assertTrue(mp.getTopCollectionSize() >= 20);

		for (int i = 0; i < mp.getTextCollections().size(); i++) {
			Assert.assertTrue(mp.getTextCollections().get(i).contains("ITEMS"));
		}
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

	@Test
	public void archTest5() {

		driver.navigate().to(PageURLs.ARCH_HOME);
		driver.manage().window().maximize();

		UploadPage up = new UploadPage(driver);
		ArchiveNavPage anv = new ArchiveNavPage(driver);

		anv.clickUpload();

		Assert.assertTrue(up.getLogInOrSignUpText().contains("Log in or Sign up"));
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

	@Test
	public void archTest7() {

		driver.navigate().to(PageURLs.ARCH_HOME);
		driver.manage().window().maximize();

		ArchiveNavPage anv = new ArchiveNavPage(driver);
		LoginPage lp = new LoginPage(driver);

		anv.clickSignIn();
		Assert.assertTrue(lp.getForgotPass().isDisplayed());

		lp.clicksignUpFree();
		lp.clickTermsOfService();

		Assert.assertTrue(lp.getChildWindowUrl().contains("terms"));
	}
}
