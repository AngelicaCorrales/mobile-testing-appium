package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;

public class SearchScreen extends BaseMobileScreen {

    public SearchScreen(AppiumDriver<WebElement> driver) {
        super(driver);
    }

    public void searchMovie(){

    }
}
