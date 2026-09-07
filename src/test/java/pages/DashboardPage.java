package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {

    private WebDriver driver;
    private WebDriverWait wait;

    // Punch In
    private By punchInButton = By.xpath(
        "//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[1]/div/div[1]"
    );

    // Toast Popup
    private By toastMessage = By.xpath(
        "//div/div/div[2]"
    );

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void clickPunchIn() {

        System.out.println("Waiting for Punch In button...");

        wait.until(
            ExpectedConditions.elementToBeClickable(punchInButton)
        );

        System.out.println("Clicking Punch In...");

        driver.findElement(punchInButton).click();

        System.out.println("Punch In clicked.");
    }

    public String getToastMessage() {

        System.out.println("Waiting for Toast popup...");

        String message = wait.until(
            ExpectedConditions.visibilityOfElementLocated(toastMessage)
        ).getText();

        System.out.println("Toast Message = " + message);

        return message;
    }
}