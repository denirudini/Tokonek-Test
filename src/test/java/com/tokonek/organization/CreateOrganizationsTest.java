package com.tokonek.organization;

import com.tokonek.BaseTest;
import com.tokonek.CreateOrganizationPage;
import com.tokonek.utils.DriverUtil;
import org.testng.annotations.Test;

public class CreateOrganizationsTest extends BaseTest {
   
    private CreateOrganizationPage createOrganizationPage; 
      
    @Test(priority = 1)
    public void inputOrganization() throws InterruptedException{
        
        createOrganizationPage = new CreateOrganizationPage(DriverUtil.getDriver());
        createOrganizationPage.enterOrganizationName("Deni rudini");
        Thread.sleep(1000);

        createOrganizationPage.enterOrganizationDescription("ini adalah test");
        Thread.sleep(1000);

        createOrganizationPage.enterOrganizationLogoUrl("https://example.com/logo.png");
        Thread.sleep(1000);

        createOrganizationPage.enterOrganizationWebsiteUrl("https://example.com");
        Thread.sleep(1000);
    }

    // @Test(priority = 2)
    // public void clickCreateButton() throws InterruptedException{
    //     createOrganizationPage = new CreateOrganizationPage(DriverUtil.getDriver());
    //     createOrganizationPage.clickCreateButton();
    // }

}

