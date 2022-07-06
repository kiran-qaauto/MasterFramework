package com.kiran.driver;

import org.openqa.selenium.WebDriver;

public final class Driver {
    public static void initDriver(){
        WebDriver driver = LocalDriverFactory.getDriver();
        driver.get("https://google.com");
    }

    public static void quitDriver(){
        //
    }
}
