package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.viniculum.genericutility.WebActionUtility;

public class HomePage {
	@FindBy(xpath="//div[@class='align-self-center']/*[ @data-toggle='dropdown']")
	private WebElement signoutDropdown;
	
	@FindBy(xpath="//a[@class='dropdown-item secondary-font' and contains(text(),'Logout')]")
	private WebElement logoutLink;
	
	@FindBy(xpath="//*[text()='Dashboard']")
	private WebElement dashBoardBtn;
	
	@FindBy(xpath="//*[text()='Master']")
	private WebElement masterBtn;
	
	@FindBy(xpath="//a[normalize-space()='Product Master']")
	private WebElement productMasterLnk;
	
	@FindBy(xpath="//*[text()='Reference Master']")
	private WebElement referenceMasterLnk;
	
	@FindBy(xpath="//*[text()='Product']")
	private WebElement productBtn;
	
	@FindBy(xpath="//*[text()='Governance']")
	private WebElement governaceLink;
	
	@FindBy(xpath="//*[text()='Product List']")
	private WebElement productListLink;
	
	@FindBy(xpath="//*[text()='Image Repository']")
	private WebElement imgRepoLink;
	
	@FindBy(xpath="//*[text()='SKU Management']")
	private WebElement skuMgmtLink;
	
	@FindBy(xpath="//*[text()='Attribute']")
	private WebElement attributeBtn;
	
	@FindBy(xpath="//*[text()='Product Attribute']")
	private WebElement prodAttributeLink;
	
	@FindBy(xpath="//*[text()='Reference Attribute']")
	private WebElement refAttributeLink;
	
	@FindBy(xpath="//*[text()='Category Master And Mapping']")
	private WebElement categoryMasterLink;
	
	@FindBy(xpath="//*[text()='Workflow']")
	private WebElement workflowBtn;
	
	@FindBy(xpath="//*[text()='Copyright © 2025 Vinculum Solutions Pvt. Ltd. All Rights Reserved. |']")
	private WebElement vinculumLogo;
	
	@FindBy(xpath="//*[text()='Business Rule']")
	private WebElement businessRuleBtn;
	
	
	public WebElement getBusinessRuleBtn() {
		return businessRuleBtn;
	}

	public WebElement getVinculumLogo() {
		return vinculumLogo;
	}

	public WebElement getSignoutDropdown() {
		return signoutDropdown;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getDashBoardBtn() {
		return dashBoardBtn;
	}

	public WebElement getMasterBtn() {
		return masterBtn;
	}

	public WebElement getProductMasterLnk() {
		return productMasterLnk;
	}

	public WebElement getReferenceMasterLnk() {
		return referenceMasterLnk;
	}

	public WebElement getProductBtn() {
		return productBtn;
	}

	public WebElement getGovernaceLink() {
		return governaceLink;
	}

	public WebElement getProductListLink() {
		return productListLink;
	}

	public WebElement getImgRepoLink() {
		return imgRepoLink;
	}

	public WebElement getSkuMgmtLink() {
		return skuMgmtLink;
	}

	public WebElement getAttributeBtn() {
		return attributeBtn;
	}

	public WebElement getProdAttributeLink() {
		return prodAttributeLink;
	}

	public WebElement getRefAttributeLink() {
		return refAttributeLink;
	}

	public WebElement getCategoryMasterLink() {
		return categoryMasterLink;
	}

	public WebElement getWorkflowBtn() {
		return workflowBtn;
	}
	
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void signOut(WebActionUtility wLib,WebDriver driver) throws Throwable
	{
		wLib.mouseOverOnElement(driver, signoutDropdown);
		wLib.waitAndClick(getSignoutDropdown());
		wLib.waitAndClick(getLogoutLink());		
	}
	
	public boolean verifyLogo()
	{
		if(getVinculumLogo().isDisplayed())
			return true;
		else
			return false;
	}
	
	public void governanceClick(WebActionUtility wLib) throws Throwable
	{
		wLib.waitAndClick(getProductBtn());
		wLib.waitAndClick(getGovernaceLink());
	}
	
	public void clickOnProductAttribute(WebActionUtility wLib) throws Throwable
	{
		wLib.waitAndClick(getAttributeBtn());
		wLib.waitAndClick(getProdAttributeLink());
	}
	
	public void clickOnReferenceAttribute(WebActionUtility wLib) throws Throwable
	{
		wLib.waitAndClick(getAttributeBtn());
		wLib.waitAndClick(getRefAttributeLink());
	}

}
