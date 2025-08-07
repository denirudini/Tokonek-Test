package com.tokonek.dashboard;

import org.testng.annotations.Test;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.dasboard.InventoryPage;
import com.tokonek.utils.DriverUtil;

public class inventoryTest extends BaseTest{
private OrganizationsPage organizationsPage;
private InventoryPage inventory;

    @Test( priority = 1)
    public void choseOrganizationsTest() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        
        organizationsPage.clickChoseOrganization();
        Thread.sleep(1000); 
    }

    @Test(priority = 2)
    public void informationProduct()  throws InterruptedException{
        inventory = new InventoryPage(DriverUtil.getDriver());
        inventory.clickMenuInventory();
        Thread.sleep(1000);
        inventory.addProductButton();
        Thread.sleep(1000);

        inventory.fieldNameProduct("Oversize Threetofour");
        Thread.sleep(1000);

        inventory.fieldSKUProduct("SKU-001");
        Thread.sleep(1000);

        inventory.fieldCategory("Tas");

        inventory.fieldDescriptionProduct("Pakaian");
        Thread.sleep(1000);
    }
    @Test(priority = 3)
    public void detailProduct() throws InterruptedException{
        inventory = new InventoryPage(DriverUtil.getDriver());
        inventory.fieldPriceProduct("20000");
        Thread.sleep(500);
        inventory.fieldStockProduct("100");
        Thread.sleep(500);
        inventory.fieldWeightProduct("1000");
        Thread.sleep(15000);
        inventory.fieldImageProduct("C:\\Users\\denir\\Downloads\\25.png");
        Thread.sleep(2000);
        inventory.buttonSaveProduct();
    }

    
}
