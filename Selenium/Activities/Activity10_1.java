import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new FirefoxDriver();
        Actions actions = new Actions(driver);

        driver.get("https://www.training-support.net/selenium/input-events");
        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);

        WebElement cube= driver.findElement(By.xpath("//div[@id='wrapD3Cube']"));
        WebElement cubeValue= driver.findElement(By.className("active"));


        actions.click(cube).build().perform();
        System.out.println(cubeValue.getText());
        Thread.sleep(1000);

        actions.doubleClick(cube).build().perform();
        WebElement cubeVal1 = driver.findElement(By.className("active"));
        System.out.println(cubeVal1.getText());
        Thread.sleep(1000);

        actions.contextClick(cube).build().perform();
        WebElement cubeVal2 = driver.findElement(By.className("active"));
        System.out.println(cubeVal2.getText());

        driver.quit();


    }
}
