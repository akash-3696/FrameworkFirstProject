package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@title='My Account']")
	private WebElement myAccountDropDown;
	
	public WebElement myAccountDropDown() {
		return myAccountDropDown;
	}
	
	@FindBy(linkText="Login")
	private WebElement loginOption;
	
	public WebElement loginOption() {
		return loginOption;
	}
	
	@FindBy(linkText="Register")
	private WebElement registerOption;
	
	public WebElement registerOption() {
		return registerOption;
	} 

}
