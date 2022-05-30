package jobBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void beforeMethod() {

        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://alchemy.hguy.co/jobs/");
        driver.manage().window().maximize();
    }

    @Test
    public void TestCase() throws InterruptedException {

        driver.findElement(By.linkText("Jobs")).click();
        driver.findElement(By.xpath("//input[contains(@name,'keywords')]")).sendKeys("Banking");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Search completed')]")));

        driver.findElement(By.xpath("//li[@class='post-4474 job_listing type-job_listing status-publish hentry job-type-internship']//h3[contains(text(),'BankingTestJob')]")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'BankingTestJob')]")));

        driver.findElement(By.xpath("//input[@type='button']")).click();
        String email=driver.findElement(By.xpath("//a[contains(@class,'job')]")).getText();
        System.out.println(email);


    }
    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }

}
