package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class XPathTests {

    WebDriver driver;


    @Test
    public void test001() throws Exception {
        String path = System.getProperty("user.dir") + "/src/test/resources/geckodriver";
        System.setProperty("webdriver.gecko.driver", path);
        driver = new FirefoxDriver();

        String url = "http://52.9.182.211:3001/v1/log-in";

        driver.get(url);

        String xPath1 = "/html/body/div/div/form/div/div[1]/div/input";
        String xPath2 = "//form/div/div[1]/div/input";
        String xPath3 = "//input[@name='restaurant_id']";


        String xPath4 = "/input[@name='email']";
        String xPath5 = "//input[@name='password'][@type='password']";
        String xPath6 = "//input[@name='password' and @type='password']";
        String xPath7 = "//input[@name='password' or @type='password']";
        String xPath8 = "//*[starts-with(@name,'pass')]";
        String xPath9 = "//*[text()='Log In";
        String xPath10 = "//*[@type='text'])[last()]";
        String xPath11 = "//*[@type='text'])[position()=1]";


        driver.findElement(By.xpath(xPath7));

    }
}
