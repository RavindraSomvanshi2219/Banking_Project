package com.Banking.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Banking.Utilities.SeleniumUtility;

public class EditCustomerPage extends SeleniumUtility {
	public EditCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Edit Customer']")
	private WebElement editCutomerLink;

	@FindBy(xpath = "//input[@name=\"cusid\"]")
	private WebElement custId;

	@FindBy(xpath = "//input[@name=\"AccSubmit\"]")
	private WebElement submit;

	@FindBy(xpath = "//input[@name=\"city\"]")
	private WebElement editcity;

	@FindBy(xpath = "//input[@name=\"sub\"]")
	private WebElement submitBtn;

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getEditName() {
		return editcity;
	}

	public WebElement getEditCutomerLink() {
		return editCutomerLink;
	}

	public WebElement getCustId() {
		return custId;
	}

	public WebElement getSubmit() {
		return submit;
	}

//*************************************************************

	public void EditCustLink() {
		clickOnElement(editCutomerLink);
	}

	public void CustIdField(String Id) {
		typeInput(custId, Id);
	}

	public void SubmitBtn() {
		clickOnElement(submit);
	}

	public void EditCity(String Name) {
		typeInput(editcity, Name);
	}

	public void EditSubmitBtn() {
		clickOnElement(submitBtn);
	}

}
