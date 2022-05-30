import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
        String title= driver.getTitle();
        System.out.println(title);

        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9876543210");
        driver.findElement(By.xpath("//input[@class='ui green button']")).click();

    }
}
