package jobBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {

        driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void TestCase() {

        String heading = driver.findElement(By.xpath("//h1[contains(text(),'Welcome to Alchemy Jobs')]")).getText();
        System.out.println(heading);
        Assert.assertEquals("Welcome to Alchemy Jobs",heading);


    }
    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }
}
