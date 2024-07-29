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
        driver.navigate().back();

        // Locator is not unique
        // WebElement menuElementAnimation = driver.findElement(AppiumBy.id("android:id/text1"));
        WebElement menuElementAnimation = driver.findElement(AppiumBy.xpath("//*[@text='Animation']")); // Custom xpath locator
        menuElementAnimation.click();
        driver.navigate().back();

        // Locator is not unique
        // WebElement menuElementApp = driver.findElement(AppiumBy.className("android.widget.TextView"));
        WebElement menuElementApp = driver.findElements(AppiumBy.className("android.widget.TextView")).get(4);
        menuElementApp.click();
        driver.navigate().back();

        WebElement menuElementContent = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Content']"));
        menuElementContent.click();
        driver.navigate().back();
    }
}
