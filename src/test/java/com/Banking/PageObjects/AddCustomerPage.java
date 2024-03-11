package com.Banking.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.Banking.Utilities.SeleniumUtility;

public class AddCustomerPage extends SeleniumUtility{
	
	public AddCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='New Customer']")
	private WebElement newcutomerlink;
	
	@FindBy(xpath = "//div[@id=\"dismiss-button\"]")
	private WebElement adDismissBtn;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement namefield;
	
	@FindBy(xpath="//input[@value=\"m\"]")
	private WebElement gender;
	
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	@CacheLookup
	private WebElement dob;
	
	@FindBy(xpath="//textarea[@name=\"addr\"]")
	private WebElement address;
	
	@FindBy(xpath="//input[@name=\"city\"]")
	private WebElement city;
	
	@FindBy(xpath="//input[@name=\"state\"]")
	private WebElement state;
	
	@FindBy(xpath="//input[@name=\"pinno\"]")
	private WebElement pinnum;
	
	@FindBy(xpath="//input[@name=\"telephoneno\"]")
	private WebElement mobilenum;
	
	@FindBy(xpath="//input[@name=\"emailid\"]")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	private WebElement password;
	
	@FindBy(xpath="//input[@value=\"Submit\"]")
	private WebElement submitbtn;
	
// ***********************************************************

	public WebElement getNewcutomerlink() {
		return newcutomerlink;
	}
	
	public WebElement getadDismissBtn() {
		return adDismissBtn;
	}
	
	public WebElement getNamefield() {
		return namefield;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getcity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPinnum() {
		return pinnum;
	}

	public WebElement getMobilenum() {
		return mobilenum;
	}

	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	
//*****************************************************************
	
	public void AddNewCutomer() {
		clickOnElement(newcutomerlink);
		
	}
	
	public void AdDismissBtn() {
		adDismissBtn.click();
		
	}
	
	public void NameField(String name) {
		namefield.click();
		namefield.sendKeys(name);
	}
	
	public void GenderOpt() {
		clickOnElement(gender);
	}
	
	public void DateOfBirth(String mm, String dd, String yy) {
		dob.sendKeys(mm);
		dob.sendKeys(dd);
		dob.sendKeys(yy);
	}
	
	public void AddressField(String Address) {
		typeInput(address, Address);
	}
	
	public void CityField(String City) {
		typeInput(city, City);
	}
	
	public void StateField(String State) {
		typeInput(state, State);
	}
	
	public void PinNum(String PinNum) {
		typeInput(pinnum,PinNum);
	}
	
	public void MobileNum(String MobileNum) {
		typeInput(mobilenum, MobileNum);
	}
	
	public void Email(String Email) {
		typeInput(emailid, Email);
	}
	
	public void Password(String Password) {
		typeInput(password, Password);
	}
	
	public void SubmitBtn() {
		clickOnElement(submitbtn);
	}
	
	
	
}
