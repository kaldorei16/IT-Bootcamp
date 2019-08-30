package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutTabPage {
	
	static WebDriver driver;

	public AboutTabPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static List<WebElement> contributors() {
		return driver.findElements(By.cssSelector("div.about-box div.items_list"));
	}
	
	private static List<WebElement> graphs() {
		return driver.findElements(By.cssSelector("div.grafs"));
	}
	
	private static List<WebElement> topRegions() {
		return driver.findElements(By.cssSelector("table.stats-table tr"));
	}
	
	private static List<WebElement> relatedCollections() {
		return driver.findElements(By.cssSelector("#tabby-about > div > div.col-sm-5 > div:nth-child(7) > div:not(:first-child)"));
	}

}
