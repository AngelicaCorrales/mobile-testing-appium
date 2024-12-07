package Adapter.Bases;


import Adapter.Screens.LoginScreen;
import Core.ConfigCapabilities;
import Core.MobileAppDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;


public class BaseMobileTest {
    protected AppiumDriver<WebElement> driver;

    protected LoginScreen loginScreen;

    @BeforeSuite(alwaysRun = true)
    public void SetUp(){
        ConfigCapabilities configCapabilities= new ConfigCapabilities();
        DesiredCapabilities desiredCapabilities= configCapabilities.GetCapabilities();
        MobileAppDriver mobileAppDriver= new MobileAppDriver();
        driver= mobileAppDriver.GetMoviesAppDriver(desiredCapabilities);
        loginScreen= new LoginScreen(driver);
    }

    @AfterSuite(alwaysRun = true)
    public void TearDown()
    {
        driver.quit();
    }
}



