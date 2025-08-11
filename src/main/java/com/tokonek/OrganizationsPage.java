package com.tokonek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrganizationsPage {
    private WebDriver driver;
    private By buttonCreateOrganization = By.xpath("//button[normalize-space()='Create Organization']");
    private By addButtonCreateOrganization = By.xpath("//button[@title='Add a new organization to manage separate teams, projects, or business units']");
    private By choseOrganization = By.xpath("//button[@class='border-border hover:border-primary/80 focus-within:ring-primary group relative flex cursor-pointer flex-col rounded-2xl border bg-white p-6 transition-all duration-200 focus-within:ring-2 hover:shadow-lg']");
    private By organizationNameField = By.xpath("//input[@id='name']");
    private By organizationDescriptionField = By.xpath("//textarea[@id='description']");
    private By organizationsLogoUrl = By.xpath("//input[@id='logo']");
    private By organizationWebsiteUrl = By.xpath("//input[@id='website']");
    private By createButton = By.xpath("//button[normalize-space()='Buat Organisasi']");
    private By cancelButton = By.xpath("//button[normalize-space()='Cancel']");
    private By profilButton = By.xpath("//div[@class='flex h-8 w-8 items-center justify-center rounded-full bg-blue-100 text-blue-600']//*[name()='svg']");
    private By logoutButton = By.xpath("//button[normalize-space()='Log Out']");
    
    public OrganizationsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public void profilButton(){
        driver.findElement(profilButton).click();
    }

    public void clickCreateOrganizationButton() {
        driver.findElement(buttonCreateOrganization).click();
    }

    public void clickAddOrganization(){
        driver.findElement(addButtonCreateOrganization).click();
    }

    public void clickChoseOrganization(){
        driver.findElement(choseOrganization).click();
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
    public void logoutButton(){
        driver.findElement(logoutButton).click();
    }

}
