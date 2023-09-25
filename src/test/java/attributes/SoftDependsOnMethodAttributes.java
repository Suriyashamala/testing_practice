
package attributes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftDependsOnMethodAttributes {
    @Test(dependsOnMethods = {"OpenBrowser"})
    public void SignIn() {
        System.out.println("User has signed in successfully");
        Assert.fail();
    }
    @Test
    public void OpenBrowser() {
        System.out.println("the browser is opened");
    }

    @Test(dependsOnMethods = {"SignIn"},alwaysRun = true)
    public void Logout() {
        System.out.println("The user has logged out successfully");
//        Assert.fail();
    }
}




