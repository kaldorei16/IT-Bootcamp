package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ArchiveNavPage extends BaseClass {

	static WebDriver driver;

	public ArchiveNavPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	// Elements

	private static List<WebElement> navBar() {
		return driver.findElements(By.cssSelector("ul.navbar-main li.pull-left"));
	}

	private static WebElement searchUrl() {
		return driver.findElement(By.name("url"));
	}

	private static List<WebElement> hiddenNavBar() {
		return driver.findElements(By.cssSelector("div.widgets center.items_list"));
	}

	private static List<WebElement> linkTextNav() {
		return driver.findElements(By.cssSelector("div.linx a"));
	}

	private static List<WebElement> linksNav() {
		return driver.findElements(By.cssSelector("ul#nav-abouts > li"));
	}

	private static WebElement logo() {
		return driver.findElement(By.cssSelector("a.navbar-brand"));
	}

	private static WebElement signIn() {
		return driver.findElement(By.cssSelector("a.nav-user"));
	}
	
	private static WebElement signedIn() {
		return driver.findElement(By.cssSelector("a#user-menu"));
	}

	private static WebElement upload() {
		return driver.findElement(By.cssSelector("a.nav-upload"));
	}
	
	private static WebElement searchBar() {
		return driver.findElement(By.name("search"));
	}
	
	private static WebElement searchBtn() {
		return driver.findElement(By.cssSelector("li#nav-search a"));
	}

//	private static WebElement web() {
//		return driver.findElement(By.cssSelector("a.navia-link.web"));
//	}
//
//	private static WebElement texts() {
//		return driver.findElement(By.cssSelector("a.navia-link.texts"));
//	}
//
//	private static WebElement video() {
//		return driver.findElement(By.cssSelector("a.navia-link.movies"));
//	}
//
//	private static WebElement audio() {
//		return driver.findElement(By.cssSelector("a.navia-link.audio"));
//	}
//
//	private static WebElement software() {
//		return driver.findElement(By.cssSelector("a.navia-link.software"));
//	}
//
//	private static WebElement image() {
//		return driver.findElement(By.cssSelector("a.navia-link.image"));
//	}

	// Actions
	
	public void inputSearchUrl() {
		searchUrl().sendKeys("qa");
	}
	
	public void clickSearchUrl() {
		searchUrl().sendKeys(Keys.RETURN);
	}
	
	public void inputSearchBar() {
		searchBar().sendKeys("qa");
	}

	public void clickNavBar(Integer i) {
		navBar().get(i).click();
	}

	public void clickHiddenNavBar(Integer i) {
		hiddenNavBar().get(i).click();
	}

	public void clickLinksNav(Integer i) {
		linksNav().get(i).click();
	}

	public void clickLinkTextNav(Integer i) {
		linkTextNav().get(i).click();
	}

	public void clickLogo() {
		logo().click();
	}

	public void clickSignIn() {
		signIn().click();
	}
	
	public void clickUser() {
		signedIn().click();
	}

	public void clickUpload() {
		upload().click();
	}
	
	public void clickSearchBtn() {
		searchBtn().click();
	}

//	public void clickWeb() {
//		web().click();
//	}
//
//	public void clickTexts() {
//		texts().click();
//	}
//
//	public void clickVideo() {
//		video().click();
//	}
//
//	public void clickaAudio() {
//		audio().click();
//	}
//
//	public void clickSoftware() {
//		software().click();
//	}
//
//	public void clickImage() {
//		image().click();
//	}

}
