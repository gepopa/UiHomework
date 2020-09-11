package menus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static menus.LeftSlidingNavMenuConstants.LEFT_MENU_BUTTON;
import static menus.LeftSlidingNavMenuConstants.LEFT_MENU_MY_DEVICES;
import static utils.PageUtils.selectButton;

public class LeftSlidingNavMenu {

    private static final Logger info = LoggerFactory.getLogger("info");

    public static void openLeftSlider(){
        selectButton(LEFT_MENU_BUTTON);
        info.info("Left sliding menu opened.");
    }

    public static void selectMyDevices(){
        selectButton(LEFT_MENU_MY_DEVICES);
        info.info("MY DEVICES option selected from the left sliding menu.");
    }

}
