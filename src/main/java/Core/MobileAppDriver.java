package Core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class MobileAppDriver {
    private AppiumDriver<MobileElement> driver;

    public AppiumDriver<MobileElement> GetMoviesAppDriver(DesiredCapabilities capabilities)  {
            try {
                driver = new AppiumDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        return driver;
    }
}
