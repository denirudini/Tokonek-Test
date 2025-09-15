package com.tokonek.dashboard.products;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.tokonek.dashboard.menus.MenuProduct;
import com.tokonek.inventory.ProductPage;
import com.tokonek.utils.DriverUtil;


public class ProductImportTest extends MenuProduct {
    private ProductPage inventory;

    @Test
    public void importProduct() throws InterruptedException, AWTException{
        inventory = new ProductPage(DriverUtil.getDriver());
        inventory.buttonImport();
        inventory.uploadFile();
        Thread.sleep(2000);
        inventory.importProduct();
    }
}
 