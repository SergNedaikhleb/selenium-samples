import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class CheckElementAccessibility {

    public static void main(String[] args) {

        WebDriver dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        dr.manage().window().setSize(new Dimension(1300, 700));

        dr.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");

        WebElement enabButton = dr.findElement(By.xpath("//body/div[5]/div/button"));

        if (enabButton.isEnabled()) System.out.println("This button is clickable!");
        else System.out.println("It is not working");

        dr.navigate().to("https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html");

        WebElement checkBoxDis = dr.findElement(By.xpath("//*[@type='radio' and @name='agreementjdk-12.0.2-oth-JPR'][1]"));
        WebElement checkBoxEnab = dr.findElement(By.xpath("//*[@type='radio' and @name='agreementjdk-12.0.2-oth-JPR'][2]"));

        if (checkBoxDis.isSelected()) System.out.println("This checkbox is checked!");
        else System.out.println("This checkbox is NOT checked!");

        if (checkBoxEnab.isSelected()) System.out.println("This checkbox is checked!");
        else System.out.println("This checkbox is NOT checked!");

        WebElement visibleEl = dr.findElement(By.xpath("//div[@class='u10w5']"));
        WebElement invisibleEl = dr.findElement(By.className("orcl6w3"));

        if (visibleEl.isDisplayed()) System.out.println("I can see it on the page");
        else System.out.println("I do not see it on the page");
        if (invisibleEl.isDisplayed()) System.out.println("\n I cannot see it on the page, and it was expectable, so it's OK \n");
        else System.out.println("Wow! Seems i see it.");

        ((JavascriptExecutor) dr).executeScript("window.scrollBy(0, 800)","");

        if (invisibleEl.isDisplayed()) System.out.println("OK! Now i see! It's ");
        else System.out.println("No! I still see nothing.");

        dr.close();
    }
}
