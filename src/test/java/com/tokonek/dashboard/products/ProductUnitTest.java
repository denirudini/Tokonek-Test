package com.tokonek.dashboard.products;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tokonek.dashboard.menus.MenuProductUnitTest;
import com.tokonek.inventory.ProductUnitPage;
import com.tokonek.utils.DriverUtil;

public class ProductUnitTest extends MenuProductUnitTest{
    private ProductUnitPage unit;

    @Test(priority = 1)
    public void tambahProductUnit() throws InterruptedException {
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
        Thread.sleep(3000);
    }
    
    @Test(priority = 2)
    public void tambahProductUnitKosongNama() throws InterruptedException{
        unit = new ProductUnitPage(DriverUtil.getDriver());
        unit.buttonTambahSatuan();
        unit.kodeSatuan("HH");
        unit.buttonCekSatuan();
        unit.description("Test Product Unit / Satuan");
        unit.buttonSimpan();
        String actual = DriverUtil.getDriver().findElement(By.xpath("//p[@class='mt-1 text-sm text-error text-sm']")).getText();
        String expected = "Nama satuan wajib diisi";
        System.out.println("berhasil " + actual);
        Assert.assertEquals(actual, expected, "Gagal melihat notifikasi");
    } 

    @Test(priority = 3)
    public void menggunakanKodeTersedia() throws InterruptedException{
        unit = new ProductUnitPage(DriverUtil.getDriver());
        unit.buttonTambahSatuan();
        unit.namaSatuan("yuhu");
        Thread.sleep(1000);
        unit.kodeSatuan("KG");
        unit.buttonCekSatuan();
        unit.description("Test Product Unit / Satuan");
        unit.buttonSimpan();
        String actual = DriverUtil.getDriver().findElement(By.xpath("(//p[@class='mt-1 text-sm text-error text-sm'])[1]")).getText();
        String expected = "Code already exists";
        Assert.assertEquals(actual, expected, "notifikasi tidak muncul");
        Thread.sleep(3000);
    }

    @Test(priority = 4)
    public void editSatuan() throws InterruptedException{
        unit = new ProductUnitPage(DriverUtil.getDriver());
        unit.edit();
        unit.namaSatuan("Centi Meter");
        Thread.sleep(1000);
        unit.kodeSatuan("cm");
        unit.buttonCekSatuan();
        unit.description("");
        unit.buttonPerbarui();
        String actual = unit.getMessegeSuccesEdit();
        String expected = "cm";
        Assert.assertEquals(actual, expected, "notifikasi tidak muncul");
        Thread.sleep(3000);
    }

    @Test(priority = 5)
    public void hapusSatuan() throws InterruptedException{
        unit = new ProductUnitPage(DriverUtil.getDriver());
        unit.hapus();
        unit.validasiHapus();
        String actual = unit.getMessegeSuccesDelete();
        String expected = "Satuan produk berhasil dihapus";
        Assert.assertEquals(actual, expected, "notifikasi tidak muncul");
        Thread.sleep(3000);
    }
}
