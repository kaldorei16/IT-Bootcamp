package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CollectionsPage;
import pages.MainPage;
import pages.PageURLs;

public class TestMainPage2 {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void archTest2() {
		
		driver.navigate().to(PageURLs.ARCH_HOME);
		driver.manage().window().maximize();
		
		MainPage mp = new MainPage(driver);
		CollectionsPage cp = new CollectionsPage(driver);
		
		String s=driver.findElements(By.cssSelector("div.num-items")).get(0).getText();
        int si=Integer.parseInt(s.replaceAll("\\D",""));
        System.out.println(si);
        
        mp.clickTopCollection(0);
        
        Assert.assertTrue(cp.getResultsCount().isDisplayed());
        
        String s1=driver.findElement(By.cssSelector("div.results_count")).getText();
        int si1=Integer.parseInt(s1.replaceAll("\\D",""));
        System.out.println(si1);
        
        Math.abs(si);
        Math.abs(si1);
        System.out.println(Math.abs(si1 - si));
        
        Assert.assertTrue(Math.abs(si1 - si) < 200);
	}

}
