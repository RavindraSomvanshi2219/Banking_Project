package com.Banking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Banking.Utilities.SeleniumUtility;

public class DeleteCustomerPage extends SeleniumUtility{
	public DeleteCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Delete Customer']")
	private WebElement deletecutomerlink;
	
	@FindBy(xpath="//input[@name=\'cusid\']")
	private WebElement customeridfield;
	
	@FindBy(xpath="//input[@name=\"AccSubmit\"]")
	private WebElement submitbtn;

	public WebElement getDeletecutomerlink() {
		return deletecutomerlink;
	}

	public WebElement getCustomernamefield() {
		return customeridfield;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
//**********************************************************
	
	public void DeleteCustLink() {
		clickOnElement(deletecutomerlink);
	}
	
	public void DeleteCustId(String Id) {
		typeInput(customeridfield, Id);
	}
	
	public void DeleteSubmitBtn() {
		clickOnElement(submitbtn);
	}
	
	
	
	
	
}
