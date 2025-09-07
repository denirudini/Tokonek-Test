package com.tokonek.dashboard.products;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tokonek.dashboard.menus.MenuProductUnitTest;
import com.tokonek.inventory.ProductUnitPage;
import com.tokonek.utils.DriverUtil;

public class ProductUnitTest extends MenuProductUnitTest{

    private ProductUnitPage unit;
    @Test(priority = 1)
    public void searchProductNodata() throws InterruptedException {
        unit = new ProductUnitPage(DriverUtil.getDriver());
        unit.buttonTambahSatuan();
        unit.namaSatuan("Kilogram");
        Thread.sleep(1000);
        unit.kodeSatuan("KG");
        unit.buttonCekSatuan();
        unit.description("Test Product Unit / Satuan");
        unit.buttonSimpan();
        String actual = unit.getMessegeSucces();
        String expected = "Satuan produk berhasil dibuat";
        Assert.assertEquals(actual, expected, "Search result does not match expected.");
        Thread.sleep(1000);
    } 
}
