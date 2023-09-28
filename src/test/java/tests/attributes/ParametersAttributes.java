
package tests.attributes;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersAttributes {

    @Parameters({"fruits","mango","apple","orange"})
    @Test
    public void fruits(String F,String M,String A,String O) {
        System.out.println(F + M + A + O);
    }

    @Test
    @Parameters({"Mango"})
    public void mango(@Optional String M) {
        System.out.println(M);
    }

    @Parameters("apple")
    @Test
    public void apple(String A) {
        System.out.println(A);
    }

    @Test
    @Parameters("orange")
    public void orange(String O) {
        System.out.println(O);
    }

}