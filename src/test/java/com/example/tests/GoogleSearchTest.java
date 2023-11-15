package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.example.pages.GoogleSearchPage;
import com.example.utils.CommonMethods;

public class GoogleSearchTest {
    private WebDriver driver;
    private GoogleSearchPage googleSearchPage;
    private CommonMethods commonMethods;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\azizeh.hasan\\Downloads\\TestJenkins\\untitled\\chromedriver.exe");
        driver = new ChromeDriver();
        googleSearchPage = new GoogleSearchPage(driver);
        commonMethods = new CommonMethods(driver);
    }

    @Test
    public void testGoogleSearch() {
        googleSearchPage.openGoogle();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
