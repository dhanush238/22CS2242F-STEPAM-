package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Different_Methods_Of_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        WebElement searchButton = driver.findElement(By.name("field-keywords"));
        WebElement logo = driver.findElement(By.className("a-logo"));
        WebElement todaysDealsLink = driver.findElement(By.linkText("Today's Deals"));
        WebElement primeLink = driver.findElement(By.partialLinkText("Prime"));
        WebElement featuredProduct = driver.findElement(By.cssSelector("div.s-main-slot div.s-result-item"));
        WebElement searchBoxXPath = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        WebElement partialTextElement = driver.findElement(By.xpath("//a[contains(text(), 'Deals')]"));
        WebElement startsWithElement = driver.findElement(By.xpath("//a[starts-with(@href, '/dp/')]"));

        driver.quit();
    }
}
