package Adapter.Bases;


import Core.ConfigCapabilities;
import Core.MobileAppDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;


public class BaseMobileTest {
    public AndroidDriver<AndroidElement> driver;

    @BeforeSuite(alwaysRun = true)
    public void SetUp(){
        ConfigCapabilities configCapabilities= new ConfigCapabilities();
        DesiredCapabilities desiredCapabilities= configCapabilities.GetCapabilities();
        MobileAppDriver mobileAppDriver= new MobileAppDriver();
        driver= mobileAppDriver.GetMoviesAppDriver(desiredCapabilities);

    }

    @AfterSuite(alwaysRun = true)
    public void TearDown()
    {
        driver.quit();
    }
}



