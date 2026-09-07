package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {

        return new Object[][] {
            {"YOUR_USERNAME", "YOUR_PASSWORD"}
        };
    }

    @Test(dataProvider = "loginData")
    public void verifyLogin(String username, String password) {

        System.out.println("===== LOGIN TEST STARTED =====");

        LoginPage loginPage = new LoginPage(driver);

        System.out.println("Entering username...");
        loginPage.enterUsername(username);

        System.out.println("Entering password...");
        loginPage.enterPassword(password);

        System.out.println("Clicking login...");
        loginPage.clickLogin();

        System.out.println("Login button clicked.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Current URL: " + driver.getCurrentUrl());

        System.out.println("Current Title: " + driver.getTitle());

        Assert.assertNotEquals(
                driver.getCurrentUrl(),
                "https://test.fieldforceconnect.com/",
                "Login validation failed."
        );

        System.out.println("===== LOGIN TEST PASSED =====");
    }
}