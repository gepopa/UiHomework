package pages;

public class MyDevicesPageConstants {

    public static final String DEVICES_PAGE = "/devices";
    public static final String AT_RISK_DEVICES_COUNTER = "h2[id='h2_1597843779']";
    public static final String PROTECTED_DEVICES_COUNTER = "h3[id='h3_1597843684']";
    public static final String DASHBOARD_TAB_SELECTOR = "a[id='a_1560846983']";
    public static final String DASHBOARD_TAB = "h3.card-title.ng-binding"; // NEED TO BE CHANGED
    public static final String PROTECTION_TAB_SELECTOR = "a[id='a_1560847141']";
    public static final String PROTECTION_TAB = "a[id='a_1560847141']"; // NEED TO BE CHANGED
    public static final String ANTI_THEFT_TAB_SELECTOR = "a[id='a_1560847222']";
    public static final String ANTI_THEFT_TAB = "a[id='a_156084698']"; // NEED TO BE CHANGED

    private static int id;
    private static int numberOfDevices;

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        MyDevicesPageConstants.id = id;
    }

    public static int getNumberOfDevices() {
        return numberOfDevices;
    }

    public static void setNumberOfDevices(int numberOfDevices) {
        MyDevicesPageConstants.numberOfDevices = numberOfDevices;
    }

}
