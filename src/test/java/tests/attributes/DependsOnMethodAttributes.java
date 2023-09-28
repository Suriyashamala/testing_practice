
package tests.attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodAttributes {
    @Test(dependsOnMethods = {"OpenBrowser"})
    public void SignIn() {
        System.out.println("User has signed in successfully");
    }
    @Test
    public void OpenBrowser() {
        System.out.println("the browser is opened");
    }

    @Test(dependsOnMethods = {"SignIn"})
    public void Logout() {
        System.out.println("The user has logged out successfully");
    }
}




