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
	
	@FindBy(xpath="//span[@class='akc-menu-text bold-text']")
	private WebElement dashBoardBtn;
	
	@FindBy(xpath="//span[@class='akc-menu-text bold-text']")
	private WebElement masterBtn;
	
	@FindBy(xpath="//a[normalize-space()='Product Master']")
	private WebElement productMasterLnk;
	
	@FindBy(xpath="//a[text()='Reference Master']")
	private WebElement referenceMasterLnk;
	
	@FindBy(xpath="//span[text()='Product']")
	private WebElement productBtn;
	
	@FindBy(xpath="//a[text()='Governance']")
	private WebElement governaceLink;
	
	@FindBy(xpath="//a[text()='Product List']")
	private WebElement productListLink;
	
	@FindBy(xpath="//a[text()='Image Repository']")
	private WebElement imgRepoLink;
	
	@FindBy(xpath="//a[text()='SKU Management']")
	private WebElement skuMgmtLink;
	
	@FindBy(xpath="//span[text()='Attribute']")
	private WebElement attributeBtn;
	
	@FindBy(xpath="//a[text()='Product Attribute']")
	private WebElement prodAttributeLink;
	
	@FindBy(xpath="//a[text()='Reference Attribute']")
	private WebElement refAttributeLink;
	
	@FindBy(xpath="//a[text()='Category Master And Mapping']")
	private WebElement categoryMasterLink;
	
	@FindBy(xpath="//span[text()='Workflow']")
	private WebElement workflowBtn;
	
	@FindBy(xpath="//span[@class='small-text']")
	private WebElement vinculumLogo;
	
	@FindBy(xpath="//span[text()='Business Rule']")
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
	
	public void signOut()
	{
		getSignoutDropdown().click();
		getLogoutLink().click();		
	}
	
	public boolean verifyLogo()
	{
		if(getVinculumLogo().isDisplayed())
			return true;
		else
			return false;
	}

}
