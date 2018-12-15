package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DiceTests {

    WebDriver driver;
    String mainPage = "https://www.dice.com/";
    By searchFieldKeyword = By.id("search-field-keyword");

    @Test
    public void test001() throws Exception {
        String keywordForSearch = "Webdriver";

        openMainPage();
        typeKeyword(keywordForSearch);
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
