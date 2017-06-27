package com.itJack.bumpAndBabes.bdd.pageObjects;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

import com.itJack.bumpAndBabes.bdd.utils.WebConnector;

public class BasePage extends WebConnector {

	public WebDriverWait wait = new WebDriverWait(WebConnector.driver, 60);

	public String URL = "http://bumpandbabes.com/";

	public void navigateToHomePage() {
		driver.manage().window().maximize();
		driver.get(URL);
	}

	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Waiting functionality
	// ////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/**
	 * Allows selenium to pause for a set amount of time
	 *
	 * @param seconds
	 *            time to wait in seconds
	 */
	public void timeUnitWait(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			return;
		}
	}

	public WebElement waitForElementClickable(WebElement element) {
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public WebElement waitForVisibilityOfElement(WebElement element) {
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public WebElement waitForPresenceOfElement(String cssSelector) {
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(cssSelector)));
	}

	// /////////////////////////////////////////////////////////////////////////////////////////////////
	// Selenium actions functionality
	// /////////////////////////////////////////////////////////////////////////////////////////////////

	public void enterText(WebElement element, String text) {
		waitForVisibilityOfElement(element);
		element.clear();
		element.sendKeys(text);
	}

	public void clickOnWebElement(WebElement element) {
		try {
			waitForElementClickable(element).click();
		} catch (WebDriverException e) {
			throw new RuntimeException("Element not found on the page", e);
		}
	}

	public void clickOnLinks(String link) {
		WebElement element = driver.findElement(By.partialLinkText(link));
		try {
			waitForElementClickable(element).click();
		} catch (WebDriverException e) {
			throw new RuntimeException("Element not found on the page", e);
		}
	}

	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public void switchToActiveElement() {
		driver.switchTo().activeElement();
	}
	public void switchToFrame(int frameNum) {
		driver.switchTo().frame(frameNum);
	}

	public void refreshPage() {
		driver.navigate().refresh();
	}

	public Boolean isElementDisplayed(String expression) {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(expression)));
		WebElement element = driver.findElement(By.cssSelector(expression));
		return element.isDisplayed();
	}

	public static void clickOnCookie() {
		Boolean isAcceptCookieButtonPresent = driver.findElements(By.id("acceptCookie")).size() > 0;
		if (isAcceptCookieButtonPresent) {
			driver.findElement(By.id("acceptCookie")).click();
		}
	}

	/**
	 * Asserts WebElement is displayed
	 *
	 * @param expression
	 *            String used inside css selector
	 */
	public void assertURL(String actualURL, String expectedURL) {
		actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}

	public void assertWebElementPresence(String expression) {
		assertThat(isElementDisplayed(expression), is(true));
	}

	/**
	 * Asserts expected and actual text in web page
	 *
	 * @param element
	 *            String element
	 * @param expectedText
	 *            String text
	 */

	public void assertTextOnWebElement(WebElement element, String expectedText) {
		wait.until(ExpectedConditions.visibilityOf(element));
		String actualText = element.getText();
		assertThat(actualText, containsString(expectedText));
	}

	public void assertTextOnWebElement(String cssSelector, String expectedText) {
		String actualText = waitForPresenceOfElement(cssSelector).getText();
		assertThat(actualText, containsString(expectedText));
	}

	public void selectFromDropDown(WebElement element, String keyword) {
		Select dropDownOption = new Select(element);
		dropDownOption.selectByVisibleText(keyword);
	}
}
