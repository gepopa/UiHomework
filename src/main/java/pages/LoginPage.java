package pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static pages.LoginPageConstants.*;
import static utils.PageUtils.*;

public class LoginPage {
    private static final Logger info = LoggerFactory.getLogger("info");

    public static void openLoginPage() {
        openPage(LOGIN_PAGE);
        info.info("Login page opened.");
    }

    public static void completeUsernameFieldWith(String username) {
        completeField(getElementByCssSelector(LOGIN_EMAIL_FIELD), username);
        info.info("Filled the email field with [{}]", username);
    }

    public static void completePasswordFieldWith(String password) {
        completeField(getElementByCssSelector(LOGIN_PASSWORD_FIELD), password);
        info.info("Filled the password field with [{}]", password);
    }

}
