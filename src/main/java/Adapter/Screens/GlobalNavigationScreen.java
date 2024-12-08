package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class GlobalNavigationScreen extends BaseMobileScreen {

    private final MyMobileElement homeIcon= new MyMobileElement(driver, By.id("com.imdb.mobile:id/navigation_home"));

    private final MyMobileElement searchIcon= new MyMobileElement(driver, By.id("com.imdb.mobile:id/navigation_search_browse"));

    private final MyMobileElement videoIcon= new MyMobileElement(driver, By.id("com.imdb.mobile:id/navigation_video"));

    private final MyMobileElement profileIcon= new MyMobileElement(driver, By.id("com.imdb.mobile:id/navigation_user_profile"));

    public GlobalNavigationScreen(AppiumDriver<MobileElement> driver){
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
