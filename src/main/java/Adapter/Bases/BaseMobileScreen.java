package Adapter.Bases;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BaseMobileScreen {

    protected AppiumDriver<WebElement> driver;

    public BaseMobileScreen(AppiumDriver<WebElement> driver)  {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

   // @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.Button\").textContains(\"Ok\")")
    //public MobileElement OkButton;

    public void findElement(){

    }

}


