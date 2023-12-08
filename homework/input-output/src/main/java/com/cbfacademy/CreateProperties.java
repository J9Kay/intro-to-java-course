package com.cbfacademy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("db.url", "localhost");
        prop.setProperty("db.port", "5353");
        prop.setProperty("db.user", "cbfacademy");
        prop.setProperty("db.password", "password");

        try (FileOutputStream output = new FileOutputStream("configuration.properties")) {
            prop.store(output, null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
