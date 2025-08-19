package com.tokonek.dashboard.products;

import org.testng.annotations.Test;

import com.tokonek.dasboard.ProductPage;
import com.tokonek.dashboard.menu.MenuProduct;
import com.tokonek.utils.DriverUtil;

public class ProductEditTest extends MenuProduct{
    private ProductPage inventory;
; 
    @Test (priority = 1)
    public void editProduct() throws InterruptedException{
        inventory = new ProductPage(DriverUtil.getDriver());
        inventory.editButton();
        Thread.sleep(1000);
    }
    @Test (priority = 2)
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
