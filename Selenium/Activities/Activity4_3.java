import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        String title= driver.getTitle();
        System.out.println(title);

        String thirdHeader=driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println(thirdHeader);

        String fifthHeaderColour = driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println(fifthHeaderColour);

        String violetButton= driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
        System.out.println(violetButton);

        String greyButton = driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getText();
        System.out.println(greyButton);

        driver.quit();

    }
}
