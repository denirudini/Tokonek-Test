package com.tokonek.organization;

import org.testng.annotations.Test;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.utils.DriverUtil;

public class ChoseOrganizationsTest extends BaseTest{

     private OrganizationsPage organizationsPage;
    @Test()
    public void choseOrganizationsTest() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        
        organizationsPage.clickChoseOrganization();
        Thread.sleep(2000); 
     
    }
    
}
