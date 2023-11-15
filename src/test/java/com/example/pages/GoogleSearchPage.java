package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
    private final WebDriver driver;

    // Web Elements
    private final By searchBoxLocator = By.name("q");
    private final By searchButtonLocator = By.name("btnK");
    private final By firstResultLocator = By.cssSelector("h3");

    public GoogleSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openGoogle() {
        driver.get("https://www.google.com");
    }

    public void enterSearchQuery(String query) {
        WebElement searchBox = driver.findElement(searchBoxLocator);
        searchBox.sendKeys(query);
    }

    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(searchButtonLocator);
        searchButton.click();
    }

    public void clickFirstResult() {
        WebElement firstResult = driver.findElement(firstResultLocator);
        firstResult.click();
    }
}
