package ru.parsentev.service;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * TODO: comment.
 */
public class Settings {
    private static final Settings INSTANCE = new Settings();

    private final Properties properties = new Properties();

    private Settings() {
        try {
            properties.load(new FileInputStream(this.getClass().getClassLoader().getResource("parsentev.properties").getFile()));
        } catch (IOException e) {


        }
    }

    public static Settings getInstance() {
        return INSTANCE;
    }

    public String value(String key) {
        return this.properties.getProperty(key);
    }
}