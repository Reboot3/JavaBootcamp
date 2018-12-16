package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DiceTests {

    WebDriver driver;
    String mainPage = "https://www.dice.com/";

    By searchFieldKeyword = By.id("search-field-keyword");
    By searchFieldLocation = By.id("search-field-location");
    By searchButton = By.id("findTechJobs");
    By countMobileId = By.id("posiCountId");

    @Test
    public void test001() throws Exception {
        String keywordForSearch = "Webdriver";
        String location = "San Francisco";

        openMainPage();
        typeKeyword(keywordForSearch);
        typeLocation(location);
        submitSearch();
        assertResultsPage();
    }

    private void assertResultsPage() {
        waitForElement(countMobileId);
        boolean isDisplayed = driver.findElement(countMobileId).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    private void waitForElement(By elementLocator) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
    }

    private void submitSearch() {
        driver.findElement(searchButton).click();
    }

    private void typeLocation(String location) {
        driver.findElement(searchFieldLocation).clear();
        driver.findElement(searchFieldLocation).sendKeys(location);
    }

    private void typeKeyword(String keywordForSearch) {
        driver.findElement(searchFieldKeyword).sendKeys(keywordForSearch);
    }

    private void openMainPage() {
        driver.get(mainPage);
    }

    @BeforeSuite
    public void setup(){
        String path = System.getProperty("user.dir") + "/src/test/resources/geckodriver";
        System.setProperty("webdriver.gecko.driver", path);
        driver = new FirefoxDriver();
    }
}
