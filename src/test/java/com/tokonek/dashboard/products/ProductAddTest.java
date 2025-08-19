package com.tokonek.dashboard.products;

import org.testng.annotations.Test;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.dasboard.ProductPage;
import com.tokonek.utils.DriverUtil;

public class ProductAddTest extends BaseTest{
private OrganizationsPage organizationsPage;
private ProductPage inventory;

    @Test( priority = 1)
    public void choseOrganizationsTest() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        
        organizationsPage.clickChoseOrganization();
        Thread.sleep(1000); 
    }

    @Test(priority = 2)
    public void informationProduct()  throws InterruptedException{
        inventory = new ProductPage(DriverUtil.getDriver());
        inventory.clickMenuInventory();
        Thread.sleep(1000);
        inventory.addProductButton();
        Thread.sleep(1000);

        inventory.fieldNameProduct("Oversize Threetofour - Hoodlem series");
        Thread.sleep(1000);

        inventory.fieldSKUProduct("SKU-002");
        Thread.sleep(1000);
        inventory.categoryDropdown();
        Thread.sleep(1000);
        inventory.categoryChose();
        Thread.sleep(1000);
        inventory.categoryChoseNext();
        Thread.sleep(1000);
        inventory.fieldDescriptionProduct("Pakaian");
        Thread.sleep(1000);
        inventory.fieldBarcode("hahah barcode");
        Thread.sleep(1000);
        inventory.buttonSaveProduct();
        
    }
    // @Test(priority = 3)
    // public void detailProduct() throws InterruptedException{
    //     inventory = new ProductPage(DriverUtil.getDriver());
    //     inventory.fieldPriceProduct("20000");
    //     Thread.sleep(500);
    //     inventory.fieldStockProduct("100");
    //     Thread.sleep(500);
    //     inventory.fieldWeightProduct("1000");
    //     Thread.sleep(15000);
    //     inventory.fieldImageProduct("C:\\Users\\denir\\Downloads\\25.png");
    //     Thread.sleep(2000);
    //     inventory.buttonSaveProduct();
    // }

    
}
