package alevitt;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.Arrays;


public class NativeAppAndroidLocators {
    @FindBy(xpath = "//*[@text=\"Preference\"]")
    private static WebElement findByElement;

    @AndroidFindBy(xpath = "//*[@text=\"Text\"]")
    private static WebElement androidFindByElement;

    public NativeAppAndroidLocators(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public static void main(String[] args) throws MalformedURLException{
        AppiumDriver driver = DriverInitialization.initializeDriver();

        /*WebElement menuElementAccessibility = driver.findElement(AppiumBy.accessibilityId("Accessibility"));
        menuElementAccessibility.click();
        driver.navigate().back();

        // Locator is not unique
        // WebElement menuElementAnimation = driver.findElement(AppiumBy.id("android:id/text1"));
        //
        // Custom xpath locator
        WebElement menuElementAnimation = driver.findElement(AppiumBy.xpath("//*[@text='Animation']"));
        menuElementAnimation.click();
        driver.navigate().back();

        // Locator is not unique
        // WebElement menuElementApp = driver.findElement(AppiumBy.className("android.widget.TextView"));
        WebElement menuElementApp = driver.findElements(AppiumBy.className("android.widget.TextView")).get(4);
        menuElementApp.click();
        driver.navigate().back();

        // auto-xpath
        WebElement menuElementContent = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc='Content']"));
        menuElementContent.click();
        driver.navigate().back();

        WebElement menuElementGraphics = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Graphics\")"));
        menuElementGraphics.click();
        driver.navigate().back();

        WebElement menuElementMedia = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.TextView\")")).get(7);
        menuElementMedia.click();
        driver.navigate().back();

        // content-desc
        WebElement menuElementNfc = driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().description(\"NFC\")"));
        menuElementNfc.click();
        driver.navigate().back();

        WebElement menuElementOs = driver.findElements(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).get(8);
        menuElementOs.click();
        driver.navigate().back();*/

        NativeAppAndroidLocators nativeAppAndroidLocators = new NativeAppAndroidLocators(driver);

        findByElement.click();
        driver.navigate().back();

        androidFindByElement.click();
        driver.navigate().back();
    }
}
