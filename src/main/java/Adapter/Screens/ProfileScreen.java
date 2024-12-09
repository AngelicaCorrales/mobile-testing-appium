package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class ProfileScreen extends BaseMobileScreen {

    private  MyMobileElement signInButton = new MyMobileElement(driver, By.id("sign_in_button"));

    private  MyMobileElement watchlistButton = new MyMobileElement(driver, By.id("user_watchlists"));

    private MyMobileElement ratingsButton= new MyMobileElement(driver, By.id("user_ratings"));

    public ProfileScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickSignIn(){
        signInButton.click();
    }

    public void clickWatchlist(){
        watchlistButton.click();
    }

    public void clickRatings(){
        ratingsButton.click();
    }

}
