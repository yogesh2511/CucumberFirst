package CIVICA.CucumberFramework.testBase;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriver driver = null;
	public static Logger log = Logger.getLogger(TestBase.class.getName());

	@BeforeSuite
	public static WebDriver intializeDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} else {
			System.out.println("invalid browser name");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}

	public static WebElement waitElement(WebElement element) {

		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
		WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));
		return ele;
	}

	public static List<WebElement> waitElements(WebElement element) {

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(100))
				.pollingEvery(Duration.ofMillis(600)).ignoring(NoSuchElementException.class);
		List<WebElement> foo = wait.until(ExpectedConditions.visibilityOfAllElements(element));
		if (foo.isEmpty())
			log.info("webElement is empty");
		else
			return foo;
		System.out.println("size=" + foo.size());
		return foo;
	}

	public static void click(WebElement element) {
		waitElement(element);
		element.click();
	}

	public static void clear(WebElement element) {
		waitElement(element);
		element.clear();
	}

	public static void sendKeys(WebElement element, String keyword) {
		waitElement(element);
		element.clear();
		element.sendKeys(keyword);
	}

	public static boolean isPageLoaded(WebElement element) {

		waitElement(element);
		return element.isDisplayed();

	}

	public static boolean isElementPresent(WebElement element) {

		waitElement(element);
		log.info("element is present:" + element.toString());
		return element.isDisplayed();

	}

	public static String getText(WebElement element) {
		waitElement(element);
		return element.getText();
	}

	public static WebElement linkText(WebElement element, String Keyword) {
		waitElement(element);
		return element = driver.findElement(By.partialLinkText(Keyword));
	}

	public static String getAttributeVolume(WebElement element, String attribute) {
		waitElement(element);
		return element.getAttribute(attribute);
	}

	public static void Select(WebElement element, String visibletext) {

		Select oSelect = new Select(element);
		List<WebElement> oSize = oSelect.getOptions();
		int iListSize = oSize.size();
		for (int i = 0; i < iListSize; i++) {
			// Storing the value of the option
			String sValue = oSelect.getOptions().get(i).getText();
			// Printing the stored value
			System.out.println(sValue);
			// Putting a check on each option that if any of the option is equal
			// to 'Africa" then select it
			if (sValue.equals(visibletext)) {
				oSelect.selectByIndex(i);
				break;
			}
		}
	}

	public static void JavaExecute(WebElement element) {
		waitElement(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
