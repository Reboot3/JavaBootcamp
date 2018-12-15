package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Day3UITests {

    WebDriver driver;

    @Test
    public void test001() throws Exception {
        String path = System.getProperty("user.dir") + "/src/test/resources/geckodriver";
        System.setProperty("webdriver.gecko.driver", path);

        driver = new FirefoxDriver();

        openMainPage();
        typeQuery();
       // submitQuery();
       // checkingResult();

    }

    private void typeQuery() {
        driver.findElement(By.cssSelector(".gLFyf"));
    }

    private void openMainPage() {
        driver.get("http://google.com");
    }
}
