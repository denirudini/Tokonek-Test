package com.tokonek.dashboard.menu;

import org.testng.annotations.BeforeTest;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.dasboard.ProductPage;
import com.tokonek.dasboard.StockPage;
import com.tokonek.utils.DriverUtil;

public class MenuStockAdjustment extends BaseTest {
    private OrganizationsPage organizationsPage;
    private ProductPage inventory;
    private StockPage stockPage;
    @BeforeTest
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

