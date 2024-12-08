package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;


public class LoginScreen extends BaseMobileScreen {

    private MyMobileElement continueButton = new MyMobileElement(driver, By.id("com.imdb.mobile:id/welcome_dialog_continue"));

    private MyMobileElement notNowButton = new MyMobileElement(driver, By.id("com.imdb.mobile:id/splash_not_now"));

    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickContinue(){
        continueButton.click();
    }

    public void clickNotNow(){
        notNowButton.click();
    }

    public void skipSignIn(){
        clickContinue();
        clickNotNow();
    }

}
