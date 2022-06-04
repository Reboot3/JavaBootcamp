package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UITestsDay2 {

    @Test
    public void test001() {
        String path = System.getProperty("user.dir") + "/src/test/resources/geckodriver";
        System.setProperty("webdriver.gecko.driver", path);

        WebDriver driver = new FirefoxDriver();

        driver.get("http://google.com");
    }
}
