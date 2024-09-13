package com.java17_Selenium4.HI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // Correctly sets up the ChromeDriver
        WebDriver driver = new ChromeDriver();   // Instantiates ChromeDriver

        driver.get("https://google.com");
        driver.close();
        driver.quit();
    }
}
