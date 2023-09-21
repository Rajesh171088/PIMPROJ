package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddDataReferenceMasterPage {

	public AddDataReferenceMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//v
// 		MA013
//		Verify User is able to add data to the created Reference Master
		
		@FindBy(xpath = "(//span[text()='Add New'])[2]")
		private WebElement addNewButton;
		
		@FindBy(xpath = "//h5[text()='Add Data']")
		private WebElement addDataText;
		
		@FindBy(xpath = "(//div[@class='d-flex justify-content-between'])[2]")
		private WebElement addDataField;
		
		@FindBy(xpath = "//div[text()='Success']")
		private WebElement successAddDataText;
		
		@FindBy(xpath = "//span[text()='Add']")
		private WebElement addDataButton;

		public WebElement getAddNewButton() {
			return addNewButton;
		}

		public WebElement getAddDataText() {
			return addDataText;
		}

		public WebElement getAddDataField() {
			return addDataField;
		}

		public WebElement getSuccessAddDataText() {
			return successAddDataText;
		}

		public WebElement getAddDataButton() {
			return addDataButton;
		}
		
		
		
}
