package tests;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class configFileReadTest {

    @Test
    public void configReadandSet() {
        Properties properties = new Properties();

        System.out.println(properties.getProperty("url"));
        properties.setProperty("url", "https://google.com/");
        System.out.println(properties.getProperty("url"));

    }
    @Test
    public void configFromFile() throws IOException {

        // reading config file
        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");


        // loading properties to 'properties' object
        Properties properties = new Properties();
        properties.load(fis);


        // reading and writing property values
        System.out.println(properties.getProperty("url"));
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password"));
        System.out.println(properties.getProperty("password.sham"));
        properties.setProperty("username.sham", "sham");
        properties.setProperty("password.sham", "amulu123");
        System.out.println(properties.getProperty("password.sham"));


        // saving all the properties to property file
        FileOutputStream fos = new FileOutputStream("src/test/resources/config1.properties");
        properties.store(fos, "new file");

    }

}
