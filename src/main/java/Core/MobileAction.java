package Core;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileAction {
    private AppiumDriver<MobileElement> driver;
    private WebDriverWait wait;


    public MobileAction(AppiumDriver<MobileElement> driver) {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, 30);

    }

    public void scrollToElementByText(String text) {
        WebDriverWait wait = new WebDriverWait(driver, 60);

        try {
            wait.until(driver -> {
                try {
                    driver.findElement(MobileBy.AndroidUIAutomator(
                            "new UiScrollable(new UiSelector().scrollable(true))" +
                                    ".scrollIntoView(new UiSelector().text(\"" + text + "\"))"));
                    return true;
                } catch (NoSuchElementException e) {
                    return false;
                }
            });
        } catch (Exception e) {
            throw new NoSuchElementException("Element with text \"" + text + "\" not found after scrolling and waiting.");
        }
    }
}
