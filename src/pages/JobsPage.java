package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JobsPage extends BaseClass {
	
	static WebDriver driver;

	public JobsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Elements
	
	private static WebElement searchBar() {
		return driver.findElement(By.id("q"));
	}
	
	private static WebElement searchBtn() {
		return driver.findElement(By.cssSelector("a#btn_search_jobs"));
	}
	
	private static WebElement advancedSearch() {
		return driver.findElement(By.cssSelector("a#link_show_advanced_search"));
	}
	
	private static List<WebElement> jobsList() {
		return driver.findElements(By.cssSelector("table#jobs_table a"));
	}
	
	// Actions
	
	public void inputSearch() {
		searchBar().sendKeys("accounting");
	}
	
	public void clickSearchBtn() {
		searchBtn().click();
	}
	
	public void clickAdvancedSearch() {
		advancedSearch().click();
	}
	
	public int getJobsSize() {
		return jobsList().size();
	}

}
