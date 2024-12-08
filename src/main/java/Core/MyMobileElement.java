package Core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyMobileElement {
    private AppiumDriver<MobileElement> driver;
    private By locator;
    private WebDriverWait wait;


    public MyMobileElement(AppiumDriver<MobileElement> driver, By locator) {
        this.driver = driver;
        this.locator = locator;
        this.wait = new WebDriverWait(driver, 30);
    }

    private MobileElement waitForVisibility() {
        return (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void click() {
        waitForVisibility().click();
    }

    public String getText() {
        return waitForVisibility().getText();
    }

    public void sendKeys(String text) {
        waitForVisibility().sendKeys(text);
    }

    public boolean isDisplayed() {
        try {
            return waitForVisibility().isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
