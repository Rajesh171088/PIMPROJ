package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAttributeGroupReferenceMasterPage {

	public AddNewAttributeGroupReferenceMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//v
//	MA014
//	Verify that user is able to assign a reference master to a category
	

	@FindBy(xpath = "//span[text()='Product demo']")
	private WebElement productDemo;
	
	@FindBy(xpath = "//span[text()='Products details']/..//following-sibling::span[text()='Attributes']")
	private WebElement addAttribute;
	
	@FindBy(xpath = "//span[text()='Add New Attribute Group']")
	private WebElement addNewAttributeGroupField;
	
	@FindBy(xpath = "attributeGroupName")
	private WebElement attributeGroupName;
	
	@FindBy(id="attributeName")
	private WebElement addAttributeName;
	
	@FindBy(id = "displayName")
	private WebElement addDisplayName;
	
	@FindBy(id = "length")
	private WebElement addLength;
	
	@FindBy(xpath = "//input[@value='foreign_key']")
	private WebElement foreignKey;
	
	@FindBy(id = "referenceMaster")
	private WebElement referenceMasterDropdown;
	
	@FindBy(id = "referenceAttribute")
	private WebElement referenceAttributeDropdown;
	
	@FindBy(id="type")
	private WebElement fieldType;

	@FindBy(xpath = "//option[text()='MultiSelect']")
	private WebElement multiSelect;
	
	@FindBy(id = "dataType")
	private WebElement dataType;
	
	@FindBy(xpath = "//option[text()='Varchar']")
	private WebElement varcharDatatype;
	
	@FindBy(id = "editability")
	private WebElement editabilityCheckBox;
	
	@FindBy(id = "ActionMasterAttributeComponentModel1")
	private WebElement addAttributeButton;
	
	@FindBy(xpath = "//div[text()='Success']")
	private WebElement successAddAttributeText;

	public WebElement getProductDemo() {
		return productDemo;
	}

	public WebElement getAddAttribute() {
		return addAttribute;
	}

	public WebElement getAddNewAttributeGroupField() {
		return addNewAttributeGroupField;
	}

	public WebElement getAttributeGroupName() {
		return attributeGroupName;
	}

	public WebElement getAddAttributeName() {
		return addAttributeName;
	}

	public WebElement getAddDisplayName() {
		return addDisplayName;
	}

	public WebElement getAddLength() {
		return addLength;
	}

	public WebElement getForeignKey() {
		return foreignKey;
	}

	public WebElement getReferenceMasterDropdown() {
		return referenceMasterDropdown;
	}

	public WebElement getReferenceAttributeDropdown() {
		return referenceAttributeDropdown;
	}

	public WebElement getFieldType() {
		return fieldType;
	}

	public WebElement getMultiSelect() {
		return multiSelect;
	}

	public WebElement getDataType() {
		return dataType;
	}

	public WebElement getVarcharDatatype() {
		return varcharDatatype;
	}

	public WebElement getEditabilityCheckBox() {
		return editabilityCheckBox;
	}

	public WebElement getAddAttributeButton() {
		return addAttributeButton;
	}

	public WebElement getSuccessAddAttributeText() {
		return successAddAttributeText;
	}
	
	
}
