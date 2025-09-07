package com.tokonek.inventory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductUnitPage {
    private WebDriver driver;
    private By menuProductUnit = By.xpath("//span[normalize-space()='Product Unit']");
    private By buttonTambahSatuan = By.xpath("//button[normalize-space()='Tambah Satuan']");
    private By formNamaSatuan = By.xpath("//input[@id='name']");
    private By formKodeSatuan = By.xpath("//input[@id='code']");
    private By formDeskripsi = By.xpath("//textarea[@id='description']");
    private By buttonCekSatuan = By.xpath("//span[contains(@class,'ml-1.5')]");
    private By buttonSimpan = By.xpath("//button[normalize-space()='Simpan']");
    private By succesMesagge = By.xpath("(//div[@class='ml-3 text-sm font-normal'][normalize-space()='Satuan produk berhasil dibuat'])[2]");

    public ProductUnitPage(WebDriver driver) {
        this.driver = driver;
    }

    public void menuProductUnit(){
        driver.findElement(menuProductUnit).click();
    }
    public void buttonTambahSatuan(){
        driver.findElement(buttonTambahSatuan).click();
    }
    public void namaSatuan(String namaSatuan){
        driver.findElement(formNamaSatuan).sendKeys(namaSatuan);
    }
    public void kodeSatuan(String kodeSatuan){
        driver.findElement(formKodeSatuan).sendKeys(kodeSatuan);
    }
    public void description(String description){
        driver.findElement(formDeskripsi).sendKeys(description);
    }
    public void buttonCekSatuan(){
        driver.findElement(buttonCekSatuan).click();
    }
    public void buttonSimpan(){
        driver.findElement(buttonSimpan).click();
    }
    public String getMessegeSucces(){
        return driver.findElement(succesMesagge).getText();
    }
}
