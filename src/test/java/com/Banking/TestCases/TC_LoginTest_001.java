package com.Banking.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking.PageObjects.LoginPage;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class TC_LoginTest_001 extends BaseClass {

	LoginPage getLoginPage;

	@Test
	public void LoginTest() {
		
		driver.get(BaseUrl);
		
		getLoginPage = new LoginPage(driver);
		
		getLoginPage.Username(SetUserName);
		getLoginPage.Password(SetPassword);
		getLoginPage.LoginBtn();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			System.out.println("Login Test Passed");
		}else {
			takeScreenShot("./Banking_Project/ScreenShots");
			Assert.assertTrue(false);
			System.out.println("Login Test Failed");
		}
	
	}

}
