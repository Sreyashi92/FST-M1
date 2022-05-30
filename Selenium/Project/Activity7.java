package jobBoard;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;
    Actions Builder;

    @BeforeMethod
    public void beforeMethod() {

        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Builder=new Actions(driver);


        driver.get("https://alchemy.hguy.co/jobs/");
        driver.manage().window().maximize();
    }
    @Test
    public void TestCase() throws InterruptedException {

        driver.findElement(By.linkText("Post a Job")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Post a Job')]")));
        driver.findElement(By.xpath("//input[(@name='create_account_email')]")).sendKeys("shazra@l.com");
        driver.findElement(By.xpath("//input[@name='job_title']")).sendKeys("BankingTester3");

        WebElement scrolltocontact=driver.findElement(By.xpath("//label[contains(text(),'Description')]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);", scrolltocontact);

        driver.switchTo().frame("job_description_ifr");
        WebElement ac= driver.findElement(By.xpath("//body//p"));
        Builder.moveToElement(ac).click().sendKeys("Hello").build().perform();
        driver.switchTo().defaultContent();

        driver.findElement(By.id("application")).sendKeys("shazra@l.com");
        driver.findElement(By.id("company_name")).sendKeys("IBM");
        driver.findElement(By.xpath("//input[@name='submit_job']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Preview')]")));
        driver.findElement(By.xpath("//input[@id='job_preview_submit_button']")).click();

        driver.findElement(By.linkText("Jobs")).click();
        Thread.sleep(2000);

        WebElement scrolltojob=driver.findElement(By.xpath("//strong[contains(text(),'listing')]"));
        JavascriptExecutor jk=(JavascriptExecutor)driver;
        jk.executeScript("arguments[0].scrollIntoView(true);", scrolltojob);
        String jobtitle= driver.findElement(By.xpath("//h3[contains(text(),'BankingTester3')]")).getText();
        Assert.assertEquals("BankingTester3",jobtitle);
    }
    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }

}
