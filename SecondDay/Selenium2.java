package demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Selenium2 {

    public static void main(String[] args) {

        // (a) Launch Browser
        WebDriver driver = new ChromeDriver();

        // (d) Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // (a) Navigate to URL
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // (b) Robust CSS Selectors + (c) Actions
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Mohan");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.submit")).click();

        // (d) Explicit Wait (WebDriverWait)
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));

        // (e) Verification & Validation (check element displayed)
        Assert.assertTrue(driver.findElement(By.cssSelector("button.logout-btn")).isDisplayed(),
                "Logout button is NOT displayed (Login failed)");

        System.out.println("Logout button is displayed");

        driver.quit();
    }

}
