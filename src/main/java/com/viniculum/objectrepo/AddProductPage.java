package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.viniculum.genericutility.WebActionUtility;

public class AddProductPage {
	
	@FindBy(xpath="//*[contains(@class,'card p-2 simple-btn-border mb-0 fill my-2')]")
	private WebElement sendForApprovalBtn;
	
	@FindBy(id="product_name")
	private WebElement prodnameEdtTxt;
	
	@FindBy(id="code")
	private WebElement codeEdtTxt;
	
	@FindBy(id="mrp")
	private WebElement mrpEdtTxt;
	
	@FindBy(xpath="//*[text()='Successfully Sent For Approval']")
	private WebElement successMsg;
	
	@FindBy(xpath="//*[text()='Save as Draft']")
	private WebElement saveAsDraftBtn;
	
	public WebElement getSaveAsDraftBtn() {
		return saveAsDraftBtn;
	}

	public AddProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSendForApprovalBtn() {
		return sendForApprovalBtn;
	}

	public WebElement getProdnameEdtTxt() {
		return prodnameEdtTxt;
	}

	public WebElement getCodeEdtTxt() {
		return codeEdtTxt;
	}

	public WebElement getMrpEdtTxt() {
		return mrpEdtTxt;
	}

	public WebElement getSuccessMsg() throws InterruptedException {
		//Thread.sleep(2000);
		return successMsg;		
	}
	
	public void addProduct(WebDriver driver, WebActionUtility wLib,String prodName,String code,String mrp) throws Throwable
	{
		wLib.waitAndType(getProdnameEdtTxt(), prodName);		
		wLib.waitAndType(getCodeEdtTxt(), code);		
		wLib.waitAndType(getMrpEdtTxt(), mrp);	
		wLib.waitForElement(driver, getSendForApprovalBtn());
		wLib.waitAndClick(getSendForApprovalBtn());
	}
	
	public void editProductName()
	{
		prodnameEdtTxt.clear();
		prodnameEdtTxt.sendKeys("Oppo ProMax");
		sendForApprovalBtn.click();		
	}
	public void addToDraft(WebActionUtility wLib,String prodName,String code,String mrp) throws Throwable
	{
		wLib.waitAndType(getProdnameEdtTxt(), prodName);		
		wLib.waitAndType(getCodeEdtTxt(), code);		
		wLib.waitAndType(getMrpEdtTxt(), mrp);	
		wLib.waitAndClick(getSaveAsDraftBtn());
	}
	
}
