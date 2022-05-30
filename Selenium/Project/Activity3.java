package jobBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethod() {

        driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/jobs/");
    }

    @Test
    public void TestCase() {

        WebElement image = driver.findElement(By.xpath("//img[contains(@class,'attachment')]"));
        String url= image.getAttribute("src");
        System.out.println(url);


    }
    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }
}
