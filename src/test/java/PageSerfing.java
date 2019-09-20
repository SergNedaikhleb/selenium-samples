import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSerfing {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://aws.amazon.com/ru/ec2/");

        System.out.println("The page is: " + driver.getTitle());


            if (driver.getTitle().equals("blablabla")) {
                System.out.println("It is not Amazon!!");
            } else {
                System.out.println("It is Amazon!!");
            }

            driver.findElement(
                    By.xpath("//*[@class='m-nav-secondary-links']/a[1]")).click();

        WebElement header = driver.findElement(By.tagName("h1"));

        System.out.println("The page is: " + driver.getTitle());
        System.out.println("The URL of this page is: " + driver.getCurrentUrl());
        System.out.println("I see on this page text: " + driver.findElement(By.xpath("//*[@id='aws-page-content']//div[@class='twelve columns']/h1")).getText());
        System.out.println("I see on this page: " + header.getText());


            driver.navigate().back();

        System.out.println("This page calls: " + driver.getTitle());
        System.out.println("The URL of this page is: " + driver.getCurrentUrl());


        driver.navigate().forward();

        System.out.println("This page calls: " + driver.getTitle());
        System.out.println("The URL of this page is: " + driver.getCurrentUrl());

            driver.navigate().to("https://www.digitalocean.com");

        WebElement digitalHeader = driver.findElement(By.xpath("//*[@class='bui-Col-6@medium']/h1"));

        System.out.println("The page is: " + driver.getTitle());
        System.out.println("The URL of this page is: " + driver.getCurrentUrl());
        System.out.println("This page calls: " + digitalHeader.getText());

        if (driver.getTitle().equals("DigitalOcean – The developer cloud")) {
            System.out.println("Yes, this is DigitalOcean");
        } else {
            System.out.println("No, something wrong");
        }


        driver.quit();
        }
    }
