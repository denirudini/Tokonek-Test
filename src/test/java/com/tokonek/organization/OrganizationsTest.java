package com.tokonek.organization;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.utils.DriverUtil;
import org.testng.annotations.Test;


public class OrganizationsTest extends BaseTest {
    private OrganizationsPage organizationsPage;
    @Test
    public void testCreateOrganization() throws InterruptedException {
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        
        organizationsPage.clickCreateOrganizationButton();
        Thread.sleep(2000); 
    }
 
}
