import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

interface Selenium {
    void findElement();
    void get();
    void getTitle();
}


public class AleksWebDriver implements Selenium {
    public void findElement() {
        // actual code implementation
    }

    public void get() {
        // actual code implementation
    }

    public void getTitle() {
        // actual code implementation
    }
}


class Example {
    Selenium driver;

    @BeforeSuite
    public void setup(){
        String path = System.getProperty("user.dir") + "/src/test/resources/geckodriver";
        System.setProperty("webdriver.gecko.driver", path);
        driver = new AleksWebDriver();
    }

    @Test
    public void test001() throws Exception {
       driver = new PortnovWebDriver();

    }
}


