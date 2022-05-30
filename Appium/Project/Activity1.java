package AppiumProject;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Activity1 {
    AndroidDriver<MobileElement> driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        // Set the Desired Capabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.apps.tasks");
        caps.setCapability("appActivity", ".ui.TaskListsActivity");
        caps.setCapability("noReset", true);

        // Instantiate Appium Driver
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(appServer, caps);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void testAppiumProject() throws InterruptedException {

        driver.findElementByAccessibilityId("Create new task").click();
        Thread.sleep(2000);
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Tasks");
        driver.findElementById("add_task_done").click();
        Thread.sleep(1000);

        driver.findElementByAccessibilityId("Create new task").click();
        Thread.sleep(2000);
        driver.findElementById("add_task_title").sendKeys("Complete Activity with Google Keep");
        driver.findElementById("add_task_done").click();
        Thread.sleep(1000);

        driver.findElementByAccessibilityId("Create new task").click();
        Thread.sleep(2000);
        driver.findElementById("add_task_title").sendKeys("Complete the second Activity Google Keep");
        driver.findElementById("add_task_done").click();
        Thread.sleep(1000);

        List<MobileElement> numberofTasks = driver.findElements(By.id("task_name"));
        System.out.println(numberofTasks.size());

        Assert.assertEquals(numberofTasks.size(),3);

    }

    @AfterTest
    public void tearDown() {

        driver.quit();
    }
}

