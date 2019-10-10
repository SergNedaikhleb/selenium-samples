import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TryToFindElementInSource {

    public static void main(String[] args) {

        WebDriver dri = new ChromeDriver();

        dri.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        dri.get("https://getpocket.com/explore/medium.com");

        String ourElement = "all-time articles and videos about Medium";

        String source = dri.getPageSource();

        if (source.contains(ourElement))System.out.println("I found it! Good job!");
        else System.out.println("Oops! There is no such element");

        dri.quit();
    }
}
