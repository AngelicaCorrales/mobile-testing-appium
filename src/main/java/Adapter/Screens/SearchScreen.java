package Adapter.Screens;

import Adapter.Bases.BaseMobileScreen;
import Core.MyMobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import utils.RandomNumber;

public class SearchScreen extends BaseMobileScreen {

    private final MyMobileElement searchInput = new MyMobileElement(driver, By.id("com.imdb.mobile:id/search_src_text"));

    private final MyMobileElement moviesFilterButton = new MyMobileElement(driver, By.xpath("//android.widget.TextView[@resource-id=\"com.imdb.mobile:id/instant_filter\" and @text=\"Movies\"]"));

    private final MyMobileElement firstResultLayout= new MyMobileElement(driver, By.xpath("(//android.widget.TextView[@resource-id=\"com.imdb.mobile:id/suggestion\"])[1]"));

    private MyMobileElement randomResultLayout;


    public SearchScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    public void clickSearch(){
        searchInput.click();
    }

    public void enterSearch(String text){
        searchInput.sendKeys(text);
    }

    public void clickMoviesFilter(){
        moviesFilterButton.click();
    }

    public void searchMovie(String text){
        clickSearch();
        enterSearch(text);
        clickMoviesFilter();
    }

    public void clickFirstResult(){
        firstResultLayout.click();
    }

    public void setRandomResultLayout(){
        randomResultLayout= new MyMobileElement(driver, By.xpath("(//android.widget.TextView[@resource-id=\"com.imdb.mobile:id/suggestion\"])["+ RandomNumber.getRandomNumber(7)+"]"));
    }

    public void clickRandomResult(){
        setRandomResultLayout();
        randomResultLayout.click();
    }

}
