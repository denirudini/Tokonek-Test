package com.tokonek;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.tokonek.utils.DriverUtil;

public class Logout extends BaseTest{

    private OrganizationsPage organizationsPage;

    @Test( priority = 3)
    public void logoutTest() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        organizationsPage.clickChoseOrganization();
        Thread.sleep(2000);
        organizationsPage.profilButton();
        Thread.sleep(1000);
        organizationsPage.logoutButton();
        Thread.sleep(2000);
        String actual = DriverUtil.getDriver().findElement(By.xpath("//h2[normalize-space()='Welcome Back']")).getText();
        String expected = "Welcome Back";
        Assert.assertEquals(actual, expected, "Berasil kembali kehalaman Login");  
        Thread.sleep(1000);
    }
}
