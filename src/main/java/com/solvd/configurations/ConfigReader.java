package com.solvd.configurations;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties");
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException exception) {
            throw new RuntimeException("Cannot read config file");
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}
