package Adapter.Bases;


import Adapter.Screens.*;
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
    protected ProfileScreen profileScreen;
    protected MovieDetailsScreen movieDetailsScreen;
    protected WatchlistScreen watchlistScreen;

    @BeforeSuite(alwaysRun = true)
    public void SetUp(){
        ConfigCapabilities configCapabilities= new ConfigCapabilities();
        DesiredCapabilities desiredCapabilities= configCapabilities.GetCapabilities();
        MobileAppDriver mobileAppDriver= new MobileAppDriver();
        driver= mobileAppDriver.GetMoviesAppDriver(desiredCapabilities);
        loginScreen= new LoginScreen(driver);
        globalNavigationScreen= new GlobalNavigationScreen(driver);
        searchScreen =new SearchScreen(driver);
        profileScreen= new ProfileScreen(driver);
        movieDetailsScreen= new MovieDetailsScreen(driver);
        watchlistScreen= new WatchlistScreen(driver);
    }

    @AfterSuite(alwaysRun = true)
    public void TearDown()
    {
        driver.quit();
    }
}



