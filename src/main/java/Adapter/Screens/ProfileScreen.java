package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class ProfileScreen extends BaseMobileScreen {

    private final MyMobileElement signInButton = new MyMobileElement(driver, By.id("com.imdb.mobile:id/sign_in_button"));

    private final MyMobileElement watchlistButton = new MyMobileElement(driver, By.id("com.imdb.mobile:id/user_watchlists"));

    public ProfileScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickSignIn(){
        signInButton.click();
    }

    public void clickWatchlist(){
        watchlistButton.click();
    }

}