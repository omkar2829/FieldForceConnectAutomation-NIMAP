package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.DashboardPage;
import pages.LoginPage;

public class PunchInTest extends BaseTest {

    @Test
    public void verifyPunchInToastMessage() {

        System.out.println("================================");
        System.out.println("PUNCH IN TEST STARTED");
        System.out.println("================================");

        // STEP 1: Login
        LoginPage loginPage = new LoginPage(driver);

        System.out.println("Entering username...");

        loginPage.enterUsername("omkar.kapale03@gmail.com");

        System.out.println("Entering password...");

        loginPage.enterPassword("Omnimap28");

        System.out.println("Clicking Login...");

        loginPage.clickLogin();

        System.out.println("Login clicked.");

        // Wait for dashboard
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // STEP 2: Dashboard
        DashboardPage dashboardPage = new DashboardPage(driver);

        // STEP 3: Click Punch In
        dashboardPage.clickPunchIn();

        // STEP 4: Get Toast
        String actualToast = dashboardPage.getToastMessage();

        System.out.println("================================");
        System.out.println("ACTUAL TOAST MESSAGE:");
        System.out.println(actualToast);
        System.out.println("================================");

        // STEP 5: Validate Toast is displayed
        Assert.assertNotNull(
            actualToast,
            "Toast message was not displayed."
        );

        Assert.assertFalse(
            actualToast.trim().isEmpty(),
            "Toast message is empty."
        );

        System.out.println("Toast message validation PASSED.");

        System.out.println("================================");
        System.out.println("PUNCH IN TEST PASSED");
        System.out.println("================================");
    }
}