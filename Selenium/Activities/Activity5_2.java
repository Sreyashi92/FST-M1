import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String pageTitle= driver.getTitle();
        System.out.println(pageTitle);

        WebElement Checkbox= driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println(Checkbox.isSelected());

        Checkbox.click();
        System.out.println(Checkbox.isSelected());

        driver.quit();



    }


}
