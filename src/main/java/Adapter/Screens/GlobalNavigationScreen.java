package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlobalNavigationScreen extends BaseMobileScreen {

    @FindBy(id = "com.imdb.mobile:id/navigation_home")
    private WebElement homeIcon;

    @FindBy(id="com.imdb.mobile:id/navigation_search_browse")
    private WebElement searchIcon;

    @FindBy(id="com.imdb.mobile:id/navigation_video")
    private WebElement videoIcon;

    @FindBy(id ="com.imdb.mobile:id/navigation_user_profile")
    private WebElement profileIcon;

    public GlobalNavigationScreen(AppiumDriver<WebElement> driver){
        super(driver);
    }

    public void goToHomeOption(){
        homeIcon.click();
    }

    public void goToSearchOption(){
        searchIcon.click();
    }

    public void goToVideoOption(){
        videoIcon.click();
    }

    public void goToProfileOption(){
        profileIcon.click();
    }


}
