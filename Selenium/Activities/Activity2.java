import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.channels.WritableByteChannel;

public class Activity2 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/");
        String title= driver.getTitle();
        System.out.println(title);

        WebElement id=driver.findElement(By.id("about-link"));
        System.out.println(id);

        WebElement classname =driver.findElement(By.className("button"));
        System.out.println(classname);

        WebElement cssLocator = driver.findElement(By.cssSelector("#about-link"));
        System.out.println(cssLocator);

        WebElement linkText = driver.findElement(By.linkText("About Us"));
        System.out.println(linkText);

        driver.quit();


    }
}
