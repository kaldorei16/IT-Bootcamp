package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BaseClass {

	static WebDriver driver;

	public MainPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Elements

	private static List<WebElement> topCollection() {
		return driver.findElements(By.cssSelector("div.item-ia.collection-ia"));
	}

	private static List<WebElement> floatbtns() {
		return driver.findElements(By.cssSelector("center.mt-big a"));
	}

	private static WebElement searchBarMain() {
		return driver.findElement(By.name("search"));
	}

	private static WebElement searchBtnGo() {
		return driver.findElement(By.cssSelector("button.input-sm"));
	}

	private static WebElement advanceSearch() {
		return driver.findElement(By.cssSelector("div#search_options a"));
	}

	private static WebElement seeMoreLink() {
		return driver.findElement(By.cssSelector("div.hero-right a"));
	}
	
	private static WebElement results() {
		return driver.findElement(By.cssSelector("div.results_count"));
	}
	
	private static WebElement hiddenSearchOptions() {
		return driver.findElement(By.cssSelector("div#search_options"));
	}

	// Actions

	public void clickTopCollection(Integer i) {
		topCollection().get(i).click();
	}

	public void clickFloatBtns(Integer i) {
		elementsToAppear(By.cssSelector("center.mt-big a"));
		floatbtns().get(i).click();
	}

	public int getTopCollectionSize() {
		return topCollection().size();
	}

	public List<String> getTextCollections() {
		List<String> TextList = new ArrayList<String>();
		 for (int i = 0; i < topCollection().size(); i++) {
	            TextList.add(topCollection().get(i)
	                    .findElement(By.cssSelector("div.item-ia.collection-ia div.num-items.topinblock")).getText());
	        }
	        return TextList;
		
	}
	
	public void inputTextSearch() {
		searchBarMain().sendKeys("qa");
	}
	
	public void clickSearchBtn() {
		searchBtnGo().click();
	}
	
	public WebElement getHiddenSearchOptions() {
		return hiddenSearchOptions();
	}
}
