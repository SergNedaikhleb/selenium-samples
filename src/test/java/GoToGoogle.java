import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class GoToGoogle {

    public static void main(String[] args) {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities caap = new DesiredCapabilities();
        caap.setCapability(ChromeOptions.CAPABILITY, options);

        WebDriver dr = new ChromeDriver(caap);
        dr.navigate().to("https://www.google.com");

        System.out.println("This is: "+dr.getTitle());
        System.out.println("*****************");

        WebElement searchField = dr.findElement(By.xpath("//div[@class='SDkEP']//input[@type='text']"));
        searchField.sendKeys("udemy");

        dr.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@class='gNO89b']")).submit();

     //   System.out.println("i can see"+ dr.findElements(By.xpath("//div[@class='r']"))+" answers");


        //dr.quit();


    }


}
