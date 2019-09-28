import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FillListOfFields {
    public static void main(String[] args) {
        WebDriver dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        dr.manage().window().maximize();

        dr.get("http://suninjuly.github.io/huge_form.html");


        List<WebElement> input = dr.findElements(By.xpath("//input[@type='text']"));
        WebElement submitBtn = dr.findElement(By.xpath("//button[@type='submit']"));

        for (WebElement inputField : input) {
            inputField.sendKeys("bla-bla");
        }

        submitBtn.submit();
        dr.switchTo().alert().accept();

        dr.quit();
    }
}
