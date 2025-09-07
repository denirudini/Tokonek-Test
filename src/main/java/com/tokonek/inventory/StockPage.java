package com.tokonek.dasboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StockPage {
    private WebDriver driver;
    private By buttonStockAdjustment = By.xpath("//span[normalize-space()='Stock Adjustment']");
    private By addStockAdjustment = By.xpath("//button[normalize-space()='Tambah Adjustment']");
    private By fieldProductDropdown = By.xpath("//button[contains(@class,'text-text min-w-1/2 svelte-14jpwkl')]");
    private By fieldProductSearch = By.xpath("//input[@placeholder='Search...']");
    private By tipeAdjustment = By.xpath("//select[@id='transactionType']");
    private By fieldAddStock = By.xpath("//input[@id='quantity']");
    private By fieldDescription = By.xpath("//textarea[@id='notes']");
    private By buttonSave = By.xpath("//button[normalize-space()='Simpan Adjustment']");
    private By successMessage = By.xpath("//div[@role='alert']");

    public StockPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickMenuStockAdjustment() {
        driver.findElement(buttonStockAdjustment).click();
    }
    public void addStockAdjustment() {
        driver.findElement(addStockAdjustment).click();
    }
    public void selectProduct(String productName) {
        driver.findElement(fieldProductDropdown).sendKeys(productName);
        driver.findElement(fieldProductSearch).sendKeys(Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.id("opt-0")));
        driver.findElement(By.id("opt-0")).click();
    }
    public void selectTipeAdjustment() {
        driver.findElement(tipeAdjustment).click();
    }
    public void enterAddStock(String quantity) {
        driver.findElement(fieldAddStock).clear();
        driver.findElement(fieldAddStock).sendKeys(quantity);
    }
    public void enterDescription(String description) {
        driver.findElement(fieldDescription).sendKeys(description);
    }
    public void clickSave() {
        driver.findElement(buttonSave).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage));
    }
    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
