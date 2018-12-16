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

    @Test
    public void test002() throws Exception {
        String keywordForSearch = "TestNG";
        String location = "San Francisco";

        openMainPage();
        typeKeyword(keywordForSearch);
        typeLocation(location);
        submitSearch();
        assertResultsPage();
    }

    // sign in test
    @Test
    public void test003() throws Exception {
        // openMainPage();
        // click SingIn button
        // type Email
        // type Password
        // click Login button
        // assert that you logged in
    }

    //advanced search
    @Test
    public void test004() throws Exception {
        // openMainPage();
        // click Advanced Search
        // type keyword
        // type city
        // scroll to slider
        // move slider to higher value
        // click advanced search
        // assert search was done
    }

    //search for part-time jobs
    @Test
    public void test_partTime() throws Exception {

    }

    //skills center
    @Test
    public void test_skills_Center() throws Exception {
        //click Career
        //chose skills center from dropdown list
        //type keyword
        //submit
        //assert search
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
