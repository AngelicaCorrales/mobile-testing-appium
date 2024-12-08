package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class SearchScreen extends BaseMobileScreen {

    private MyMobileElement searchInput = new MyMobileElement(driver, By.id("com.imdb.mobile:id/search_src_text"));

    private MyMobileElement firstResultLayout= new MyMobileElement(driver, By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.imdb.mobile:id/holder\"])[2]"));

    private MyMobileElement selectedMovieTitle= new MyMobileElement(driver, By.id("com.imdb.mobile:id/title"));

    public SearchScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public void searchMovie(String text){
        searchInput.click();
        searchInput.sendKeys(text);
    }

    public void clickFirstResult(){
        firstResultLayout.click();
    }

    public String getSelectedMovieTitle(){
        return selectedMovieTitle.getText();
    }


}
