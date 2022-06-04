package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        typeQuery("Automation");
        submitQuery();
        checkResult();
    }

    private void checkResult() {
       boolean isDisplayed = driver.findElement(By.id("resultStats")).isDisplayed();
        System.out.println("isDisplayed:" + isDisplayed);
    }

    private void submitQuery() {
        driver.findElement(By.cssSelector(".FPdoLc > center:nth-child(1) > input:nth-child(1)")).click();
    }

    private void typeQuery(String query) {
        WebElement webElement = driver.findElement(By.cssSelector(".gLFyf"));
        webElement.sendKeys(query);
    }

    private void openMainPage() {
        driver.get("http://google.com");
    }
}
