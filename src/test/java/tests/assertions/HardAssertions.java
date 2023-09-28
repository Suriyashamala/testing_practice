package tests.assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobjects.LoggedPage;
import pageobjects.StudentLoginPage;

import java.time.Duration;

public class HardAssertions {
    WebDriver driver;
    StudentLoginPage studentLoginPage;
    LoggedPage loggedPage;

    @BeforeMethod
    public void beforeMethod() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practicetestautomation.com/practice-test-login/");

        studentLoginPage = new StudentLoginPage(driver);
        loggedPage = new LoggedPage(driver);

    }

    @Test
    public void adminTest() {
        studentLoginPage.fillUsername("student");
        studentLoginPage.fillPassword("Password123");
        studentLoginPage.clickSubmit();

        try {
            Thread.sleep(5000);
        } catch (Exception e){}

      //  Assert.assertFalse(driver.getCurrentUrl().contains("logged"), "Url Not matched!");

        Assert.assertEquals(driver.getCurrentUrl(),"https://practicetestautomation.com/logged-in-successfully/",
                "Url Not matched!!!");

//        Assert.assertNotEquals(driver.getCurrentUrl(),"https://practicetestautomation.com/logged-in-successfully/",
//                "Url Not matched!!!");

    }
    @Test
    public void adminTest2() {
        studentLoginPage.fillUsername("Amulu");
        studentLoginPage.fillPassword("resh10");
        studentLoginPage.clickSubmit();

        Assert.assertTrue(driver.getCurrentUrl().contains("logged"), "Url missmatching!");

//        Assert.assertEquals(driver.getCurrentUrl(),"https://practicetestautomation.com/logged-in-successfully/",
//                "Url missmatching!!!");

//        Assert.assertFalse(driver.getCurrentUrl().contains("dashboard"), "Url missmatching!");

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}
