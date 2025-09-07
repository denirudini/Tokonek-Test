package com.tokonek.dashboard.menus;
import org.testng.annotations.BeforeTest;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.inventory.CategoryPage;
import com.tokonek.inventory.ProductPage;
import com.tokonek.utils.DriverUtil;

public class MenuCategory extends BaseTest {
    private OrganizationsPage organizationsPage;
    private ProductPage inventory;
    private CategoryPage category;
    @BeforeTest
    public void choseOrganizationsTest() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        organizationsPage.clickChoseOrganization();
        Thread.sleep(1000);
        inventory = new ProductPage(DriverUtil.getDriver());
        inventory.clickMenuInventory();
        Thread.sleep(1000);
        category = new CategoryPage(DriverUtil.getDriver());
        category.clickMenuCategory();
    }
}
