package com.tokonek.dashboard.products;

import org.testng.annotations.Test;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.dasboard.ProductPage;
import com.tokonek.utils.DriverUtil;

public class ProductDeleteTest extends BaseTest{
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
        inventory.deleteButton();
        
    }
}
