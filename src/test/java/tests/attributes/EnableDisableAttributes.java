package tests.attributes;

import org.testng.annotations.Test;

public class EnableDisableAttributes {

    @Test(enabled = false)
    public void car() {
        System.out.println("car");
    }

    @Test()
    public void bus() {
        System.out.println("bus");
    }

    @Test(enabled = true)     //default value true
    public void bicycle () {
        System.out.println("bicycle");
    }

    @Test()
    public void bike() {
        System.out.println("bike");

    }
}

