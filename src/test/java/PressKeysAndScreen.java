import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class PressKeysAndScreen {

    public static void main(String[] args) {

        WebDriver dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        dr.manage().window().setSize(new Dimension(1300, 700));

        dr.get("https://www.google.com");

        WebElement searchField = dr.findElement(By.xpath("//input[@name='q']"));

        String select = Keys.chord(Keys.CONTROL, "a");
        String cut = Keys.chord(Keys.CONTROL, "x");
        String paste = Keys.chord(Keys.CONTROL, "v");

        searchField.sendKeys("COURS");
      //  new WebDriverWait(dr, '8').until(ExpectedConditions.textToBePresentInElementValue(searchField, "something-something"));

        searchField.sendKeys(select);
        searchField.sendKeys(cut);
        searchField.sendKeys(paste);

        searchField.sendKeys(Keys.chord(Keys.SHIFT, "era"));
        searchField.sendKeys(Keys.ENTER);

        // set date
        Date writeDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy-hh:mm:ss");
        String fileName = dateFormat.format(writeDate) + ".png";

        // take screen
        File iScreenIt = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);

        //copy file
        try {
            FileUtils.copyFile(iScreenIt, new File("/home/HEXA/s.nedaikhleb/IdeaProjects/selenuim/src/main/forFiles/" + fileName));
        }catch (IOException e) {
            e.printStackTrace();
        }

        dr.quit();
    }}
