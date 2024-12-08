package Adapter.Bases;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;;

public class BaseMobileScreen {

    protected AppiumDriver<MobileElement> driver;

    public BaseMobileScreen(AppiumDriver<MobileElement> driver)  {
        this.driver = driver;
    }

}


