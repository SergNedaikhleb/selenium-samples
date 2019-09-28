import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ElementList {

    public static void main(String[] args) {
        WebDriver dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        dr.manage().window().maximize();

        dr.get("https://www.ebay.com/b/Surveillance-Smart-Home-Electronics/185067/bn_115028425");

        List<WebElement> checkboxes =  dr.findElements(By.xpath("//input[@type='checkbox']"));

        System.out.println("There are "+checkboxes.size()+" on this page");

        if (checkboxes.size()>5) System.out.println("More than 5");
        else System.out.println("No more than 5");

        checkboxes.get(2).click();
        dr.navigate().back();

       dr.quit();

}}
