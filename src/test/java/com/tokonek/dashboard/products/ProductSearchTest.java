package com.tokonek.dashboard.products;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tokonek.dashboard.menus.MenuProduct;
import com.tokonek.inventory.ProductPage;
import com.tokonek.utils.DriverUtil;

public class ProductSearchTest extends MenuProduct {
    private ProductPage inventory;
    @Test(priority = 1)
    public void searchProductNodata() throws InterruptedException {
        inventory = new ProductPage(DriverUtil.getDriver());
        inventory.searchProduct("sa");
        Thread.sleep(1000);
        String actual = inventory.getSearchResultText();
        String expected = "Tidak ada data";
        Assert.assertEquals(actual, expected, "Search result does not match expected.");
        Thread.sleep(1000);
    } 
    @Test(priority = 2)
    public void searchProduct() throws InterruptedException {
        inventory = new ProductPage(DriverUtil.getDriver());
        inventory.searchProduct("Oversize Threetofour");
        Thread.sleep(1000);
        String actual = inventory.getSearchSucces();
        String expected = "Oversize Threetofour - Hoodlem series";
        Assert.assertEquals(actual, expected, "Search result does not match expected.");
        Thread.sleep(1000);
    }  
}

