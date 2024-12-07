package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class LoginScreen extends BaseMobileScreen {

    @FindBy(id = "com.imdb.mobile:id/welcome_dialog_continue")
    private WebElement continueButton;

    @FindBy(id="com.imdb.mobile:id/splash_not_now")
    private WebElement notNowButton;

    public LoginScreen(AppiumDriver<WebElement> driver) {
        super(driver);
    }

    public void clickContinue(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10L);
            WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(continueButton));
            if (clickableElement.isDisplayed()) {
                clickableElement.click();
            }
        }catch (NoSuchElementException e){
            System.out.println("ERROR CLICKING");
            throw e;
        }
        //continueButton.click();
    }

    public void clickNotNow(){
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10L);
            WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(notNowButton));
            if (clickableElement.isDisplayed()) {
                clickableElement.click();
            }
        }catch (NoSuchElementException e){
            System.out.println("ERROR CLICKING");
            throw e;
        }
        // notNowButton.click();
    }

    public void skipSignIn(){
        clickContinue();
        clickNotNow();
    }

}
