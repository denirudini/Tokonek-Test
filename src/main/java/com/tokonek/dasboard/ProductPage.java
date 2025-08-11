package com.tokonek.dasboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private By inventoryButton = By.xpath("//span[normalize-space()='Inventory']");
    private By menuProductButton = By.xpath("//span[normalize-space()='Product']");
    private By addProductButton = By.xpath("//a[normalize-space()='Tambah Produk']");
    private By fieldNameProduct = By.xpath("//input[@id='name']");
    private By fieldSKUProduct = By.xpath("//input[@id='sku']");
    private By fieldCategory = By.xpath("//div[@class='flex items-center justify-between']");
    private By fieldDescriptionProduct = By.xpath("//textarea[@id='description']");
    private By fieldPriceProduct = By.xpath("//input[@id='price']");
    private By fieldStockProduct = By.xpath("//input[@id='stock']");
    private By fieldWeightProduct = By.xpath("//input[@id='weight']");
    private By fieldImageProduct = By.xpath("(//span[@class='bg-primary-50 text-primary-600 hover:bg-primary-100 rounded-md px-3 py-2 text-sm font-medium'])[1]");
    private By buttonSaveProduct = By.xpath("//button[normalize-space()='Simpan Produk']");

    private By categoryDropdown = By.xpath("//div[@class='flex items-center justify-between']");
    private By categoryChose = By.xpath("//button[contains(text(),'Fashion Pria')]");
    private By categoryChoseNext = By.xpath("//button[normalize-space()='Baju muslim']");
    private By deleteButton = By.xpath("//button[normalize-space()='Hapus']");
    private By editButton = By.xpath("//button[normalize-space()='Edit']");


    private By fieldBarcode = By.xpath("//input[@id='barcode']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickMenuInventory(){
        driver.findElement(inventoryButton).click();
    }
    public void menuProductButton(){
        driver.findElement(menuProductButton).click();
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
    public void categoryDropdown(){
        driver.findElement(categoryDropdown).click();
    }
    public void categoryChose(){
        driver.findElement(categoryChose).click();
    }
    public void categoryChoseNext(){
        driver.findElement(categoryChoseNext).click();
    }
    public void fieldBarcode(String barcode){
        driver.findElement(fieldBarcode).sendKeys(barcode);
    }
    public void deleteButton(){
        driver.findElement(deleteButton).click();
    }
    public void editButton(){
        driver.findElement(editButton).click();
    }
}
