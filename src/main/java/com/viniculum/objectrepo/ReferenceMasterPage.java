package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.viniculum.genericutility.FileUtlity;

public class ReferenceMasterPage {

	public ReferenceMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
//	v
//	MA008
//	Verify that the user is able to Add the New References Master 
	
	@FindBy(xpath = "//a[text()='Reference Master']")
	private WebElement referenceMasterButton;
	
	@FindBy(xpath = "//span[text()='Add New Reference Master']")
	private WebElement addNewReferenceMaster;
	
	@FindBy(id = "masterEntityName")
	private WebElement referenceMasterEntityName;
	
	@FindBy(id = "attributeName")
	private WebElement attributeName;
	
	@FindBy(id = "displayName")
	private WebElement displayName;
	
	@FindBy(id = "length")
	private WebElement length;
	
	@FindBy(id = "type")
	private WebElement type;
	
	@FindBy(xpath = "//option[text()='Boolean']")
	private WebElement booleanOption;
	
	@FindBy(xpath = "//option[text()='Date']")
	private WebElement dateOption;
	
	@FindBy(xpath = "//option[text()='Float']")
	private WebElement floatOption;
	
	@FindBy(xpath = "//option[text()='Int']")
	private WebElement intOption;
	
	@FindBy(xpath = "//option[text()='Time with TimeZone']")
	private WebElement timeWithTimeZoneOption;
	
	@FindBy(xpath = "//option[text()='Timestamp']")
	private WebElement timeStamp;
	
	@FindBy(xpath = "//option[text()='Varchar']")
	private WebElement varcharOption;
	
	@FindBy(id = "mandatory")
	private WebElement mandatoryCheckBox;
	
	@FindBy(id = "ActionMasterReferenceMainComponentModel")
	private WebElement addReferenceMasterButton;
	
	@FindBy(xpath = "//div[text()='Reference Attribute has been created successfully']")
	private WebElement referenceAttributeAddedSuccessfullyText;
	
//	MA009
//	Verify that the user is able to search their References Master
	
	
	@FindBy(id = "master_entity_name")
	private WebElement referenceMasterNameSearch;
	
	@FindBy(xpath = "//div[@class='align-self-center pr-2']")
	private WebElement searchIconReferenceMasterName;
	
	@FindBy(xpath = "//td[3]")
	private WebElement referenceMasterNameColumn;
	
//	MA010
//	Verify that the user is able to check the Funcationality of the Reset Button
	
	@FindBy(xpath = "//span[text()='Reset']")
	private WebElement resetButtonReferenceMaster;
	
	@FindBy(xpath = "//div[@class='pagination-init12']")
	private WebElement viewCountReferenceMaster;
	
	
//	MA011
//	Verify that the user is able to fetch only the Active Reference Master List 
	
	@FindBy(xpath = "//span[text()='Active']")
	private WebElement statusActiveField;
	
	@FindBy(xpath = "//input[@class='status']/..//span[text()='Active']")
	private WebElement activeCheckBox;
	
//	MA012
//	Verify that user is able to generate a reference master
	
	@FindBy(xpath = "//i[@class='fa fa-caret-right table-pagination-margin']")
	private WebElement scrollToNextPage;
	
//	FileUtlity fLib=new FileUtlity();
//	String refMasterName=fLib.getDataFromProperties(null, null);
	 
// create variables for both xpath's below	
	
	@FindBy(xpath= "//u[text()='Pending']/../../..//preceding-sibling::td//u[text()='Country Master']")
	private WebElement pendingReferenceMaster;	
	
	@FindBy(xpath = "//u[text()='Generate']/../../../..//preceding-sibling::td[text()='car']")
	private WebElement generate;
	
	@FindBy(xpath = "//div[text()='Success']")
	private WebElement successText;
	
	
	
//	MA015
//	Verify User is be able to get an error message when the user add the reference master without the reference master name
	
	@FindBy(xpath = "//div[text()='Reference master name can not be blank']")
	private WebElement referenceMasterErrorMsg;


	public WebElement getReferenceMasterButton() {
		return referenceMasterButton;
	}


	public WebElement getAddNewReferenceMaster() {
		return addNewReferenceMaster;
	}


	public WebElement getReferenceMasterEntityName() {
		return referenceMasterEntityName;
	}


	public WebElement getAttributeName() {
		return attributeName;
	}


	public WebElement getDisplayName() {
		return displayName;
	}


	public WebElement getLength() {
		return length;
	}


	public WebElement getType() {
		return type;
	}


	public WebElement getBooleanOption() {
		return booleanOption;
	}


	public WebElement getDateOption() {
		return dateOption;
	}


	public WebElement getFloatOption() {
		return floatOption;
	}


	public WebElement getIntOption() {
		return intOption;
	}


	public WebElement getTimeWithTimeZoneOption() {
		return timeWithTimeZoneOption;
	}


	public WebElement getTimeStamp() {
		return timeStamp;
	}


	public WebElement getVarcharOption() {
		return varcharOption;
	}


	public WebElement getMandatoryCheckBox() {
		return mandatoryCheckBox;
	}


	public WebElement getAddReferenceMasterButton() {
		return addReferenceMasterButton;
	}


	public WebElement getReferenceAttributeAddedSuccessfullyText() {
		return referenceAttributeAddedSuccessfullyText;
	}


	public WebElement getReferenceMasterNameSearch() {
		return referenceMasterNameSearch;
	}


	public WebElement getSearchIconReferenceMasterName() {
		return searchIconReferenceMasterName;
	}


	public WebElement getReferenceMasterNameColumn() {
		return referenceMasterNameColumn;
	}


	public WebElement getResetButtonReferenceMaster() {
		return resetButtonReferenceMaster;
	}


	public WebElement getViewCountReferenceMaster() {
		return viewCountReferenceMaster;
	}


	public WebElement getStatusActiveField() {
		return statusActiveField;
	}


	public WebElement getActiveCheckBox() {
		return activeCheckBox;
	}


	public WebElement getScrollToNextPage() {
		return scrollToNextPage;
	}


	public WebElement getPendingReferenceMaster() {
		return pendingReferenceMaster;
	}


	public WebElement getGenerate() {
		return generate;
	}


	public WebElement getSuccessText() {
		return successText;
	}


	public WebElement getReferenceMasterErrorMsg() {
		return referenceMasterErrorMsg;
	}
	
	
	
	
	
	
	
	
}
