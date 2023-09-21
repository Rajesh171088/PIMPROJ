package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {	
	
	@FindBy(xpath="//button[@data-action='toggle']")
	private WebElement ShowPasswordBtn;
	
	public WebElement getShowPasswordBtn() {
		return ShowPasswordBtn;
	}

	public WebElement getPasswordEdttxt() {
		return passwordEdttxt;
	}

	@FindBy(id="username")
	private WebElement usernameEdtTxt;
	
	@FindBy(name="password")
	private WebElement passwordEdttxt;
	
	@FindBy(xpath="//*[text()='Continue']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//button[@name='action' and @data-action-button-primary='true']")
	private WebElement loginContinueBtn;
	
	public WebElement getLoginContinueBtn() {
		return loginContinueBtn;
	}

	@FindBy(xpath="//button[@data-provider='google']")
	private WebElement continueWithgoogleBtn;
	
	@FindBy(xpath="//button[@data-provider='samlp']")
	private WebElement continueWithVinComBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUsernameEdtTxt() {
		return usernameEdtTxt;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getContinueWithgoogleBtn() {
		return continueWithgoogleBtn;
	}

	public WebElement getContinueWithVinComBtn() {
		return continueWithVinComBtn;
	}
	
	public void setLogin(String username,String password)
	{
		getUsernameEdtTxt().sendKeys(username);
		getContinueBtn().click();
		getPasswordEdttxt().sendKeys(password);
		getLoginContinueBtn().click();
	}
}
