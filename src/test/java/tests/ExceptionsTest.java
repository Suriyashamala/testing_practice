package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageobjects.PracticePage;
import pageobjects.StudentLoginPage;

import java.time.Duration;

public class ExceptionsTest {

     @Test
    public void exceptionstest(){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        StudentLoginPage studentLoginPage = new StudentLoginPage(driver);
        PracticePage practicePage = new PracticePage(driver);

        practicePage.clickedit();
        practicePage.clickadd();
    }
}

