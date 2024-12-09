package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class RatingHistoryScreen extends BaseMobileScreen {

    private MyMobileElement mostRecentRatingLayout= new MyMobileElement(driver, MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.imdb.mobile:id/primary_view\").instance(0)"));
    private  MyMobileElement backButton= new MyMobileElement(driver, By.className("android.widget.ImageButton"));

    public RatingHistoryScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickBack(){
        backButton.click();
    }

    public void clickMostRecentRating(){
        mostRecentRatingLayout.click();
    }
}
