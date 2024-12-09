package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class MovieDetailsScreen extends BaseMobileScreen {

    private  MyMobileElement movieTitle= new MyMobileElement(driver, By.id("title"));

    private MyMobileElement movieOverview= new MyMobileElement(driver, By.id("plot_overview"));

    private  MyMobileElement addToWatchlistButton = new MyMobileElement(driver, By.id("watchlist_button"));

    private  MyMobileElement backButton= new MyMobileElement(driver, By.className("android.widget.ImageButton"));

    private  MyMobileElement notificationNotNowButton= new MyMobileElement(driver,By.id("notification_not_now"));

    private  MyMobileElement rateButton = new MyMobileElement(driver, MobileBy.AndroidUIAutomator("new UiSelector().text(\"Your Rating\")"));

    private MyMobileElement ratingSavedMessage= new MyMobileElement(driver, MobileBy.AndroidUIAutomator("new UiSelector().text(\"Rating saved\")"));

    private MyMobileElement rateMoreCloseButton= new MyMobileElement(driver,By.id("rate_more_like_this_close"));

    public MovieDetailsScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void clickBack(){
        backButton.click();
    }
    public void clickNotificationNotNow(){
        if(notificationNotNowButton.isDisplayed()){
            notificationNotNowButton.click();
        }
    }

    public void clickAddToWatchlist(){
        addToWatchlistButton.click();
        clickNotificationNotNow();
    }

    public String getMovieTitle(){
        return movieTitle.getText();
    }

    public String getMovieOverview(){
        return movieOverview.getText();
    }

    public void scrollDownToUsersReviews(){
        actor.scrollDownToElementByText("User reviews");
    }

    public void clickRate(){
        rateButton.click();
    }

    public String getRatingSavedMessage(){
        return ratingSavedMessage.getText();
    }

    public void clickRateMoreClose(){
        if(rateMoreCloseButton.isDisplayed()){
            rateMoreCloseButton.click();
        }
    }

}
