import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SimpleTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // go to google
        driver.get("https://algarvegolf.holiday/");

        // maximize chrome window
        driver.manage().window().maximize();

        // define our club as a variable
        String ourClub = "Castro Marim Golf Course";

        WebElement club = driver.findElement(By.xpath("//header[1]//div[1]/nav/ul/li[2]/a"));
        club.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // define searchfield and write the name our our club
        WebElement searchField = driver.findElement(By.xpath("//section/div[3]/div[2]/span/input"));
        searchField.sendKeys(ourClub);

        // define where is our prices
        WebElement prices = driver.findElement(By.className("course-inner_content__bottom"));

        //    print all prices of the club
        System.out.println(prices.getText());

        // close browser
        driver.quit();
    }
}