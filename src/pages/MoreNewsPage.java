package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MoreNewsPage {
	
	static WebDriver driver;

	public MoreNewsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static List<WebElement> newsList() {
		return driver.findElements(By.cssSelector("table.table-hover tr"));
	}
	
	private static WebElement newsBtn() {
		return driver.findElement(By.cssSelector("div.box a:nth-child(1)"));
	}
	
	// Actions
	
	public void clickNewsBtn() {
		newsBtn().click();
	}

}
