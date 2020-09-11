import org.testng.Assert;
import org.testng.annotations.Test;

import static pages.DashboardPageConstants.ACTIVITY_MODAL;
import static pages.DashboardPageConstants.ACTIVITY_MODAL_TEXT;
import static utils.PageUtils.getValueFromElement;

public class ActivityModalTests {
    @Test(dependsOnMethods = "LoginTests.canLoginWithValidCredentials")
    public static void checkActivityModal() {
        Assert.assertEquals(getValueFromElement(ACTIVITY_MODAL), ACTIVITY_MODAL_TEXT);
    }
}
