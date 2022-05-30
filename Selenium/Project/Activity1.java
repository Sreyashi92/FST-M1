package jobBoard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

        driver = new FirefoxDriver();


        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void TestCase() {

        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals("Alchemy Jobs – Job Board Application", title);


    }

    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }

}

