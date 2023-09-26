package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginInDataTest {
    @DataProvider(name="LoginIn-data")
    Object[][] LoginInData()
    {
            Object[][] data = {{"abc", "def"},
                    {"sham", "sham02"},
                    {"reshma", "resh10"}};
            return data;
        }
    }
