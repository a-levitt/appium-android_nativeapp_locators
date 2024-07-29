package alevitt;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;


public class NativeAppAndroidLocators {
    public static void main(String[] args) throws MalformedURLException{
        AppiumDriver driver = DriverInitialization.initializeDriver();

        WebElement menuElementAccessibility = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        menuElementAccessibility.click();


    }
}
