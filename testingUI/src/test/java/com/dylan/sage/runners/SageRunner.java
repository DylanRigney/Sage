package com.dylan.sage.runners;

import com.dylan.sage.pages.SageLanding;
import com.dylan.sage.pages.SageResolved;
import com.dylan.sage.pages.SageSignIn;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = {"com.dylan.sage.steps"})
public class SageRunner {

    public static WebDriver driver;
    public static SageSignIn signIn;
    public static SageLanding Landing;
    public static SageResolved Resolved;

    @BeforeClass
    public static void setUp() {

        // trying two different ways to get driver path.  Regular path and path stored in env variable
        String path = "C:/Users/Quantum/Documents/Revature Projects/Drivers/chromedriver.exe";
        String envDriverPath = System.getenv("WEB_DRIVER_PATH");
        System.setProperty("webdriver.chrome.driver", envDriverPath);

        driver = new ChromeDriver();

        signIn = new SageSignIn(driver);
        Landing = new SageLanding(driver);
        Resolved = new SageResolved(driver);
    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }
}
