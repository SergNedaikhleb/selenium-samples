import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IPreferToSwitchAlert {

    public static void main(String[] args) {

    WebDriver drr = new ChromeDriver();

    JavascriptExecutor jsex = (JavascriptExecutor) drr;

    drr.get("https://www.oracle.com/technetwork/java/javase/downloads/jce-all-download-5170447.html");
    drr.manage().window().maximize();

    jsex.executeScript("window.scrollBy(0, 600)","");

    new WebDriverWait(drr,8).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Downloads and Trials')]")));

    drr.findElement(By.id("jce-8-oth-JPRXXXjce_policy-8.zip")).click();

    drr.switchTo().alert().accept();

    drr.close();
}
}