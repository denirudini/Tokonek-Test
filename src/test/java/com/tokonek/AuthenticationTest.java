package com.tokonek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AuthenticationTest {
    @Test(priority = 1)
    public void testLogin() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dashboard.tokonek.id/auth/login");
        driver.findElement( By.id("email")).sendKeys("denirudini99@gmail.com");
        Thread.sleep(1000); 
        driver.findElement(By.id("password")).sendKeys("0103Deni!");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        Thread.sleep(1000);
        String actual = driver.getCurrentUrl();
        String expected = "https://dashboard.tokonek.id/organizations";
        Assert.assertEquals(actual, expected, "Login failed or URL mismatch.");

        Thread.sleep(2000);
        driver.quit();

    }
    @Test(priority = 2)
    public void testLoginWithInvalidCredentials() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dashboard.tokonek.id/auth/login");
        driver.findElement(By.id("email")).sendKeys("yuhu1@mail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("password")).sendKeys("yuhu1");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
        String actual = driver.findElement(By.xpath("//div[@class='flex items-center justify-center']")).getText();
        String expected = "Request failed";
        Assert.assertEquals(actual, expected);  
        Thread.sleep(2000);
        driver.quit();
    }
    
}
