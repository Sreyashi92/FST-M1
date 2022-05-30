import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_1 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/selenium/dynamic-controls");
        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);

        WebElement Checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement toggleButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));

        toggleButton.click();
        wait.until(ExpectedConditions.invisibilityOf(Checkbox));

        toggleButton.click();
        wait.until(ExpectedConditions.visibilityOf(Checkbox));

        Checkbox.click();

        driver.quit();


    }
}
