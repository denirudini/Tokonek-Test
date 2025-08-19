package com.tokonek.dashboard.category;
import org.testng.annotations.Test;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.dasboard.CategoryPage;
import com.tokonek.dasboard.ProductPage;
import com.tokonek.utils.DriverUtil;

public class CategoryTestSub extends BaseTest {
    private OrganizationsPage organizationsPage;
    private ProductPage inventory;
    private CategoryPage category;

     @Test( priority = 1)
    public void choseOrganizationsTest() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        
        organizationsPage.clickChoseOrganization();
        Thread.sleep(1000); 
    }

    @Test( priority = 2)
    public void catalogueCategory() throws InterruptedException{
        inventory = new ProductPage(DriverUtil.getDriver());
        inventory.clickMenuInventory();
        Thread.sleep(1000);
        category = new CategoryPage(DriverUtil.getDriver());
        category.clickMenuCategory();
        Thread.sleep(1000);
    }

    @Test(priority = 3)
    public void addCategorySub() throws InterruptedException{
        category = new CategoryPage(DriverUtil.getDriver());
        category.addCategory();
        Thread.sleep(1000); 
        category.nameCategory("Hijab");
        Thread.sleep(1000);
        category.typeCategorySub();
        Thread.sleep(1000);
        category.categoryDropdown();
        Thread.sleep(1000);
        category.choseCategorySub();
        Thread.sleep(1000);
        category.saveCategory();
        Thread.sleep(1000);
    }



}
