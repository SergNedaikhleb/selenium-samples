import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FindElements {

    public static void main(String[] args) {

        int sample = 50;

        WebDriver dr = new ChromeDriver();
        dr.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        dr.manage().window().maximize();

        dr.get("https://bitbucket.org");

        System.out.println(dr.findElements(By.xpath("//div//li")).size());

         if (dr.findElements(By.xpath("//div//li")).size() < sample) System.out.println("It's less than sample");
         else System.out.println("It's more than sample");

        dr.quit();
}}
