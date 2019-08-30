package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProjectsPage {
	
	static WebDriver driver;

	public ProjectsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static List<WebElement> jobs() {
		return driver.findElements(By.cssSelector("div.col-sm-3 a"));
	}
	
	// Actions
	
	public void clickjob(Integer i) {
		jobs().get(i).click();
	}
	
	public int getJobsSize() {
		return jobs().size();
	}

}
