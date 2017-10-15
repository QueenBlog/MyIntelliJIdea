package com.queen.demo;

import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class PropertyTest {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        System.out.println(bundle.getString("key1"));
        System.out.println(bundle.getString("key2"));
        System.out.println(bundle.getString("key3"));
        System.out.println(bundle.getString("key4"));
    }
}
