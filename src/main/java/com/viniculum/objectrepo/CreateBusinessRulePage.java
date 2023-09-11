package com.viniculum.objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.viniculum.genericutility.WebActionUtility;

public class CreateBusinessRulePage {
	
	@FindBy(xpath="//u[text()='Cancel']")
	private WebElement cancelLnk;
	
	@FindBy(xpath="//span[text()='Reset']")
	private WebElement resetBtn;
	
	@FindBy(xpath="//button[@id='ActionBusinessRuleDetailComponentModel']")
	private WebElement saveBtn;
	
	@FindBy(id="ruleName")
	private WebElement ruleNameEdtTxt;
	
	@FindBy(id="ruleDescription")
	private WebElement ruledescriptionEdtTxt;
	
	@FindBy(id="ruleOperationType")
	private WebElement ruleOperationTypeDropDown;
	
	@FindBy(xpath="//input[@value='product']")
	private WebElement productMasterRadioBtn;
	
	@FindBy(xpath="//input[@value='reference']")
	private WebElement referenceMasterRadioBtn;
	
	@FindBy(id="category_name")
	private WebElement categoryNamedropDown;
	
	@FindBy(id="attributeGroupId")
	private WebElement attributeGroupdropDown;
	
	@FindBy(xpath="//span[text()='Condition']/..//following-sibling::div")
	private WebElement addCondDropDown;
	
	@FindBy(id="attr")
	private WebElement attributeDropDown;
	
	@FindBy(xpath="//div[@class='card simple-btn-border mb-0 business-rules mr-3 p-2']")
	private WebElement operatorDropDown;
	
	@FindBy(id="value")
	private WebElement valueEdtTxt;
	
	

	public WebElement getCancelLnk() {
		return cancelLnk;
	}

	public WebElement getResetBtn() {
		return resetBtn;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getRuleNameEdtTxt() {
		return ruleNameEdtTxt;
	}

	public WebElement getRuledescriptionEdtTxt() {
		return ruledescriptionEdtTxt;
	}

	public WebElement getRuleOperationTypeDropDown() {
		return ruleOperationTypeDropDown;
	}

	public WebElement getProductMasterRadioBtn() {
		return productMasterRadioBtn;
	}

	public WebElement getReferenceMasterRadioBtn() {
		return referenceMasterRadioBtn;
	}

	public WebElement getCategoryNamedropDown() {
		return categoryNamedropDown;
	}

	public WebElement getAttributeGroupdropDown() {
		return attributeGroupdropDown;
	}

	public WebElement getAddCondDropDown() {
		return addCondDropDown;
	}

	public WebElement getAttributeDropDown() {
		return attributeDropDown;
	}

	public WebElement getOperatorDropDown() {
		return operatorDropDown;
	}

	public WebElement getValueEdtTxt() {
		return valueEdtTxt;
	}
	
	public CreateBusinessRulePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void createBusinessRule(WebDriver driver, WebActionUtility wLib,String ruleName,String ruleDescription,String operationType,String mastertype, String categoryName)
	{
		getRuledescriptionEdtTxt().sendKeys(ruleName);
		getRuledescriptionEdtTxt().sendKeys(ruleDescription);
		wLib.select(getRuleOperationTypeDropDown(),operationType );
		if(mastertype.equalsIgnoreCase("Product"))
			getProductMasterRadioBtn().click();
		else
			getReferenceMasterRadioBtn().click();
		//getCategoryNamedropDown().sendKeys(categoryName);
		driver.findElement(By.xpath("//b[text()='"+categoryName+"']\"")).click();
			
	}
}
