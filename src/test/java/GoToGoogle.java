import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoToGoogle {

    private WebDriver driver;
    private WebDriver wait;


    public void initDriver() {
        driver = new ChromeDriver();
       // wait = new WebDriverWait(driver, 10).until(titleIs(""));

    }


}
