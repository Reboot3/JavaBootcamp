package day3;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import javax.swing.*;

public class DiceTests {

    WebDriver driver;
    String mainPage = "https://www.dice.com/";

    By searchFieldKeyword = By.id("search-field-keyword");
    By searchFieldLocation = By.id("search-field-location");
    By searchButton = By.id("findTechJobs");
    By countMobileId = By.id("posiCountId");
    By signinButtonId = By.id("Login_1");
    By emailFieldId = By.id("Email_1");
    By passwordFieldId = By.id("Password_1");
    By loginButtonId = By.id("LoginBtn_1");
    By accountNameId = By.id("dice-login-customer-name");
    By signoutButton = By.cssSelector("button.btn.btn-link");
    By advancedSearchBtn = By.xpath("//*[text()='Advanced Search']");


    //Advanced Search
    By searchKeywords = By.id("for_one");
    By searchLocationField = By.id("for_loc");
    By searchRadiusSlider = By.id("radiusMileAnchor");
    By advancedSearchButton = By.id("adv_search");
    By searchResultHeader = By.cssSelector("h1.pull-left.h1.jobs-page-header-h1");
    By navBarButton = By.xpath("//button[@class='navbar-toggle']");


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
         openMainPage();
         signinButton().click();
         String email = "a6509960921@gmail.com";
         emailTextField().sendKeys(email);
         passwordTextField().sendKeys("MySecurePassword2019");
         logingButton().click();
         boolean elementDisplayed = accountName().isDisplayed();
         Assert.assertTrue(elementDisplayed);
         String userName = accountName().getText();
         Assert.assertEquals(userName, "Aleksei Petrovski");
         accountName().click();
         signoutButton().click();
         Assert.assertEquals(pageTitle(), "Sign In");
    }

    //advanced search
    @Test
    public void test004() throws Exception {
         openMainPage();
         advanced_search_button().click();
         searchKeywordsField().sendKeys("QA");
        searchLocationField().clear();
         searchLocationField().sendKeys("Los Altos, CA");
         scrollToElement(radiusSearchSlider());
         moveRadiusToValue("75 miles");
         advancedSearchButton().click();

         waitForElement(searchResultHeader);
         String jobTitle = searchResultHeader().getText();
         Assert.assertEquals(jobTitle, "(QA) jobs in Los Altos, CA");
    }

    //Responsive design
    @Test
    public void test005() {
        openMainPage();
        boolean isDisplayed = navBarToggleButton().isDisplayed();
        Assert.assertFalse(isDisplayed);
        Dimension dimension = new Dimension(991, 800);
        driver.manage().window().setSize(dimension);
        isDisplayed = navBarToggleButton().isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    private WebElement navBarToggleButton() {
        return driver.findElement(navBarButton);
    }

    private WebElement searchResultHeader() {
        return driver.findElement(searchResultHeader);
    }

    private WebElement advancedSearchButton() {
        return driver.findElement(advancedSearchButton);
    }

    private void moveRadiusToValue(String radius) {
        //TODO update method to move slider to radius value
        radiusSearchSlider().sendKeys(Keys.ARROW_RIGHT);
    }

    private WebElement radiusSearchSlider() {
        return driver.findElement(searchRadiusSlider);
    }

    private WebElement searchLocationField() {
        return driver.findElement(searchLocationField);
    }

    private WebElement searchKeywordsField() {
        return driver.findElement(searchKeywords);
    }

    private WebElement advanced_search_button() {
        return driver.findElement(advancedSearchBtn);
    }

    private void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
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

    private WebElement signinButton() {
        return driver.findElement(signinButtonId);
    }

    private String pageTitle() {
        return driver.getTitle();
    }

    private WebElement signoutButton() {
        return driver.findElement(signoutButton);
    }

    private WebElement accountName() {
        return driver.findElement(accountNameId);
    }

    private WebElement logingButton() {
        return driver.findElement(loginButtonId);
    }

    private WebElement passwordTextField() {
        return driver.findElement(passwordFieldId);
    }

    private WebElement emailTextField() {
        return driver.findElement(emailFieldId);
    }

    @BeforeSuite
    public void setup(){
        String path = System.getProperty("user.dir") + "/src/test/resources/geckodriver";
        System.setProperty("webdriver.gecko.driver", path);
        driver = new FirefoxDriver();
    }
}










