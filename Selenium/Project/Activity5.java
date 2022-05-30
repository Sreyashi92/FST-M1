package jobBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity5 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/");
        driver.manage().window().maximize();
    }

    @Test
    public void TestCase() throws InterruptedException {

    String navigation = driver.findElement(By.xpath("//div[@class='ast-flex main-header-container']")).getText();
    System.out.println(navigation);

    driver.findElement(By.linkText("Jobs")).click();
    String pageTitle= driver.getTitle();
    Thread.sleep(2000);
    System.out.println(pageTitle);
    Assert.assertEquals("Jobs – Alchemy Jobs",pageTitle);


    }
    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }
    }
