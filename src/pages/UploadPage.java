package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UploadPage {
	
	static WebDriver driver;

	public UploadPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	private static WebElement uploadBtn() {
		return driver.findElement(By.cssSelector("a.btn-success"));
	}
	
	private static WebElement questionMark() {
		return driver.findElement(By.cssSelector("a.stealth"));
	}
	
	private static WebElement logInOrSignUp() {
		return driver.findElement(By.cssSelector("#maincontent > div > p > b:nth-child(5)"));
	}
	
	// Actions
	
	public String getLogInOrSignUpText() {
		return logInOrSignUp().getText();
	}

}
