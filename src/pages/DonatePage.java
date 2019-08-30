package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DonatePage {
	
	static WebDriver driver;

	public DonatePage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static List<WebElement> currencyList() {
		return driver.findElements(By.cssSelector("ul.donationlevel li"));
	}
	
	private static WebElement otherAmount() {
		return driver.findElement(By.cssSelector("input#amount_custom"));
	}
	
	// Actions
	
	public void clickCurrency(Integer i) {
		currencyList().get(i).click();
	}
	
	public void enterAmount() {
		otherAmount().sendKeys("13");
	}

}
