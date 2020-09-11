package pages;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

import static pages.MyDevicesPageConstants.*;
import static utils.PageUtils.*;

public class MyDevicesPage {

    private static final Logger info = LoggerFactory.getLogger("info");

    public static int getAtRiskDevice() {
        return Integer.parseInt(getValueFromElement(AT_RISK_DEVICES_COUNTER));
    }

    public static int getProtectedDevice() {
        return Integer.parseInt(getValueFromElement(PROTECTED_DEVICES_COUNTER));
    }

    public static int getTotalDevices() {
        int totalDevices = getAtRiskDevice() + getProtectedDevice();
        setNumberOfDevices(totalDevices);
        return totalDevices;
    }

    public static HashMap<Integer, String> deviceList() {
        HashMap<Integer, String> list = new HashMap<>();
        int index = getNumberOfDevices();
        if (index != 0) {
            for (int i = 0; i < index; i++) {
                setId(i);
                list.put(i, getValueFromElement("div[id='div_1560241670_" + getId() + "']") + "/"
                        + getValueFromElement("span[id='span_1560511391_" + getId() + "']"));
            }
        }
        return list;
    }

    public static void getDevicesAtRisk() {
        HashMap<Integer, String> listOfDevices = deviceList();
        int numberOfDevices = listOfDevices.size();
        for (int i = 0; i < numberOfDevices; i++) {
            String deviceName = listOfDevices.get(i);
            if (deviceName.contains("At risk")) {
                String dn = deviceName.substring(0, deviceName.indexOf("/"));
                System.out.println("Device at risk: " + dn);
                info.info("Device at risk: [{}]", dn);
            }
        }
    }

    public static void openDevicePage(int deviceNumber) {
        click(getElementByCssSelector("div[id='div_1560241670_" + (deviceNumber - 1)));
        info.info("Device page opened for device number [{}].", deviceNumber);
    }
}
