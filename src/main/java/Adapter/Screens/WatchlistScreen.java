package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class WatchlistScreen extends BaseMobileScreen {

    private final MyMobileElement lastWatchlistMovieLayout = new MyMobileElement(driver, By.xpath("(//android.view.ViewGroup[@resource-id=\"com.imdb.mobile:id/primary_view\"])[last()]"));

    public WatchlistScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickLastWatchListMovie(){
        lastWatchlistMovieLayout.click();
    }
}
