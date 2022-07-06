package com.kiran.driver;

import com.kiran.config.ConfigFactory;
import com.kiran.driver.manager.ChromeManager;
import com.kiran.driver.manager.FirefoxManager;
import com.kiran.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public class LocalDriverFactory {

    private LocalDriverFactory() {
    }

    public static WebDriver getDriver() {
        WebDriver driver;
        if (isBrowserChrome()) {
            driver = ChromeManager.getDriver();
        } else {
            driver = FirefoxManager.getDriver();
        }
        return driver;
    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }
}
