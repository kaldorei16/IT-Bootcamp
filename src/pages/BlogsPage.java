package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BlogsPage {
	
	static WebDriver driver;

	public BlogsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static List<WebElement> navBar() {
		return driver.findElements(By.cssSelector("div#access a"));
	}
	
	private static List<WebElement> fbAndTw() {
		return driver.findElements(By.cssSelector("div.archive-sharing-widget a"));
	}
	
	private static WebElement archivesDropDown() {
		return driver.findElement(By.cssSelector("select#archives-dropdown-2"));
	}
	
	private static WebElement searchBox() {
		return driver.findElement(By.cssSelector("input#s"));
	}
	
	private static WebElement searchBtn() {
		return driver.findElement(By.cssSelector("input#searchsubmit"));
	}
	
	// Actions
	
	public void inputSearchBox() {
		searchBox().sendKeys("internet");
	}
	
	public void clickSearchBtn() {
		searchBtn().click();
	}
	
	public void selectArchives(Integer i) {
		Select date = new Select(archivesDropDown());
		date.selectByIndex(i);
	}
	
	public void clickArchives() {
		archivesDropDown().click();
	}
	
	public void clickFbAndTw(Integer i) {
		fbAndTw().get(i).click();
	}

}
