package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class RateScreen extends BaseMobileScreen {

    private  MyMobileElement rating10Button= new MyMobileElement(driver, By.id("star_10"));

    private  MyMobileElement rateButton= new MyMobileElement(driver, By.id("rate_title_button"));

    private  MyMobileElement yourRatingValueText= new MyMobileElement(driver, By.id("selected_rating"));

    private  MyMobileElement removeRatingButton= new MyMobileElement(driver, By.id("remove_rating"));

    public RateScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickRating10(){
        rating10Button.click();
    }

    public void clickRate(){
        rateButton.click();
    }

    public void addPerfectRate(){
        clickRating10();
        clickRate();
    }

    public String getYourRatingValue(){
        return yourRatingValueText.getText();
    }

    public void clickRemoveRating(){
        removeRatingButton.click();
    }


}
