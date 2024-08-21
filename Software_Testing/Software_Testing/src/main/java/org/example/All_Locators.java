package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class All_Locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        System.out.println("Welcome to the Test World");
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.className("nav-search-submit")).click();
        driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
        driver.findElement(By.linkText("Best Sellers")).click();
        driver.findElement(By.partialLinkText("New Arrivals")).click();
        System.out.println(driver.findElement(By.tagName("h2")).getText());
        driver.findElement(By.cssSelector(".nav-search-submit input")).click();
        driver.quit();
    }
}
