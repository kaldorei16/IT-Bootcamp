package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CollectionsPage {

	static WebDriver driver;

	public CollectionsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements

	private static List<WebElement> sortBar() {
		return driver.findElements(By.cssSelector("span.big-label.blue-pop a:not(.hidden)"));
	}

	private static List<WebElement> videos() {
		return driver.findElements(By.cssSelector("div.results div"));
	}

	private static List<WebElement> radioBtns() {
		return driver.findElements(By.cssSelector(
				"#tabby-collection > div > div.columns-facets > form > div > fieldset > label > input[type=radio]"));
	}

	private static List<WebElement> checkBoxes() {
		return driver.findElements(By.cssSelector("div.facets_collapser input"));
	}

	private static List<WebElement> moreBtns() {
		return driver.findElements(By.cssSelector("div.facets_collapser a"));
	}

	private static WebElement searchBar() {
		return driver.findElement(By.name("and[]"));
	}

	private static List<WebElement> topBtns() {
		return driver.findElements(By.cssSelector("div.welcome-right > *:not(div):not(br)"));
	}

	private static WebElement resultsCount() {
		return driver.findElement(By.cssSelector("div.results_count"));
	}

	// Actions

	public void clickSortBar(Integer i) {
		sortBar().get(i).click();
	}

	public void clickPlayBtn(Integer i) {
		topBtns().get(i).click();
	}
	
	public WebElement getResultsCount() {
		return resultsCount();
	}

}
