package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.AboutPage;
import pages.ArchiveNavPage;
import pages.BlogsPage;
import pages.CollectionsPage;
import pages.ContactsPage;
import pages.DonatePage;
import pages.HelpPage;
import pages.JobsPage;
import pages.LoginPage;
import pages.MainPage;
import pages.MoreNewsPage;
import pages.PageURLs;
import pages.PeoplesPage;
import pages.ProjectsPage;

public class TestMainPage1 {
	
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
		AboutPage ab = new AboutPage(driver);
		BlogsPage bp = new BlogsPage(driver);
		ContactsPage cp = new ContactsPage(driver);
		DonatePage dp = new DonatePage(driver);
		HelpPage hp = new HelpPage(driver);
		JobsPage jp = new JobsPage(driver);
		PeoplesPage pp = new PeoplesPage(driver);
		ProjectsPage pr = new ProjectsPage(driver);
		MoreNewsPage mn = new MoreNewsPage(driver);
		CollectionsPage clp = new CollectionsPage(driver);
		LoginPage lp = new LoginPage(driver);

		Assert.assertTrue(mp.getTopCollectionSize() >= 20);
		
		for(int i = 0; i < mp.getTextCollections().size(); i++) {
			Assert.assertTrue(mp.getTextCollections().get(i).contains("ITEMS"));
		}

	}
}
