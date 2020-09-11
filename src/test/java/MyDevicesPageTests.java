
import org.testng.annotations.Test;

import static menus.LeftSlidingNavMenu.openLeftSlider;
import static menus.LeftSlidingNavMenu.selectMyDevices;
import static pages.MyDevicesPage.*;


public class MyDevicesPageTests {
    @Test(dependsOnMethods = "ActivityModalTests.checkActivityModal")
    public static void getDevicesNames() {
        System.out.println("Total devices: " + getTotalDevices());
        openLeftSlider();
        selectMyDevices();
        getDevicesAtRisk();
    }
}
