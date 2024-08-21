package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class All_Locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        try {
            driver.get("https://www.amazon.com");
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
            searchBox.sendKeys("laptop");
            WebElement searchButton = driver.findElement(By.cssSelector(".nav-search-submit input"));
            searchButton.click();
            WebElement logo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='nav-logo-sprites']")));
            logo.click();
            WebElement bestSellers = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Best Sellers")));
            bestSellers.click();
            WebElement newArrivals = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("New Arrivals")));
            newArrivals.click();
            WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h2")));
            System.out.println(header.getText());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
