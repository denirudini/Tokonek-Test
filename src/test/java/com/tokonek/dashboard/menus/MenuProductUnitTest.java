package com.tokonek.dashboard.menus;

import org.testng.annotations.BeforeTest;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.inventory.ProductPage;
import com.tokonek.inventory.ProductUnitPage;
import com.tokonek.utils.DriverUtil;

public class MenuProductUnitTest extends BaseTest {
    private OrganizationsPage organizationsPage;
    private ProductPage inventory;
    private ProductUnitPage unit;
    @BeforeTest
    public void choseOrganizationsTest() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        organizationsPage.clickChoseOrganization();
        Thread.sleep(1000);
        inventory = new ProductPage(DriverUtil.getDriver());
        inventory.clickMenuInventory();
        Thread.sleep(1000);
        unit = new ProductUnitPage(DriverUtil.getDriver());
        unit.menuProductUnit();
        Thread.sleep(1000);
    }
}
