package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static String greet(String name) {
        return "Hello, " + StringUtils.capitalize(name) + "!";
    }

    public static void main(String[] args) {
        logger.info("Application started");

        System.out.println("Hello, CI/CD Pipeline! Welcome to Maven CI/CD Demo.");

        logger.info(greet("Student"));
    }
}