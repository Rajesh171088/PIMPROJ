package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.viniculum.genericutility.WebActionUtility;

public class AddNewReferenceAttributePage {
	
	@FindBy(xpath="//select[@id='masterEntityName']")
	private WebElement refMasterDrpDown;
	
	@FindBy(id="attributeName")
	private WebElement attributeNameEdttxt;
	
	@FindBy(id="displayName")
	private WebElement displayNameEdtTxt;
	
	@FindBy(id="length")
	private WebElement attributelengthEdtTxt;
	
	@FindBy(xpath="//select[@id='type']")
	private WebElement typeDropDown;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='mandatory']")
	private WebElement mandatoryCheckBox;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='editability']")
	private WebElement editablilityCheckBox;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='panel']")
	private WebElement panelCheckBox;
	
	@FindBy(xpath="//span[text()='Add']")
	private WebElement addBtn;
	
	@FindBy(xpath="//u[text()='Add More Attribute']")
	private WebElement addMoreAttLink;
	
	//initialization
	
	public AddNewReferenceAttributePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getRefMasterDrpDown() {
		return refMasterDrpDown;
	}

	public WebElement getAttributeNameEdttxt() {
		return attributeNameEdttxt;
	}

	public WebElement getDisplayNameEdtTxt() {
		return displayNameEdtTxt;
	}

	public WebElement getAttributelengthEdtTxt() {
		return attributelengthEdtTxt;
	}

	public WebElement getTypeDropDown() {
		return typeDropDown;
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

	public WebElement getAddMoreAttLink() {
		return addMoreAttLink;
	}
	
	public void createNewRefAttribute(WebDriver driver, WebActionUtility wLib,String text,String attrName,String displayName, String attrLength,String attrType) throws Throwable
	{
		wLib.waitForElement(driver,getRefMasterDrpDown());
		wLib.select(getRefMasterDrpDown(), text);
		getAttributeNameEdttxt().sendKeys(attrName);
		getDisplayNameEdtTxt().sendKeys(displayName);
		getAttributelengthEdtTxt().sendKeys(attrLength);
		wLib.select(getTypeDropDown(), attrType);
		getEditablilityCheckBox().click();
		getAddBtn().click();
	}
	
}
