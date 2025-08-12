package com.tokonek.dashboard.product;

import org.testng.annotations.Test;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.dasboard.ProductPage;
import com.tokonek.utils.DriverUtil;

public class ProductEdit extends BaseTest{
    private OrganizationsPage organizationsPage;
    private ProductPage inventory;

   @Test( priority = 1)
    public void choseOrganizationsTest() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver()); 
        organizationsPage.clickChoseOrganization();
        Thread.sleep(1000); 
    }
    @Test (priority = 2)
    public void deleteProduct() throws InterruptedException{
        inventory = new ProductPage(DriverUtil.getDriver());
        inventory.clickMenuInventory();
        Thread.sleep(1000);
        inventory.menuProductButton();
        Thread.sleep(1000);
        inventory.editButton();
        Thread.sleep(1000);
    }
    @Test (priority = 3)
    public void editInformationProduct() throws InterruptedException{
        Thread.sleep(2000);
        inventory.fieldNameProduct("Oversize Threetofour - kameja planel ");
        Thread.sleep(1000);
        inventory.fieldSKUProduct("SKU-001");
        inventory.categoryDropdown();
        Thread.sleep(1000);
        inventory.categoryChose();
        Thread.sleep(1000);
        inventory.categoryChoseNext();
        Thread.sleep(1000);
        inventory.fieldDescriptionProduct("nyoba edit / update product");
        Thread.sleep(1000);
        inventory.fieldBarcode("barcode Qris");
        Thread.sleep(1000);
        inventory.buttonSaveProduct();
        Thread.sleep(10000);
        
    }
}
