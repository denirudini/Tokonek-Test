package com.tokonek.dashboard.menus;

import org.testng.annotations.BeforeMethod;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.inventory.ProductPage;
import com.tokonek.inventory.StockPage;
import com.tokonek.utils.DriverUtil;

public class MenuStockAdjustment extends BaseTest {
    private OrganizationsPage organizationsPage;
    private ProductPage inventory;
    private StockPage stockPage;
    @BeforeMethod
    public void choseOrganizationsTest() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        organizationsPage.clickChoseOrganization();
        Thread.sleep(1000);
        inventory = new ProductPage(DriverUtil.getDriver());
        inventory.clickMenuInventory();
        Thread.sleep(1000);
        stockPage = new StockPage(DriverUtil.getDriver());
        stockPage.clickMenuStockAdjustment();
        Thread.sleep(1000);
    }
}

