
package tests.attributes;

import org.testng.annotations.Test;

public class DescriptionAttributes {
    @Test(dependsOnMethods = {"OpenBrowser"})
    public void SignIn() {
        System.out.println("test is executed");
    }
    @Test(testName = "open-browser", suiteName="Browser Test" ,description ="The browser is Opened")
    public void OpenBrowser() {
        System.out.println("test is executed");
    }

    @Test( testName ="logged",description = "User has Logout Successfully",dependsOnMethods = {"SignIn"})
    public void Logout() {
        System.out.println("test is executed");
    }
}




