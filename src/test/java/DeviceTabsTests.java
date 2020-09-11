import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static menus.LeftSlidingNavMenu.openLeftSlider;
import static menus.LeftSlidingNavMenu.selectMyDevices;
import static pages.MyDevicesPage.*;
import static pages.MyDevicesPageConstants.*;
import static utils.PageUtils.getElementByCssSelector;
import static utils.PageUtils.selectButton;

public class DeviceTabsTests {

    private static final Logger info = LoggerFactory.getLogger("info");

    @DataProvider(name = "tabProvider")
    public Object[][] createData1() {
        return new Object[][]{
                {PROTECTION_TAB_SELECTOR, PROTECTION_TAB},
                {ANTI_THEFT_TAB_SELECTOR, ANTI_THEFT_TAB},
                {DASHBOARD_TAB_SELECTOR, DASHBOARD_TAB},
        };
    }

    @Test(dependsOnMethods = "LoginTests.canLoginWithValidCredentials")
    public static void openDevicePageFromMyDevices() {
        openLeftSlider();
        selectMyDevices();
        openDevicePage(2);
    }

    @Test(dataProvider = "tabProvider", dependsOnMethods = "openDevicePageFromMyDevices")
    public void openTab(String tab, String displayedTab) {
        info.info("Running tests for [{}]", displayedTab);
        boolean tabIsDisplayed = getElementByCssSelector(displayedTab).isDisplayed();
        selectButton(tab);
        Assert.assertTrue(tabIsDisplayed);
    }
}
