package com.tokonek.dasboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
    private WebDriver driver;
    
    private By categoryButton = By.xpath("//span[normalize-space()='Category']");
    private By addCategory = By.xpath("//button[normalize-space()='Tambah Kategori']");
    private By nameCategory = By.xpath("//input[@id='name']");
    private By typeCategoryMain = By.xpath("//input[@id='categoryType-0']");
    private By typeCategorySub = By.xpath("//input[@id='categoryType-1']");
    private By selectCategorySub = By.xpath("//button[normalize-space()='Select Category']");
    private By choseCategory = By.xpath("//span[normalize-space()='Muhammmad Jawahiruzzaman']");
    private By statusCategory = By.xpath("//select[@id='isActive']");
    private By saveCategory = By.xpath("//button[normalize-space()='Tambah Kategori']");

    public CategoryPage(WebDriver driver){
        this.driver = driver;
    }
    public void clickMenuCategory(){
        driver.findElement(categoryButton).click();
    }
    public void addCategory(){
        driver.findElement(addCategory).click();
    }

    public void nameCategory(String name){
        driver.findElement(nameCategory).sendKeys(name);
    }

    public void typeCategoryMain(){
        driver.findElement(typeCategoryMain).click();
    }
    public void typeCategorySub(){
        driver.findElement(typeCategorySub).click();
    }
    public void selectCategorySub(){
        driver.findElement(selectCategorySub).click();
    }
    public void choseCategory(){
        driver.findElement(choseCategory).click();
    }

     public void saveCategory(){
        driver.findElement(saveCategory).click();
    }
}
