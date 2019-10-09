package PageObjectPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }
    // define locators
    private By signInButton = By.xpath("//a[text()='Sign in']");
    private By signUpButton = By.xpath("//a[text()='Sign up']");
    private By userNameField = By.xpath("//input[@id='user[login]']");
    private By userEmailField = By.xpath("//input[@id='user[email]']");
    private By passwordField = By.xpath("//input[@id='user[password]']");

    private By signUpFormButton = By.xpath("//button[text()='Sign up for GitHub']");


    // write methods

    public LoginPage clickSignIn() {
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUpButton() {
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpFormButton() {
        driver.findElement(signUpFormButton).click();
        return new SignUpPage(driver);
    }

    public MainPage TypeUserName(String username) {
        driver.findElement(userNameField).sendKeys(username);
        return this;
    }

    public MainPage TypePassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public MainPage TypeEmail(String password) {
        driver.findElement(userEmailField).sendKeys(password);
        return this;
    }

    public SignUpPage register(String username, String email, String password) {
        this.TypeUserName(username);
        this.TypeEmail(email);
        this.TypePassword(password);
        this.clickSignUpFormButton();
        return new SignUpPage(driver);
    }

}
