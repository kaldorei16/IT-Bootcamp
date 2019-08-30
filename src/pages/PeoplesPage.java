package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeoplesPage extends BaseClass {
	
	static WebDriver driver;

	public PeoplesPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Elements

	private static List<WebElement> peopleList() {
		return driver.findElements(By.cssSelector("div.bio div:not(.bio)"));
	}
	
	// Actions
	
	public List<String> getPeopleInfo() {
		List<String> infoPeople = new ArrayList<String>();
		for(int i = 0; i < peopleList().size(); i++) {
			String s = peopleList().get(i).findElement(By.cssSelector("div.bio div:not(.bio) b")).getText();
			String s1 = "";
			if(!(i == 14 || i == 15)) {
			s1 = peopleList().get(i).findElement(By.cssSelector("div.bio div:not(.bio):not(p) > i, a > i")).getText();
			}
			infoPeople.add(s+" "+s1);
		}
		return infoPeople;
	}
}
