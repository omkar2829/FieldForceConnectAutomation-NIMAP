package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    // Username
    private By username = By.id("_r_14_");

    // Password
    private By password = By.id("_r_15_");

    // Login Button
    private By login = By.xpath("//*[@id=\"root\"]/div[2]/span[2]/div/div[2]/form/div[4]/button[1]");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Enter Username
    public void enterUsername(String usernameValue) {
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys("omkar.kapale03@gmail.com");
    }

    // Enter Password
    public void enterPassword(String passwordValue) {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys("Omnimap28");
    }

    // Click Login
    public void clickLogin() {
        driver.findElement(login).click();
    }
}