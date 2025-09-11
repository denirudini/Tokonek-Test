package com.tokonek.dashboard.menus;

import org.testng.annotations.BeforeMethod;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.inventory.ProductPage;
import com.tokonek.utils.DriverUtil;

public class MenuProduct extends BaseTest {
    private OrganizationsPage organizationsPage;
    private ProductPage inventory;
    @BeforeMethod
    public void choseOrganizationsTest() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        organizationsPage.clickChoseOrganization();
        Thread.sleep(1000);
        inventory = new ProductPage(DriverUtil.getDriver());
        inventory.clickMenuInventory();
        Thread.sleep(1000);
        inventory.menuProductButton();
        Thread.sleep(1000);
    }
}
