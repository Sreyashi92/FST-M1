import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) {
        WebDriver driver= new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");


        WebElement optionValue= driver.findElement(By.xpath("//h3[@id='single-value']"));
        WebElement  Option = driver.findElement(By.xpath("//select[@id='single-select']"));

        Select dropdown= new Select(Option);
        dropdown.selectByIndex(3);
        System.out.println(optionValue.getText());
        dropdown.selectByVisibleText("Option 2");
        System.out.println(optionValue.getText());
        dropdown.selectByValue("4");
        System.out.println(optionValue.getText());

        List<WebElement> Values= dropdown.getOptions();
        for (WebElement Value: Values){
            System.out.println(Value.getText());
        }
        driver.quit();
    }
}
