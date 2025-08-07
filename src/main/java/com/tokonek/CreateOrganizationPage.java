package com.tokonek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateOrganizationPage {
    private WebDriver driver;
    
    private By organizationNameField = By.xpath("//input[@id='name']");
    private By organizationDescriptionField = By.xpath("//textarea[@id='description']");
    private By organizationsLogoUrl = By.xpath("//input[@id='logo']");
    private By organizationWebsiteUrl = By.xpath("//input[@id='website']");
    private By createButton = By.xpath("//button[normalize-space()='Buat Organisasi']");
    private By cancelButton = By.xpath("//button[normalize-space()='Cancel']");
    private By addButtonCreateOrganization = By.xpath("//button[@title='Add a new organization to manage separate teams, projects, or business units']");

    public CreateOrganizationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterOrganizationName(String name) {
        driver.findElement(organizationNameField).sendKeys(name);
    }
    public void enterOrganizationDescription(String description) {
        driver.findElement(organizationDescriptionField).sendKeys(description);
    }
    public void enterOrganizationLogoUrl(String logoUrl) {
        driver.findElement(organizationsLogoUrl).sendKeys(logoUrl);
    }
    public void enterOrganizationWebsiteUrl(String websiteUrl) {
        driver.findElement(organizationWebsiteUrl).sendKeys(websiteUrl);
    }
    public void clickCreateButton() {
        driver.findElement(createButton).click();
    }
    public void clickCancelButton() {
        driver.findElement(cancelButton).click();
    }

     public void clickAddOrganization(){
        driver.findElement(addButtonCreateOrganization).click();
    }
    
}
