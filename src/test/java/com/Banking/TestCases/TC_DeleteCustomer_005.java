package com.Banking.TestCases;

import org.testng.annotations.Test;

import com.Banking.PageObjects.DeleteCustomerPage;
import com.Banking.PageObjects.LoginPage;

public class TC_DeleteCustomer_005 extends BaseClass{
	
	LoginPage getLoginPage;
	DeleteCustomerPage getDeleteCustomerPage;
	
	@Test
	public void DeleteCustomer() {
		
		getLoginPage = new LoginPage(driver);
		getDeleteCustomerPage = new DeleteCustomerPage(driver);
		
		driver.get(BaseUrl);
		getLoginPage.Username(SetUserName);
		getLoginPage.Password(SetPassword);
		getLoginPage.LoginBtn();
		
		getDeleteCustomerPage.DeleteCustLink();
		getDeleteCustomerPage.DeleteCustId("60610");
		getDeleteCustomerPage.DeleteSubmitBtn();
		
		driver.switchTo().alert().accept();
	}

}
