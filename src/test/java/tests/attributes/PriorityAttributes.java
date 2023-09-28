package tests.attributes;

import org.testng.annotations.Test;

public class PriorityAttributes {

    @Test(priority = 3)
    public void hi() {
        System.out.println("Test1");
    }
    @Test(priority = 0)  //default priority Zero
    public void hello() {
        System.out.println("Test2");
    }
    @Test(priority = 1)
    public void world() {
        System.out.println("Test3");
    }
    @Test(priority = 2)
    public void welcome() {
        System.out.println("Test4");

    }
}

