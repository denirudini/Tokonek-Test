package com.tokonek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.tokonek.listener.ExtentReportListener;
import com.tokonek.utils.DriverUtil;


public class BaseTest {

    @BeforeMethod
    public void setUp() throws InterruptedException {
        WebDriver driver = DriverUtil.getDriver();
        driver.manage().window().maximize();
        ExtentReportListener.driver = driver; 
        driver.get("https://dashboard.tokonek.id/auth/login");
        
        driver.findElement( By.id("email")).sendKeys("denirudini99@gmail.com");
        Thread.sleep(1000);

        driver.findElement(By.id("password")).sendKeys("0103Deni!");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(1000);
       
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000); 
        DriverUtil.quitDriver();
    }
}
