package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsPage {

	static WebDriver driver;

	public ContactsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements

	private static WebElement map1() {
		return driver.findElement(By.cssSelector("div.col-md-9 img"));
	}

	private static WebElement map2() {
		return driver.findElement(By.cssSelector("div.col-md-9 img"));
	}

	// Actions

	public void clickmap1() {
		map1().click();
	}

	public void clickmap2() {
		map2().click();
	}
}
