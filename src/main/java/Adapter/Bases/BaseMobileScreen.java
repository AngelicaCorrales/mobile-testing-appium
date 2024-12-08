package Adapter.Bases;


import Core.MobileAction;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;;

public class BaseMobileScreen {

    protected AppiumDriver<MobileElement> driver;
    protected MobileAction actor;

    public BaseMobileScreen(AppiumDriver<MobileElement> driver)  {
        this.driver = driver;
        actor= new MobileAction(driver);
    }

}


