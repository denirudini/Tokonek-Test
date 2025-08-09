package com.tokonek.dasboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {
    private WebDriver driver;
    
    private By categoryButton = By.xpath("//span[normalize-space()='Category']");
    private By addCategory = By.xpath("//button[normalize-space()='Tambah Kategori']");
    private By nameCategory = By.xpath("//input[@id='name']");
    private By categoryDropdown = By.xpath("//div[@class='flex items-center justify-between']");
    private By typeCategoryMain = By.xpath("//span[normalize-space()='Kategori Utama']");
    private By typeCategorySub = By.xpath("//span[normalize-space()='Kategori Sub']");
    private By selectCategorySub = By.xpath("//button[normalize-space()='Select Category']");
    private By choseCategorySub = By.xpath("//button[contains(text(),'Fashion Wanita')]");
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

    public void categoryDropdown(){
        driver.findElement(categoryDropdown).click();
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
    public void choseCategorySub(){
        driver.findElement(choseCategorySub).click();
    }

     public void saveCategory(){
        driver.findElement(saveCategory).click();
    }
}
