package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.LoggedPage;
import pageobjects.StudentLoginPage;

import java.time.Duration;

public class AdminLoginTest {
    @Test
    public void admintest(){
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://practicetestautomation.com/practice-test-login/");

    StudentLoginPage studentLoginPage = new StudentLoginPage(driver);
    LoggedPage loggedPage = new LoggedPage(driver);

    studentLoginPage.fillUsername("student");
    studentLoginPage.fillPassword("Password123");
    studentLoginPage.clickSubmit();

    loggedPage.verifyLogged();
    //       driver.quit();
}

    @Test
    public void contacttest() {
    }
    @Test
    public void invalidtest() {}

    @Test
    public void exceptionstest(){}


}
