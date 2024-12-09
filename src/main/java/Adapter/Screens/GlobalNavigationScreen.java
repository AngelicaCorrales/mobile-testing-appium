package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class GlobalNavigationScreen extends BaseMobileScreen {

    private  MyMobileElement homeIcon= new MyMobileElement(driver, By.id("navigation_home"));

    private  MyMobileElement searchIcon= new MyMobileElement(driver, By.id("navigation_search_browse"));

    private  MyMobileElement videoIcon= new MyMobileElement(driver, By.id("navigation_video"));

    private  MyMobileElement profileIcon= new MyMobileElement(driver, By.id("navigation_user_profile"));

    private MyMobileElement closeTipButton= new MyMobileElement(driver, By.id("com.imdb.mobile:id/exit"));

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

    public void closeTip(){
        closeTipButton.click();
    }


}
