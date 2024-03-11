package com.Banking.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Banking.PageObjects.AddCustomerPage;
import com.Banking.PageObjects.EditCustomerPage;
import com.Banking.PageObjects.LoginPage;

public class TC_EditCustomer_004 extends BaseClass{

	LoginPage getLoginPage;
	EditCustomerPage getEditCustomerPage;
	AddCustomerPage getAddCustomerPage;
	
	@Test
	public void EditCustomer() {
		
		getLoginPage = new LoginPage(driver);
		getEditCustomerPage = new EditCustomerPage(driver);
		getAddCustomerPage = new AddCustomerPage(driver);
		
		driver.get(BaseUrl);
		getLoginPage.Username(SetUserName);
		getLoginPage.Password(SetPassword);
		getLoginPage.LoginBtn();
		
		getEditCustomerPage.EditCustLink();
		//getEditCustomerPage.DisnissBtn();
		driver.switchTo().frame(driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0")));
		getAddCustomerPage.AdDismissBtn();
		driver.switchTo().defaultContent();
		
		getEditCustomerPage.CustIdField("60610");
		getEditCustomerPage.SubmitBtn();
		
		getEditCustomerPage.EditCity("Gujrat");
		getEditCustomerPage.EditSubmitBtn();
		
		getEditCustomerPage.EditCustLink();
		getEditCustomerPage.CustIdField("60610");
		getEditCustomerPage.SubmitBtn();
		
	}
}
