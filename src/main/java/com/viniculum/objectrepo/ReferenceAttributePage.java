package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReferenceAttributePage {
	
	@FindBy(xpath="//span[text()='Add New Attribute']")
	private WebElement addNewAttributeBtn;
	
	@FindBy(id="attribute_name")
	private WebElement attributenameSrchTxt;
	
	//initialization
	public ReferenceAttributePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public WebElement getAddNewAttributeBtn() {
		return addNewAttributeBtn;
	}

	public WebElement getAttributenameSrchTxt() {
		return attributenameSrchTxt;
	}
}
