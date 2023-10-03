package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentLoginPage {
    WebDriver ldriver;
    //    private static final By USERNAME = By.xpath("//input[@id='username']");
    @FindBy(xpath = "//input[@id='username']")
    WebElement USERNAME;

    //    private static final By PASSWORD= By.xpath("//input[@name='password']");
    @FindBy(xpath = "//input[@name='password']")
    WebElement PASSWORD;

    //    private static final By SUBMIT = By.xpath("//button[@id='submit']");
    @FindBy(xpath= "//button[@id='submit']")
    WebElement SUBMIT;

    public StudentLoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(ldriver,this);
    }

    public void fillUsername(String username) {
//        ldriver.findElement(USERNAME).sendKeys(username);
        USERNAME.sendKeys(username);
    }

    public void fillPassword(String password) {
//        ldriver.findElement(PASSWORD).sendKeys(password);
        PASSWORD.sendKeys(password);
    }

    public void clickSubmit() {
//        ldriver.findElement(SUBMIT).click();
        SUBMIT.click();
    }
}

