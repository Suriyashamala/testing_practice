package tests.listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageobjects.LoggedPage;
import pageobjects.StudentLoginPage;

import java.time.Duration;
//    @Listeners(tests.listeners.MyListener.class)
public class LoginTest {
    StudentLoginPage studentLoginPage;
    LoggedPage loggedPage;
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");

        studentLoginPage = new StudentLoginPage(driver);
        loggedPage = new LoggedPage(driver);
    }

    @Test
    public void AdminTest1() {
        studentLoginPage.fillUsername("student");
        studentLoginPage.fillPassword("Password123");
        studentLoginPage.clickSubmit();
        loggedPage.verifyLogged();
    }

    @Test
    public void AdminTest2() {
        studentLoginPage.fillUsername("Sham");
        studentLoginPage.fillPassword("Sham02");
        studentLoginPage.clickSubmit();
        loggedPage.verifyLogged();
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
