package com.Banking.TestCases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Banking.Utilities.SeleniumUtility;
import com.Banking.Utilities.readConfig;



public class BaseClass extends SeleniumUtility {

	readConfig RC = new readConfig();

	public String BaseUrl = RC.getAppUrl();
	public String SetUserName = RC.getUserName();
	public String SetPassword = RC.getPassword();
	public static WebDriver driver;

	@Parameters("Browser")
	@BeforeClass
	public void Setup(String Br) {

		if (Br.equals("Chrome")) {
			driver = setUp("Chrome", BaseUrl);
		} else if (Br.equals("Firefox")) {
			driver = setUp("Firefox", BaseUrl);
		} else {
			driver.get(BaseUrl);
		}

	}

	@AfterClass
	public void TearDown() {
		driver.quit();
	}

	public void takeScreenShot(String location) {
		// type cast WebDriver instance into TakesScreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		// get screenshot using getScreenshotAs() of TakesScreenshot interface
		File file = ts.getScreenshotAs(OutputType.FILE);
		// store above screenshot into required location
		try {
			FileUtils.copyFile(file, new File(location));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

}
