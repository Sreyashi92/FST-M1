package jobBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity9 {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {

        driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        driver.manage().window().maximize();

    }

    @Test
    public void Test() throws InterruptedException {

        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();

        driver.findElement(By.xpath("//div[contains(text(),'Job Listing')]")).click();
        driver.findElement(By.xpath("//a[@class='page-title-action']")).click();

        driver.findElement(By.xpath("//textarea[contains(@id,'post')]")).sendKeys("Test");
        //driver.findElement(By.xpath("//div[@id='editor-ee5a4c57-61a1-413f-bfd3-6b2288279f4d']//p")).sendKeys("Test");

        WebElement scrolltoJobdata=driver.findElement(By.xpath("//div[(@id='job_listing_data')]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrolltoJobdata);

        driver.findElement(By.xpath("//input[@name='_company_website']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@name='_company_twitter']")).sendKeys("Test");


        driver.findElement(By.xpath("//input[@id='_job_location']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='_company_name']")).sendKeys("Test");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),'Publish')]")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Publish']")).click();
        Thread.sleep(2000);

        String Job= driver.findElement(By.xpath("//div[contains(text(),'Published')]")).getText();
        System.out.println(Job);
        Assert.assertEquals("Published", Job);

    }
    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }

}
