package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductAttributePage {
	
	@FindBy(xpath="//span[text()='Add New Attribute']")
	private WebElement addNewAttributeBtn;
	
	@FindBy(xpath="//div[text()='Attribute Group']")
	private WebElement attributeGroupselect;
	
	@FindBy(xpath="//input[@id='attribute_group']")
	private WebElement attributeGrpNameSrchField;
	
	@FindBy(xpath="//div[text()='Attribute']")
	private WebElement attributeselect;
	
	@FindBy(xpath="//input[@id='attribute_name']")
	private WebElement attributeNameSrchField;
	
	//Initialization
	public ProductAttributePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewAttributeBtn() {
		return addNewAttributeBtn;
	}

	public WebElement getAttributeGroupselect() {
		return attributeGroupselect;
	}

	public WebElement getAttributeGrpNameSrchField() {
		return attributeGrpNameSrchField;
	}

	public WebElement getAttributeselect() {
		return attributeselect;
	}

	public WebElement getAttributeNameSrchField() {
		return attributeNameSrchField;
	}
}
