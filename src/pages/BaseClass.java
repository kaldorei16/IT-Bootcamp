package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	static WebDriver driver;

	public BaseClass(WebDriver d) {
		driver = d;
	}

	public WebDriverWait waiter() {
		WebDriverWait wait = new WebDriverWait(driver, 30, 500);
		return wait;
	}

	public void elementToAppear(By locator) {
		waiter().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public void elementToAppear(WebElement element) {
		waiter().until(ExpectedConditions.visibilityOf(element));
	}

	public void elementsToAppear(By by) {
		waiter().until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
	}

	public void elementToAppear(By locator, By locator2) {
		waiter().until(ExpectedConditions.and(ExpectedConditions.visibilityOfElementLocated(locator),
				ExpectedConditions.visibilityOfElementLocated(locator2)));
	}

	public void elementToAppear(WebElement element, WebElement element2) {
		waiter().until(ExpectedConditions.and(ExpectedConditions.visibilityOf(element),
				ExpectedConditions.visibilityOf(element2)));
	}

	public void elementToAppear(By locator, By locator2, By locator3) {
		waiter().until(ExpectedConditions.and(ExpectedConditions.visibilityOfElementLocated(locator),
				ExpectedConditions.visibilityOfElementLocated(locator2),
				ExpectedConditions.visibilityOfElementLocated(locator3)));
	}

	public void elementToBeClickable(By locator) {
		waiter().until(ExpectedConditions.elementToBeClickable(locator));
	}

	public void urlToContain(String url) {
		waiter().until(ExpectedConditions.urlContains(url));
	}

	public void elementToBeSelected(By locator) {
		waiter().until(ExpectedConditions.elementToBeSelected(locator));
	}

	public void elementToBeSelected(WebElement element) {
		waiter().until(ExpectedConditions.elementToBeSelected(element));
	}

	public void frameToBeAvailable(By locator) {
		waiter().until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
	}

	public void numberOfElements(By locator, int number) {
		waiter().until(ExpectedConditions.numberOfElementsToBe(locator, number));
	}

	public void numberOfElementsLess(By locator, int number) {
		waiter().until(ExpectedConditions.numberOfElementsToBeLessThan(locator, number));
	}

	public void numberOfElementsMore(By locator, int number) {
		waiter().until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, number));
	}

	public void presenceOfElement(By locator) {
		waiter().until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	public void visibilityOfAllElements(List<WebElement> elements) {
		waiter().until(ExpectedConditions.visibilityOfAllElements(elements));
	}

}
