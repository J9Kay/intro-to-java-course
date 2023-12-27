package com.cbfacademy;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();

        try (InputStream input = LoadProperties.class.getClassLoader().getResourceAsStream("example.properties")) {
            if (input == null) {
                throw new IOException("Unable to find example.properties");
            }
            // Load properties file
            prop.load(input);

            // Iterate over properties and print them
            prop.forEach((key, value) -> System.out.println(key + ": " + value));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
