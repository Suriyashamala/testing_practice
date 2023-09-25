package attributes;

import org.testng.annotations.Test;

public class InvocationCountAttributes {

    @Test(invocationCount = 6)
    public void buds() {
        System.out.println("buds");
    }

    @Test(invocationCount = 14)
    public void blossoms() {
        System.out.println("blossoms");
    }

    @Test(invocationCount = 7)
    public void plants() {
        System.out.println("plants");


    }
}

