package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.LoggedPage;
import pageobjects.StudentLoginPage;

import java.time.Duration;

public class InvalidTest {

     @Test
    public void invalidtest(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");

        StudentLoginPage studentLoginPage = new StudentLoginPage(driver);
        LoggedPage loggedPage = new LoggedPage(driver);

        studentLoginPage.fillUsername("sham");
        studentLoginPage.fillPassword("sham123");
        studentLoginPage.clickSubmit();

        driver.quit();

    }
}

