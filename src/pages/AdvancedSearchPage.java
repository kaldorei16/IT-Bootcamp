package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearchPage {
	
	static WebDriver driver;

	public AdvancedSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	// Elements
	
	 private static List<WebElement> containsList() {
	        return driver.findElements(By.cssSelector("div.col-sm-2 select"));    
	    }
	    private static List<WebElement> date_AllMediaTypesList() {
	        return driver.findElements(By.cssSelector("div.col-sm-7 select"));    
	    }
	    private static List<WebElement> leftEmptyBoxList() {
	        return driver.findElements(By.cssSelector("div.col-sm-2 input"));    
	    }
	    private static WebElement searchAdvancedButton1() {
	        return driver.findElement(By.cssSelector("center input.btn.btn-primary"));    
	    }
	    private static WebElement searchAdvancedButton2() {
	        return driver.findElement(By.cssSelector("#rawform input.btn.btn-primary"));    
	    }
	    private static List<WebElement> radioButtonBoxList() {
	        return driver.findElements(By.cssSelector("tbody input[type=radio]"));    
	    }
	    private static WebElement numberOfResultsBox() {
	        return driver.findElement(By.id("numresults"));    
	    }
	    private static WebElement pageBox() {
	        return driver.findElement(By.name("page"));    
	    }
	    private static List<WebElement> sortResultsBoxList() {
	        return driver.findElements(By.cssSelector("#rawform div:nth-child(5) select"));    
	    }
	    private static List<WebElement> fieldsToReturnList() {
	        return driver.findElements(By.cssSelector("#rawform > div:nth-child(4) > select option"));    
	    }
	    private static WebElement queryBox() {
	        return driver.findElement(By.className("form-control.input-sm"));    
	    }

}
