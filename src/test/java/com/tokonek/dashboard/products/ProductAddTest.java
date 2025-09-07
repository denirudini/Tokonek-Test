package com.tokonek.dashboard.products;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tokonek.dashboard.menus.MenuProduct;
import com.tokonek.inventory.ProductPage;
import com.tokonek.utils.DriverUtil;

public class ProductAddTest extends MenuProduct{
private ProductPage inventory;

    @Test(priority = 1)
    public void informationProduct()  throws InterruptedException{
        inventory = new ProductPage(DriverUtil.getDriver());
        inventory.addProductButton();
        Thread.sleep(1000);

        inventory.fieldNameProduct("Oversize - Rucas skuyliving");
        Thread.sleep(1000);

        inventory.fieldSKUProduct("SKU-003");
        Thread.sleep(1000);
        inventory.categoryDropdown();
        Thread.sleep(1000);
        inventory.categoryChose();
        Thread.sleep(1000);
        // inventory.categoryChoseNext();
        // Thread.sleep(1000);
        inventory.fieldDescriptionProduct("Pakaian");
        Thread.sleep(1000);
        inventory.fieldBarcode("coba barcode");
        Thread.sleep(1000);
        inventory.buttonSaveProduct();
        String actual = inventory.getProductSucces();
        String expected = "Produk berhasil dibuat";
        Assert.assertEquals(actual, expected, "Product creation success message does not match expected.");
        Thread.sleep(10000);
    }
}
