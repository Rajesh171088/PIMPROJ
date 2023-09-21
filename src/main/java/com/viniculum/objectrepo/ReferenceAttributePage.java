package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.viniculum.genericutility.WebActionUtility;

public class ReferenceAttributePage {
	
	@FindBy(xpath="//span[text()='Add New Attribute']")
	private WebElement addNewAttributeBtn;
	
	@FindBy(id="attribute_name")
	private WebElement attributenameSrchTxt;
	
	@FindBy(xpath="//*[text()='Reference Attribute has been created successfully']")
	private WebElement refAttributeCrtMsg;
	
	//initialization
	public ReferenceAttributePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement getRefAttributeCrtMsg() {
		return refAttributeCrtMsg;
	}
	
	public WebElement getAddNewAttributeBtn() {
		return addNewAttributeBtn;
	}

	public WebElement getAttributenameSrchTxt() {
		return attributenameSrchTxt;
	}
	
	public void clickOnAddNewAttrBtn(WebActionUtility wLib) throws Throwable
	{
		wLib.waitAndClick(getAddNewAttributeBtn());
	}
}
