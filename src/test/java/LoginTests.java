
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import static pages.DashboardPageConstants.*;
import static pages.LoginPage.*;
import static pages.LoginPageConstants.*;
import static popUps.PopUpUtils.skipPopUps;
import static utils.PageUtils.*;

public class LoginTests {

    @Test
    public static void canLoginWithValidCredentials() {
        openLoginPage();
        completeUsernameFieldWith(VALID_USERNAME_VALUE);
        selectButton(NEXT_BUTTON_ON_LOGIN_PAGE);
        completePasswordFieldWith(VALID_PASSWORD_VALUE);
        selectButton(SUBMIT_BUTTON_ON_LOGIN_PAGE);
        skipPopUps();
        Assert.assertEquals(getValueFromElement(USER_DISPLAYED_NAME_ON_TOP_BAR_SELECTOR), EXPECTED_USERNAME_DISPLAYED);
    }

    @AfterSuite(alwaysRun = true)
    private static void closeBrowser() {
        tearDown();
    }
}
