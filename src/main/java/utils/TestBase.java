package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBase {
    public static WebDriver driver;

    private static final Logger info = LoggerFactory.getLogger("info");

    public static void setup(String link) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver85");
        driver = new ChromeDriver();
        driver.get(link);
        info.info("Open a new Chrome Browser with: [{}]", link);
    }


    public static void tearDown() {
        driver.close();
        info.info("Close the focused browser.");
    }

}
