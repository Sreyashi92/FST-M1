package AppiumProject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testAppiumProject() throws InterruptedException {

        driver.findElementByAccessibilityId("New text note").click();
        driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Test_note");



        Actions action = new Actions(driver);

        MobileElement Title=driver.findElementById("com.google.android.keep:id/editable_title");
        action.moveToElement(Title).click().sendKeys("Title").build().perform();

        driver.findElementByAccessibilityId("Open navigation drawer").click();


        MobileElement note= driver.findElementById("com.google.android.keep:id/index_note_text_description");
        System.out.println(note);

        Assert.assertEquals(note,"note");

    }
    @AfterClass
    public void afterClass() {
        driver.quit();
    }


}

