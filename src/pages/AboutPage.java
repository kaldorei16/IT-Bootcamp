package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutPage {

	static WebDriver driver;

	public AboutPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static List<WebElement> news() {
		return driver.findElements(By.cssSelector("tr.forumRow a"));
	}
	
	private static WebElement moreBtn() {
		return driver.findElement(By.cssSelector("div.box a"));
	}
	
	// Actions
	
	public void clickMoreBtn() {
		moreBtn().click();
	}
	
	public void clickNews(Integer i) {
		news().get(i).click();
	}
	
	public int getSize() {
		return news().size();
	}
}
