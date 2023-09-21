package com.viniculum.objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.viniculum.genericutility.WebActionUtility;

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
	
	@FindBy(xpath="//div[text()='Attribute Group has been updated successfully']")
	private WebElement attrGrpCrtSuccessMsg;
	
	//Initialization
	public ProductAttributePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewAttributeBtn() {
		return addNewAttributeBtn;
	}

	public WebElement getAttrGrpCrtSuccessMsg() {
		return attrGrpCrtSuccessMsg;
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
	
	public void createNewAttribute(WebActionUtility wLib) throws Throwable
	{
		wLib.waitAndClick(getAddNewAttributeBtn());		
	}
	public void clickOnAddNewAttribute(WebActionUtility wLib) throws Throwable
	{
		wLib.waitAndClick(getAddNewAttributeBtn());
	}
	
	public void clickOnAttributeName(WebDriver driver,WebActionUtility wLib,String attrName) throws Throwable
	{
		wLib.waitAndType(getAttributeNameSrchField(), attrName);
		WebElement ele=driver.findElement(By.xpath("//u[text()='"+attrName+"']"));
		wLib.waitAndClick(ele);
	}
}
