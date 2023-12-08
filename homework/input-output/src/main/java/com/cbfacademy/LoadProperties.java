package com.cbfacademy; 

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try (FileInputStream input = new FileInputStream("example.properties")) {
            prop.load(input);
            prop.forEach((key, value) -> System.out.println(key + " = " + value));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

