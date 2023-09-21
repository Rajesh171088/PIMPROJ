package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.viniculum.genericutility.WebActionUtility;

public class ProductEditPage {
	
	@FindBy(xpath="//*[text()='Edit']")
	private WebElement editBtn;
	
	@FindBy(xpath="//*[@id='display_name']")
	private WebElement displayNameEdtTxt;
	
	@FindBy(xpath="//*[text()='Save']")
	private WebElement saveBtn;
	
	public ProductEditPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getDisplayNameEdtTxt() {
		return displayNameEdtTxt;
	}
	
	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public void editDisplayName(WebActionUtility wLib, String name) throws Throwable
	{
		wLib.waitAndClick(getEditBtn());
		wLib.waitAndType(getDisplayNameEdtTxt(), name);
		getSaveBtn().click();
	}
	
	
}
