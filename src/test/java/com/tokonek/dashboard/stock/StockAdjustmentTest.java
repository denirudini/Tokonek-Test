package com.tokonek.dashboard.stock;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.tokonek.dasboard.StockPage;
import com.tokonek.dashboard.menu.MenuStockAdjustment;
import com.tokonek.utils.DriverUtil;

public class StockAdjustmentTest extends MenuStockAdjustment {
    private StockPage stockPage;
     @Test(priority = 1)
    public void informationProduct()  throws InterruptedException{
        stockPage = new StockPage(DriverUtil.getDriver());
        stockPage.addStockAdjustment();
        Thread.sleep(1000);
        stockPage.selectProduct("Oversize - Rucas Skuyliving");
        Thread.sleep(1000);
        stockPage.selectTipeAdjustment();
        Thread.sleep(1000);
        stockPage.enterAddStock("10");
        Thread.sleep(1000);
        stockPage.enterDescription("Menambahkan stok produk Oversize - Rucas Skuyliving sebanyak 10 unit");
        Thread.sleep(1000);
        stockPage.clickSave();
        String actual = stockPage.getSuccessMessage();
        String expected = "Penyesuaian stok berhasil disimpan";
        Assert.assertEquals(actual, expected, "Stock adjustment success message does not match expected.");
        Thread.sleep(10000);
    }
}
