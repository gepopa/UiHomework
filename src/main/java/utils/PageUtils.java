package utils;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

public class PageUtils extends TestBase {
    private static final Logger info = LoggerFactory.getLogger("info");

    public static WebElement getElementByCssSelector(String selector) {

        WebDriverWait wait = new WebDriverWait(driver, 5, 1000);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(selector)));
    }

    public static String getValueFromElement(String selector) {
        return getElementByCssSelector(selector).getText();
    }

    public static void completeField(WebElement element, String value) {
        element.sendKeys(value);
    }

    public static void click(WebElement element) {
        element.click();
    }

    public static void openPage(String pageLink) {
        setup(pageLink);
    }

    public static String getPageUrl() {
        return TestBase.driver.getCurrentUrl();
    }

    public static void selectButton(String button) {
        click(getElementByCssSelector(button));
        info.info("Click on: [{}]", button);
    }
}
