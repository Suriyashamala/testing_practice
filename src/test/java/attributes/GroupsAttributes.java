
package attributes;

import org.testng.annotations.Test;

public class GroupsAttributes {

    @Test(groups ={"Group 2"})
    public void SignIn() {
        System.out.println("User has signed in successfully");
    }

    @Test(groups ={"Group 1"})
    public void OpenBrowser() {
        System.out.println("the browser is opened");
    }

    @Test(groups ={"Group 3"})
    public void Logout() {
        System.out.println("The user has logged out successfully");
    }

    @Test(groups = {"Group 1","Group 2"})
    public void test1(){
        System.out.println("Test1");
    }
}




