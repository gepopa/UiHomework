package popUps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static popUps.ProtectYourDevicesConstants.PROTECT_YOUR_DEVICES_POP_UP;
import static popUps.ProtectYourDevicesConstants.PYD_POP_UP_CLOSE_BUTTON;
import static popUps.WelcomePopUpConstants.CONTINUE_TRIAL_BUTTON;
import static popUps.WelcomePopUpConstants.WELCOME_POP_UP;
import static utils.PageUtils.click;
import static utils.PageUtils.getElementByCssSelector;

public class PopUpUtils {

    private static final Logger info = LoggerFactory.getLogger("info");

    public static boolean isPopUpDisplayed(String element) {
        return getElementByCssSelector(element).isDisplayed();
    }

    public static void closePopUp(String element) {
        click(getElementByCssSelector(element));
    }

    public static void skipPopUps() {
        if (isPopUpDisplayed(WELCOME_POP_UP)) {
            closePopUp(CONTINUE_TRIAL_BUTTON);
            info.info("Click on CONTINUE TRIAL.");
        } else if (isPopUpDisplayed(PROTECT_YOUR_DEVICES_POP_UP)) {
            closePopUp(PYD_POP_UP_CLOSE_BUTTON);
            info.info("Close the PROTECT YOUR DEVICES POP UP pop-up.");
        }
    }
}
