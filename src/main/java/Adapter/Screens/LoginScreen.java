package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;


public class LoginScreen extends BaseMobileScreen {

    private  MyMobileElement continueButton = new MyMobileElement(driver, By.id("com.imdb.mobile:id/welcome_dialog_continue"));

    private  MyMobileElement notNowButton = new MyMobileElement(driver, By.id("com.imdb.mobile:id/splash_not_now"));

    private  MyMobileElement signInWithImdbButton = new MyMobileElement(driver, By.id("com.imdb.mobile:id/imdb_auth_portal"));

    private  MyMobileElement emailPhoneNumberInput = new MyMobileElement(driver, By.xpath("//android.webkit.WebView[@text=\"IMDb Sign-In\"]/android.view.View/android.view.View[2]/android.view.View[3]/android.widget.EditText"));

    private  MyMobileElement passwordInput = new MyMobileElement(driver, By.xpath("//android.webkit.WebView[@text=\"IMDb Sign-In\"]/android.view.View/android.view.View[2]/android.view.View[4]/android.widget.EditText"));

    private  MyMobileElement lastSignInButton = new MyMobileElement(driver, By.xpath("//android.widget.Button[@text=\"Sign in\"]"));

    public LoginScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickContinue(){
        continueButton.click();
    }

    public void clickNotNow(){
        notNowButton.click();
    }

    public void clickSignInWithImdb(){
        signInWithImdbButton.click();
    }

    public void enterEmailOrPhoneNumber(String emailPhoneNumber){
        emailPhoneNumberInput.sendKeys(emailPhoneNumber);
    }

    public void enterPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void clickLastSignIn(){
        lastSignInButton.click();
    }

    public void skipSignIn(){
        clickContinue();
        clickNotNow();
    }

    public void loginWithImdb(String emailPhoneNumber, String password){
        clickSignInWithImdb();
        enterEmailOrPhoneNumber(emailPhoneNumber);
        enterPassword(password);
        clickLastSignIn();
    }

}
