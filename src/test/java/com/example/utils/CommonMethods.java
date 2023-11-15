package com.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonMethods {
    private final WebDriver driver;

    public CommonMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void click(WebElement element) {
        element.click();
    }

    public void sendKeys(WebElement element, String text) {
        element.sendKeys(text);
    }
}
