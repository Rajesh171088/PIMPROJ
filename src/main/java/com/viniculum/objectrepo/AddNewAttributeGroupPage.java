package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AddNewAttributeGroupPage {
	
	@FindBy(id="attributeGroupName")
	private WebElement attributeGrpnameEdtTxt;
	
	@FindBy(id="attributeName")
	private WebElement attributeNameEdttxt;
	
	@FindBy(id="displayName")
	private WebElement attributeDisplaynameEdtTxt;
	
	@FindBy(id="length")
	private WebElement attributeLengthEdtTxt;
	
	@FindBy(xpath="//input[@id='constraint' and @value='foreign_key']")
	private WebElement foreignkeyRadiobtn;
	
	@FindBy(xpath="//input[@id='constraint' and @value='unique_key']")
	private WebElement uniqueKeyRadiobtn;
	
	@FindBy(xpath="//select[@id='referenceMaster']")
	private WebElement refMasterDropDown;
	
	@FindBy(xpath="//select[@id='referenceAttribute']")
	private WebElement refAttributeDropDown;
	
	@FindBy(xpath="//select[@id='type']")
	private WebElement fieldTypeDropDown;
	
	@FindBy(xpath="//select[@id='dataType']")
	private WebElement dataTypeDropDown;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='mandatory']")
	private WebElement mandatoryCheckBox;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='editability']")
	private WebElement editablilityCheckBox;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='panel']")
	private WebElement panelCheckBox;
	
	@FindBy(xpath="//span[text()='Add']")
	private WebElement addBtn;
	
	//Initialization
	public AddNewAttributeGroupPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAttributeGrpnameEdtTxt() {
		return attributeGrpnameEdtTxt;
	}

	public WebElement getAttributeNameEdttxt() {
		return attributeNameEdttxt;
	}

	public WebElement getAttributeDisplaynameEdtTxt() {
		return attributeDisplaynameEdtTxt;
	}

	public WebElement getAttributeLengthEdtTxt() {
		return attributeLengthEdtTxt;
	}

	public WebElement getForeignkeyRadiobtn() {
		return foreignkeyRadiobtn;
	}

	public WebElement getUniqueKeyRadiobtn() {
		return uniqueKeyRadiobtn;
	}

	public WebElement getRefMasterDropDown() {
		return refMasterDropDown;
	}

	public WebElement getRefAttributeDropDown() {
		return refAttributeDropDown;
	}

	public WebElement getFieldTypeDropDown() {
		return fieldTypeDropDown;
	}

	public WebElement getDataTypeDropDown() {
		return dataTypeDropDown;
	}

	public WebElement getMandatoryCheckBox() {
		return mandatoryCheckBox;
	}

	public WebElement getEditablilityCheckBox() {
		return editablilityCheckBox;
	}

	public WebElement getPanelCheckBox() {
		return panelCheckBox;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}	
}
