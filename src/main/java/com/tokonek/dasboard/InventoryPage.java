package com.tokonek.dasboard;

import java.lang.reflect.Field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
    private WebDriver driver;
    private By inventoryButton = By.xpath("//span[normalize-space()='Inventory']");
    private By addProductButton = By.xpath("//a[normalize-space()='Tambah Produk']");
    private By fieldNameProduct = By.xpath("//input[@id='name']");
    private By fieldSKUProduct = By.xpath("//input[@id='sku']");
    private By fieldCategory = By.xpath("//select[@id='category']");
    private By fieldDescriptionProduct = By.xpath("//textarea[@id='description']");
    private By fieldPriceProduct = By.xpath("//input[@id='price']");
    private By fieldStockProduct = By.xpath("//input[@id='stock']");
    private By fieldWeightProduct = By.xpath("//input[@id='weight']");
    private By fieldImageProduct = By.xpath("(//span[@class='bg-primary-50 text-primary-600 hover:bg-primary-100 rounded-md px-3 py-2 text-sm font-medium'])[1]");
    private By buttonSaveProduct = By.xpath("//button[normalize-space()='Simpan Produk']");

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickMenuInventory(){
        driver.findElement(inventoryButton).click();
    }
    public void addProductButton(){
        driver.findElement(addProductButton).click();
    }
    public void fieldNameProduct(String name) {
        driver.findElement(fieldNameProduct).sendKeys(name);
    }
    public void fieldSKUProduct(String sku) {
        driver.findElement(fieldSKUProduct).sendKeys(sku);
    }
    public void fieldCategory(String category){
        driver.findElement(fieldCategory).sendKeys(category);
    }
    public void fieldDescriptionProduct(String desc){
        driver.findElement(fieldDescriptionProduct).sendKeys(desc);
    }

    public void fieldPriceProduct(String price){
        driver.findElement(fieldPriceProduct).sendKeys(price);
    }

    public void fieldStockProduct(String stock){
        driver.findElement(fieldStockProduct).sendKeys(stock);
    }
    public void fieldWeightProduct(String weight){
        driver.findElement(fieldWeightProduct).sendKeys(weight);
    }
    public void fieldImageProduct(String image) {
      driver.findElement(fieldImageProduct).sendKeys(image);
    }  
    public void buttonSaveProduct(){
        driver.findElement(buttonSaveProduct).click();
    }
}
