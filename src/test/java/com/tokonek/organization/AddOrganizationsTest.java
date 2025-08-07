package com.tokonek.organization;

import org.testng.annotations.Test;

import com.tokonek.BaseTest;
import com.tokonek.OrganizationsPage;
import com.tokonek.utils.DriverUtil;

public class AddOrganizationsTest extends BaseTest {
    private OrganizationsPage organizationsPage;
  
    @Test
    public void clickAddOrganization() throws InterruptedException{
        organizationsPage = new OrganizationsPage(DriverUtil.getDriver());
        organizationsPage.clickAddOrganization();
        Thread.sleep(1000);
    }

    @Test
    public void inputOrganization() throws InterruptedException{
        //input form add organization
        organizationsPage.enterOrganizationName("Deni rudini");
        Thread.sleep(1000);

        organizationsPage.enterOrganizationDescription("ini adalah test");
        Thread.sleep(1000);

        organizationsPage.enterOrganizationLogoUrl("https://example.com/logo.png");
        Thread.sleep(1000);

        organizationsPage.enterOrganizationWebsiteUrl("https://example.com");
        Thread.sleep(1000);

    
        // organizationsPage.clickCreateButton();
    }

    
    
}
