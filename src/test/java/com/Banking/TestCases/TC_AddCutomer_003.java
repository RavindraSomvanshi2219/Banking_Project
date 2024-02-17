package com.Banking.TestCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Banking.PageObjects.AddCustomerPage;
import com.Banking.PageObjects.LoginPage;

public class TC_AddCutomer_003 extends BaseClass {

	LoginPage getLoginPage;
	AddCustomerPage getAddCustomerPage;

	@Test
	public void AddCutomer() {

		getLoginPage = new LoginPage(driver);
		getAddCustomerPage = new AddCustomerPage(driver);

		driver.get(BaseUrl);
		getLoginPage.Username(SetUserName);
		getLoginPage.Password(SetPassword);
		getLoginPage.LoginBtn();

		String Title = driver.getTitle();
		Assert.assertEquals(Title, "Guru99 Bank Manager HomePage");

		getAddCustomerPage.AddNewCutomer();
		
		driver.switchTo().frame(driver.findElement(By.id("google_ads_iframe_/24132379/INTERSTITIAL_DemoGuru99_0")));
		getAddCustomerPage.AdDismissBtn();
		driver.switchTo().defaultContent();
		
		getAddCustomerPage.NameField("vivek patil");
		getAddCustomerPage.GenderOpt();
		getAddCustomerPage.DateOfBirth("05", "19", "2002");
		getAddCustomerPage.AddressField("Mumbai");
		getAddCustomerPage.CityField("Jalgaon");
		getAddCustomerPage.StateField("qkjnfqh");
		getAddCustomerPage.PinNum("258963");
		getAddCustomerPage.MobileNum("2121212121");

		String GenerateEmail = GenerateEmail() + "@gmail.com";
		getAddCustomerPage.Email(GenerateEmail);
		getAddCustomerPage.Password("ravi@123");
		getAddCustomerPage.SubmitBtn();

		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		if (res == true) {
			Assert.assertTrue(true);
		} else {
			takeScreenShot("./Banking_Project/ScreenShots");
			Assert.assertTrue(false);

		}
	}

	public String GenerateEmail() {

		String GenerateString = RandomStringUtils.randomAlphabetic(8);
		return (GenerateString);

	}

}
