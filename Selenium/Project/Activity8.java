package jobBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity8 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        driver.manage().window().maximize();

    }

    @Test
    public void Test(){

        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();

        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);
        Assert.assertEquals("Dashboard ‹ Alchemy Jobs — WordPress",pageTitle);


    }

    @AfterMethod

    public void afterMethod() {

        driver.quit();
    }
}
