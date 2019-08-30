package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewsFeedPage {
	
	static WebDriver driver;

	public NewsFeedPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static List<WebElement> article() {
		return driver.findElements(By.cssSelector("div.box"));
	}

}
