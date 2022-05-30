package jobBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity4 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

        driver = new FirefoxDriver();


        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void TestCase() {

        String  heading2 = driver.findElement(By.xpath("//h2[contains(text(),'Quia quis non')]")).getText();
        System.out.println(heading2);
        Assert.assertEquals("Quia quis non",heading2);



    }

    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }

}
