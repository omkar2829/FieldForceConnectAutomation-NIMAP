package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerPage {

    WebDriver driver;

    // My Customer
    By myCustomer = By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[2]/div[2]/a");

    // Manage button
    By manageButton = By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div/div[2]/div[2]/button");

    // New Customer
    By newCustomer = By.xpath("/html/body/div[2]/div[3]/ul/li[1]/span[1]/span[2]");

    public CustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMyCustomer() {
        driver.findElement(myCustomer).click();
    }

    public void clickManage() {
        driver.findElement(manageButton).click();
    }

    public void clickNewCustomer() {
        driver.findElement(newCustomer).click();
    }
}