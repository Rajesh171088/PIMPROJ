package com.viniculum.objectrepo;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.viniculum.genericutility.JavaUtlity;
import com.viniculum.genericutility.WebActionUtility;

public class ProductGovernancePage {
	
	@FindBy(xpath="//span[text()='Create']")
	private WebElement createBtn;
	
	@FindBy(xpath="//span[@class='akc-simple-btn-text text-uppercase d-flex align-items-center justify-content-between']//span[contains(text(),'Demo Initiator')]")
	private WebElement demoInitiatorDropDown;
	
	@FindBy(xpath="//span[@class='dropdown-item button-dropdown-item d-flex align-items-center']//span[text()='Demo Reviewer']")
	private WebElement demoReviewerSelect;
	
	@FindBy(xpath="//span[@class='dropdown-item button-dropdown-item d-flex align-items-center']//span[text()='Demo Approver']")
	private WebElement demoApproverSelect;
	
	@FindBy(xpath="//span[@class='dropdown-item button-dropdown-item d-flex align-items-center']//span[text()='Demo Initiator']")
	private WebElement demoInitiatorSelect;
	
	@FindBy(xpath="//div[text()='Approved']")
	private WebElement approvedProductListBtn;
	
	@FindBy(xpath="//div[text()='Rejected']")
	private WebElement rejectedProductListBtn;
	
	@FindBy(xpath="//div[text()='Draft']")
	private WebElement draftProductListBtn;
	
	@FindBy(xpath="//div[text()='Sent For Approval']")
	private WebElement sentForApprovalListBtn;
	
	@FindBy(xpath="//div[text()='Ready To Publish']")
	private WebElement readyToPushListBtn;
	
	JavaUtlity jLib=new JavaUtlity();
	
	@FindBy(xpath="//div[text()='Approval Pending']")
	private WebElement approvalPending;
	
	
	
	public WebElement getApprovalPending() {
		return approvalPending;
	}

	@FindBy(xpath="//span[text()='Reject']")
	private WebElement rejectBtn;
	
	public WebElement getRejectBtn() {
		return rejectBtn;
	}

	@FindBy(xpath="//h5[text()='Create New Product']//following-sibling::button[@data-dismiss='modal']//span[text()='×']")
	private WebElement closeIcon;
	
	@FindBy(id="category_id")
	private WebElement categoryEdtTxt;
	
	@FindBy(xpath="//input[@id='normal']")
	private WebElement normalCheckBox;
	
	@FindBy(xpath="//input[@id='bom']")
	private WebElement bomCheckbox;
	
	@FindBy(xpath="//input[@id='variants']")
	private WebElement variantsCheckBox;
	
	@FindBy(xpath="//button[@id='FormikCreateNewProduct']")
	private WebElement addBtn;
	
	@FindBy(xpath="//*[text()='0 selected']")
	private WebElement variantSelectionDropDown;
	
	@FindBy(xpath="//textarea[@name='comment']")
	private WebElement textAreaField;
	
	@FindBy(xpath="//input[@id='category_id']//following::*[@xmlns='http://www.w3.org/2000/svg']")
	private WebElement categoryDropDown;
	
	@FindBy(xpath="//b[text()='Mobile and devices']")
	private WebElement mobAndDevicecategory;
	
	@FindBy(id="product_name")
	private WebElement productNameSrchField;
	
	@FindBy(xpath="//span[text()='Bulk Upload']")
	private WebElement bulkUploadBtn;
	
	@FindBy(xpath="//*[text()='Upload']")
	private WebElement uploadBtn;
	
	@FindBy(xpath="//span[text()='OPPO Pro max']")
	private WebElement variantTypeSelection;
	
	@FindBy(xpath="//b[text()='Products details']")
	private WebElement prodDetailsCategory;
	
	@FindBy(xpath="//span[text()='Indore plants']")
	private WebElement indorePlantType;
	
	@FindBy(xpath="//*[text()='Send']")
	private WebElement sendBtn;
	
	@FindBy(xpath="//span[text()='Upload File']")
	private WebElement uploadFilelnk;
	
	@FindBy(xpath="//*[text()='Yes']")
	private WebElement workflowYesBtn;
	
	@FindBy(xpath="//*[text()='no']")
	private WebElement workflowNoBtn;
	
	@FindBy(xpath="(//*[text()='Please select language for which you want to bulk upload the product']//following::*[text()='English'])[position()=1]")
	private WebElement englishLink;
	
	@FindBy(xpath="//*[text()='Select Category Template to Upload']/following::span[text()='Smart phonesDYhC']/preceding-sibling::input")
	private WebElement categoryTemplateToUpload;
	
	@FindBy(xpath="//span[text()='Continue']")
	private WebElement continueBtn;
	
	@FindBy(id="upload-image-input")
	private WebElement FileLink;
	
	@FindBy(xpath="//*[text()='Upload the File']//following::span[text()='Upload File']")
	private WebElement uploadFile;
	
	@FindBy(xpath="//div[text()='File Uploaded Successfully']")
	private WebElement fileUploadSuccessMsg;
	
	@FindBy(xpath="//*[text()='Please Enter Product Name And Code']")
	private WebElement errorMsg;
	
	//Initialization
	
	public WebElement getTextAreaField() {
		return textAreaField;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}

	public WebElement getVariantSelectionDropDown() {
		return variantSelectionDropDown;
	}

	public WebElement getCategoryDropDown() {
		return categoryDropDown;
	}

	public WebElement getMobAndDevicecategory() {
		return mobAndDevicecategory;
	}	
	
	public WebElement getUploadBtn() {
		return uploadBtn;
	}

	public WebElement getBulkUploadBtn() {
		return bulkUploadBtn;
	}

	public WebElement getProductNameSrchField() {
		return productNameSrchField;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}	

	public WebElement getFileUploadSuccessMsg() {
		return fileUploadSuccessMsg;
	}

	public WebElement getUploadFile() {
		return uploadFile;
	}

	public WebElement getFileLink() {
		return FileLink;
	}

	public WebElement getWorkflowNoBtn() {
		return workflowNoBtn;
	}

	public WebElement getWorkflowYesBtn() {
		return workflowYesBtn;
	}

	public WebElement getEnglishLink() {
		return englishLink;
	}

	public WebElement getSendBtn() {
		return sendBtn;
	}
	
	
	public WebElement getUploadFilelnk() {
		return uploadFilelnk;
	}

	public WebElement getIndorePlantType() {
		return indorePlantType;
	}

	public JavaUtlity getjLib() {
		return jLib;
	}

	public WebElement getProdDetailsCategory() {
		return prodDetailsCategory;
	}

	public WebElement getVariantTypeSelection() {
		return variantTypeSelection;
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public WebElement getCloseIcon() {
		return closeIcon;
	}

	public WebElement getCategoryEdtTxt() {
		return categoryEdtTxt;
	}

	public WebElement getNormalCheckBox() {
		return normalCheckBox;
	}

	public WebElement getBomCheckbox() {
		return bomCheckbox;
	}

	public WebElement getVariantsCheckBox() {
		return variantsCheckBox;
	}

	public ProductGovernancePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Updation
	public WebElement getCreateBtn() {
		return createBtn;
	}
	
	public WebElement getCategoryTemplateToUpload() {
		return categoryTemplateToUpload;
	}

	public WebElement getDemoInitiatorDropDown() {
		return demoInitiatorDropDown;
	}

	public WebElement getDemoReviewerSelect() {
		return demoReviewerSelect;
	}

	public WebElement getDemoApproverSelect() {
		return demoApproverSelect;
	}

	public WebElement getDemoInitiatorSelect() {
		return demoInitiatorSelect;
	}

	public WebElement getApprovedProductListBtn() {
		return approvedProductListBtn;
	}

	public WebElement getRejectedProductListBtn() {
		return rejectedProductListBtn;
	}

	public WebElement getDraftProductListBtn() {
		return draftProductListBtn;
	}

	public WebElement getSentForApprovalListBtn() {
		return sentForApprovalListBtn;
	}

	public WebElement getReadyToPushListBtn() {
		return readyToPushListBtn;
	}	
	
	public void createProdDetailsCategory(WebActionUtility wLib,WebElement element) throws Throwable
	{
		wLib.waitAndClick(getCategoryDropDown());
		wLib.waitAndClick(element);
		wLib.waitAndClick(getVariantsCheckBox());
		wLib.waitAndClick(getVariantSelectionDropDown());
		wLib.waitAndClick(getIndorePlantType());
		wLib.waitAndClick(getAddBtn());
	}
	
	public void selectcreateCategory(WebActionUtility wLib) throws Throwable
	{
		wLib.waitAndClick(getCategoryDropDown());
		wLib.waitAndClick(getMobAndDevicecategory());
		wLib.waitAndClick(getVariantsCheckBox());
		wLib.waitAndClick(getVariantSelectionDropDown());
		wLib.waitAndClick(getVariantTypeSelection());
		wLib.waitAndClick(getAddBtn());
	}
	
	public void clickOnEdit(WebDriver driver,String skuCode) throws Throwable
	{
		sentForApprovalListBtn.click();
		WebActionUtility wLib=new WebActionUtility();
		WebElement edit=driver.findElement(By.xpath("((//*[text()='"+skuCode+"'])[position()=1]//ancestor::tr//following-sibling::span[text()='Edit'])"));
		wLib.waitForElement(driver, edit);
		edit.click();
	}
	
	public void rejectProduct(WebActionUtility wLib, WebDriver driver, String skuCode) throws Throwable
	{
		wLib.waitAndClick(getDemoInitiatorDropDown());
		wLib.waitAndClick(getDemoReviewerSelect());
		wLib.waitAndClick(getApprovalPending());
		WebElement ele=driver.findElement(By.xpath("//div[text()='"+skuCode+"']"));
		wLib.waitAndClick(ele);
		wLib.waitAndClick(getRejectBtn());
		wLib.waitAndType(getTextAreaField(), "Rejected");
		wLib.waitAndClick(getSendBtn());		
	}
	
	public void verifyProduct(WebDriver driver,WebActionUtility wLib,String productName) throws Throwable
	{
		wLib.waitAndType(getProductNameSrchField(),productName );
		WebElement ele=driver.findElement(By.xpath("//div[text()='"+productName+"']"));
		String text=ele.getText();
		System.out.println(text);
		Assert.assertEquals(text, productName);
	}
	
	public void bulkUpload(WebActionUtility wLib) throws Throwable
	{
		wLib.waitAndClick(getBulkUploadBtn());
		wLib.waitAndClick(getUploadFilelnk());
		wLib.waitAndClick(getCategoryTemplateToUpload());
		wLib.waitAndClick(getUploadBtn());
		wLib.waitAndClick(getWorkflowNoBtn());
		wLib.waitAndClick(getEnglishLink());
		getContinueBtn().click();
		File f=new File("./src/test/resources/testdata/Smart_phonesDYhC.xlsx");
		String path = f.getAbsolutePath();
		getFileLink().sendKeys(path);
		wLib.waitAndClick(getUploadFile());
	}
}

