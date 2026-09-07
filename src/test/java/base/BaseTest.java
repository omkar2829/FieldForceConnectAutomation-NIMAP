package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        System.out.println("Opening Chrome...");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://test.fieldforceconnect.com/");

        System.out.println("Website opened.");
        System.out.println("URL: " + driver.getCurrentUrl());
    }

    @AfterMethod
    public void tearDown() {

        System.out.println("Closing browser...");

        if (driver != null) {
            driver.quit();
        }
    }
}