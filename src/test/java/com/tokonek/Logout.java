package com.tokonek;

import org.testng.annotations.Test;
import com.tokonek.utils.DriverUtil;

public class Logout extends BaseTest{

    private OrganizationsPage organizationsPage;

    @Test( priority = 3)
    public void choseOrganizationsTest() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        
        organizationsPage.clickChoseOrganization();
        Thread.sleep(1000); 
    }
    @Test(priority = 4)
    public void logout() throws InterruptedException{
        Thread.sleep(2000);
        organizationsPage.profilButton();
        Thread.sleep(1000);
        organizationsPage.logoutButton();
        Thread.sleep(2000);
        
    }
}


