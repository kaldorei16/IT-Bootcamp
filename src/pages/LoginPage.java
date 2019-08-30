package pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {

	static WebDriver driver;

	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Elements

	private static WebElement username() {
		return driver.findElement(By.name("username"));
	}

	private static WebElement password() {
		return driver.findElement(By.name("password"));
	}

	private static WebElement loginBtn() {
		return driver.findElement(By.name("submit-to-login"));
	}

	private static WebElement errorMessage() {
		return driver.findElement(By.cssSelector("div.password-message span.login-error"));
	}

	private static WebElement forgotPass() {
		return driver.findElement(By.cssSelector("div.password-message a"));
	}

	private static WebElement signUpFree() {
		return driver.findElement(By.cssSelector("div.login-form-section p a"));
	}

	private static WebElement termOfService() {
		return driver.findElement(By.cssSelector("div.terms a"));
	}

	// Actions

	public void inputUsername() {
		username().sendKeys("foo@gmail.com");
	}

	public void inputPassword() {
		password().sendKeys("bar");
	}

	public void clickLoginBtn() {
		loginBtn().click();
	}

	public WebElement getLoginBtn() {
		return loginBtn();
	}

	public String getErrorMessageText() {
		elementToAppear(errorMessage());
		return errorMessage().getText();
	}

	public WebElement getForgotPass() {
		return forgotPass();
	}

	public void clicksignUpFree() {
		signUpFree().click();
	}

	public void clickTermsOfService() {
		termOfService().click();
	}

	public String getChildWindowUrl() {

		Set<String> window = driver.getWindowHandles();

		Iterator iterator = window.iterator();

		String currentWindowId = null;
		String mainPage = driver.getWindowHandle();

		while (iterator.hasNext()) {
			currentWindowId = iterator.next().toString();

			// Takes the url from child window
			if (!currentWindowId.equals(mainPage)) {
				driver.switchTo().window(currentWindowId);
			}
		}
		return driver.getCurrentUrl();
	}
}