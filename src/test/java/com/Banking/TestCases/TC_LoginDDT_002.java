package com.Banking.TestCases;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Banking.PageObjects.LoginPage;
import com.Banking.Utilities.ExcelUtility;

public class TC_LoginDDT_002 extends BaseClass{
	
	@Test(dataProvider="LoginTestData")
	public void LoginDDT(String User, String Pwd) {
		
		LoginPage lp = new LoginPage(driver);
		lp.Username(User);
		System.out.println("UserName Provided");
		lp.Password(Pwd);
		System.out.println("Password Provided");
		lp.LoginBtn();
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			System.out.println("Login Failed");
		}else {
			Assert.assertTrue(true);
			System.out.println("Login Passed");
			lp.LogoutBtn();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
		
		
		
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		}catch(NoAlertPresentException e) {
			return false;
			
		}
	}
	
	@DataProvider(name="LoginTestData")
	String[][] getData(){
		
		String Path = System.getProperty("user.dir")+"/src/test/java/com/Banking/TestData/LoginTestData.xlsx";
		
		int RC = ExcelUtility.getRowCount(Path, "Sheet1");
		int CC = ExcelUtility.getCellCountOnTheRow(Path, "Sheet1", 0);
		
		String LoginTestData[][]=new String[RC][CC];
		for(int i=1; i<=RC;i++){
			for(int j=0; j<CC;j++) {
				LoginTestData[i-1][j]= ExcelUtility.getCellValue(Path, "Sheet1", i, j);
			}
		}
		
		return LoginTestData;
	}

}
