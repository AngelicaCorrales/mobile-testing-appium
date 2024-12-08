package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class MovieDetailsScreen extends BaseMobileScreen {

    private final MyMobileElement movieTitle= new MyMobileElement(driver, By.id("com.imdb.mobile:id/title"));

    private final MyMobileElement addToWatchlistButton = new MyMobileElement(driver, By.id("com.imdb.mobile:id/watchlist_button"));

    private final MyMobileElement backButton= new MyMobileElement(driver, By.xpath("//android.widget.ImageButton"));

    private final MyMobileElement notificationNotNowButton= new MyMobileElement(driver,By.id("com.imdb.mobile:id/notification_not_now"));

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
}
