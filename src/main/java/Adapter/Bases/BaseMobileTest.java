package Adapter.Bases;


import Adapter.Screens.GlobalNavigationScreen;
import Adapter.Screens.LoginScreen;
import Adapter.Screens.SearchScreen;
import Core.ConfigCapabilities;
import Core.MobileAppDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;


public class BaseMobileTest {
    protected AppiumDriver<MobileElement> driver;

    protected LoginScreen loginScreen;
    protected GlobalNavigationScreen globalNavigationScreen;
    protected SearchScreen searchScreen;

    @BeforeSuite(alwaysRun = true)
    public void SetUp(){
        ConfigCapabilities configCapabilities= new ConfigCapabilities();
        DesiredCapabilities desiredCapabilities= configCapabilities.GetCapabilities();
        MobileAppDriver mobileAppDriver= new MobileAppDriver();
        driver= mobileAppDriver.GetMoviesAppDriver(desiredCapabilities);
        loginScreen= new LoginScreen(driver);
        globalNavigationScreen= new GlobalNavigationScreen(driver);
        searchScreen =new SearchScreen(driver);
    }

    @AfterSuite(alwaysRun = true)
    public void TearDown()
    {
        driver.quit();
    }
}



