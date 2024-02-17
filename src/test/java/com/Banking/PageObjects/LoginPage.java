package com.Banking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Banking.Utilities.SeleniumUtility;

public class LoginPage extends SeleniumUtility {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="uid")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="btnLogin")
	private WebElement loginbtn;
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logoutbtn;

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
//*********************************************************

    public void Username(String Username) {
		typeInput(username, Username);
	}

	public void Password(String Password) {
		typeInput(password, Password);
	}
	
	public void LoginBtn() {
		clickOnElement(loginbtn);
	}
	
	public void LogoutBtn() {
		clickOnElement(logoutbtn);
	}

}
