import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");

        String title= driver.getTitle();
        System.out.println(title);

        Thread.sleep(5000);

        driver.findElement(By.id("firstName")).sendKeys("XYZ");
        driver.findElement(By.id("lastName")).sendKeys("ABC");

        driver.findElement(By.id("email")).sendKeys("test@test.com");
        driver.findElement(By.id("number")).sendKeys("13457899");

        driver.findElement(By.cssSelector("input.green")).click();

        driver.quit();



    }
}
