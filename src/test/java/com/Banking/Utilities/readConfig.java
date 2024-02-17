package com.Banking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
	
	Properties prop;
	
	public readConfig() {
		
		File src = new File("./Configuration/config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getAppUrl() {
		
		String Url = prop.getProperty("BaseUrl");
		return Url;
	}
	
	public String getUserName() {
		String UserName = prop.getProperty("SetUserName");
		return UserName;
	}
	
	public String getPassword() {
		String Password = prop.getProperty("SetPassword");
		return Password;
	}
	
	public String getFirefoxPAth() {
		String FirefoxPath = prop.getProperty("FirefoxPath");
		return FirefoxPath;
	}
	
	public String getChromePath() {
		String ChromePath = prop.getProperty("ChromePath");
		return ChromePath;
	}
	

}
