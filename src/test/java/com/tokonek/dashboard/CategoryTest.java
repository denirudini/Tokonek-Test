package com.tokonek.dashboard;

import org.testng.annotations.Test;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.dasboard.CategoryPage;
import com.tokonek.dasboard.InventoryPage;
import com.tokonek.utils.DriverUtil;

public class CategoryTest extends BaseTest {
    private OrganizationsPage organizationsPage;
    private InventoryPage inventory;
    private CategoryPage category;

     @Test( priority = 1)
    public void choseOrganizationsTest() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        
        organizationsPage.clickChoseOrganization();
        Thread.sleep(1000); 
    }

    @Test( priority = 2)
    public void catalogueCategory() throws InterruptedException{
        inventory = new InventoryPage(DriverUtil.getDriver());
        inventory.clickMenuInventory();
        Thread.sleep(1000);
        category = new CategoryPage(DriverUtil.getDriver());
        category.clickMenuCategory();
        Thread.sleep(1000);
    }

    @Test(priority = 3)
    public void addCategory() throws InterruptedException{
        category = new CategoryPage(DriverUtil.getDriver());
        category.addCategory();
        Thread.sleep(1000); 
        category.nameCategory("Oversize");
        Thread.sleep(1000);
        category.typeCategorySub();
        Thread.sleep(1000);
        category.selectCategorySub();
        Thread.sleep(1000);
        category.choseCategory();
        Thread.sleep(1000);
        category.saveCategory();
        Thread.sleep(1000);

    }



}
