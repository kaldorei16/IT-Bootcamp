package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HiddenSearchPage {
	
	static WebDriver driver;

	public HiddenSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static List<WebElement> searchResults() {
		return driver.findElements(By.cssSelector("ul.result-list li"));
	}

}
