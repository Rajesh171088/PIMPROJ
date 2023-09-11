package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAttributePage {
	
	@FindBy(xpath="//input[@id='category_name']")
	private WebElement categoryEdtTxt;
	
	@FindBy(xpath="//select[@id='attributeGroupName']")
	private WebElement attributeGrpnameDropDown;
	
	@FindBy(xpath="//input[@id='attributeName']")
	private WebElement attributeNameEdtTxt;
	
	@FindBy(xpath="//input[@id='displayName']")
	private WebElement atributeDisplayNameEdtTxt;
	
	@FindBy(xpath="//input[@id='length']")
	private WebElement attributeLengthEdttxt;
	
	@FindBy(xpath="//input[@id='constraint' and @value='unique_key']")
	private WebElement uniquekeyradioBtn;
	
	@FindBy(xpath="//input[@id='constraint' and @value='foreign_key']")
	private WebElement foreignkeyRadioBtn;
	
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
	
	public AddNewAttributePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCategoryEdtTxt() {
		return categoryEdtTxt;
	}

	public WebElement getAttributeGrpnameDropDown() {
		return attributeGrpnameDropDown;
	}

	public WebElement getAttributeNameEdtTxt() {
		return attributeNameEdtTxt;
	}

	public WebElement getAtributeDisplayNameEdtTxt() {
		return atributeDisplayNameEdtTxt;
	}

	public WebElement getAttributeLengthEdttxt() {
		return attributeLengthEdttxt;
	}

	public WebElement getUniquekeyradioBtn() {
		return uniquekeyradioBtn;
	}

	public WebElement getForeignkeyRadioBtn() {
		return foreignkeyRadioBtn;
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
