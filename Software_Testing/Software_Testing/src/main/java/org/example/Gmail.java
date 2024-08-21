package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;

public class Gmail {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signin");
        WebElement emailField = driver.findElement(By.id("identifierId"));
        emailField.sendKeys("annepuuday111@gmail.com");
        highlight(driver, emailField);
        driver.findElement(By.id("identifierNext")).click();
        pause();
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("annepuuday@@2003");
        highlight(driver, passwordField);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshot = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./ScreenShot/GmailLogin.png"));
        driver.quit();
    }
    private static void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
    private static void pause() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
