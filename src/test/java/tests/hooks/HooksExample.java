package tests.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LoggedPage;
import pageobjects.StudentLoginPage;

import java.time.Duration;

public class HooksExample {
    StudentLoginPage studentLoginPage;
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");

        studentLoginPage = new StudentLoginPage(driver);
    }

    @Test
    public void AdminTest1() {
        studentLoginPage.fillUsername("student");
        studentLoginPage.fillPassword("Password123");
        studentLoginPage.clickSubmit();
    }

    @Test
    public void AdminTest2() {
        studentLoginPage.fillUsername("Sham");
        studentLoginPage.fillPassword("Sham02");
        studentLoginPage.clickSubmit();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
