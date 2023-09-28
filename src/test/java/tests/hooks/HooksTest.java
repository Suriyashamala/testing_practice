package tests.hooks;

import org.testng.annotations.*;

public class HooksTest {

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass");
    }

    @BeforeGroups({"smoke"})
    public void beforeGroups(){
        System.out.println("BeforeGroups");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite");
    }

    @Test(groups = {"smoke"})
    public void testMethod1(){
        System.out.println("TestMethod 1");
    }

    @Test
    public void testMethod2(){
        System.out.println("TestMethod 2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass");
    }

    @AfterGroups({"smoke"})
    public void afterGroups(){
        System.out.println("AfterGroups");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }
}
