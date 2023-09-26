package attributes;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.LoginInDataTest;

public class DataProviderAttributes {

    @Test(dataProvider ="signIn-data")
    public void SignedTest(String username, String password) {
        System.out.println(username + password);
    }

    @Test(dataProvider ="LoginIn-data",dataProviderClass = LoginInDataTest.class)
    public void LoggedTest(String username, String password) {
        System.out.println(username + password);
    }

    @DataProvider(name="signIn-data")
    Object[][] SignedData()
    {
            Object[][] data = {{"abc", "def"},
                    {"sham", "sham02"},
                    {"reshma", "resh10"}};
            return data;
        }
    }
