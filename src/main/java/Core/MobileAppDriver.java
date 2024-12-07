package Core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileAppDriver {
    private AppiumDriver<WebElement> driver;

    public AppiumDriver<WebElement> GetMoviesAppDriver(DesiredCapabilities capabilities)  {
            try {
                driver = new AppiumDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        return driver;
    }
}
