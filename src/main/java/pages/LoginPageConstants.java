package pages;

public class LoginPageConstants {

    //SELECTORS

    public static final String LOGIN_PAGE = "https://central.bitdefender.com";
    public static final String LOGIN_EMAIL_FIELD = "input[id='username']";
    public static final String LOGIN_PASSWORD_FIELD = "input[id='password_input']";
    public static final String NEXT_BUTTON_ON_LOGIN_PAGE = "button[id='login-next']";
    public static final String SUBMIT_BUTTON_ON_LOGIN_PAGE = "button[id='password-sign-in']";
    public static final String USER_DISPLAYED_NAME_ON_TOP_BAR_SELECTOR = "body > app-root > ui-drawer > drawer-main > app-header > ui-toolbar > div.toolbar-content.right > button.d-flex.align-items-center.user-area.btn.solid.clear > span";

    //VALUES
    public static final String VALID_USERNAME_VALUE = System.getenv("username");
    public static final String VALID_PASSWORD_VALUE = System.getenv("password");

}
