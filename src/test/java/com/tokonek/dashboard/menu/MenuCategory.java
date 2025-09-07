package com.tokonek.dashboard.menu;
import org.testng.annotations.BeforeTest;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.dasboard.CategoryPage;
import com.tokonek.dasboard.ProductPage;
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
