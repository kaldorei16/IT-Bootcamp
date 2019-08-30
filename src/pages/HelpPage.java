package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpPage {

	static WebDriver driver;

	public HelpPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static WebElement searchBar() {
		return driver.findElement(By.name("query"));
	}
	
	private static List<WebElement> links() {
		return driver.findElements(By.cssSelector("ul.blocks-list li"));
	}
	
	private static WebElement signInBtn() {
		return driver.findElement(By.cssSelector("a.login"));
	}
	
	// Actions
	
	public void inputSearch() {
		searchBar().sendKeys("help");
	}
	
	public void clickSearch() {
		searchBar().sendKeys(Keys.RETURN);
	}
	
	public void clickSignIn() {
		signInBtn().click();
	}
	
	public void clickLinks(Integer i) {
		links().get(i).click();
	}
}
