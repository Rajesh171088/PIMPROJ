package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductMasterPage {
	
	public ProductMasterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	v
//	Testcase_id=MA001
//	Verify that user is able to create the New Category 
	@FindBy(xpath = "//a[text()='Product Master']")
	private WebElement productMasterBtn;
	
	@FindBy(xpath = "//span[text()='Add Category']")
	private WebElement addCategory;
	
	@FindBy(xpath = "//u[text()='Create New Category']")
	private WebElement createNewCategory;
	
	@FindBy(xpath = "(//*[@id='category_name'])[2]")
	private WebElement categoryName;
	
	@FindBy(xpath = "//span[@class='slider round']")
	private WebElement activeStatus;
	
	@FindBy(xpath = "//a[@id='FormikActionCreateNewCategory']//span[text()='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//div[text()='Category Added Successfully']")
	private WebElement categoryAddedSuccessfully;

//	Testcase_id=MA002
//	Verify that user is able to Manage the Hierarchy
	
	
	@FindBy(xpath = "//span[text()='Manage Hierarchy']")
	private WebElement manageHierarchy;
	
	@FindBy(id="select-level-1")
	private WebElement level1;
	
	@FindBy(id="select-level-2")
	private WebElement level2;
	
	@FindBy(id="select-level-3")
	private WebElement level3;
	
	@FindBy(id="select-level-4")
	private WebElement level4;
	
	@FindBy(id="select-level-5")
	private WebElement level5;
	
	@FindBy(id="select-level-6")
	private WebElement level6;
	
	@FindBy(id="select-level-7")
	private WebElement level7;
	
	@FindBy(id="select-level-8")
	private WebElement level8;
	
	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement description;
	
	@FindBy(xpath = "(//span[text()='Save'])[3]")
	private WebElement saveDescriptionButton;
	
	@FindBy(xpath = "//div[text()='Updated Level Successfully']")
	private WebElement updatedLevelSuccessfully;
	
	
//	Testcase_id=MA003
//	Verify that user is able to add the sibling and add the levels 
	
	@FindBy(xpath = "//span[text()='LaptopBattery']/..//div[@class='d-flex dropdown-button px-2']")
	private WebElement mouseOnMoreOption;
	
	@FindBy(xpath = "//span[text()='Add Sibling']")
	private WebElement addSibling;
	
	@FindBy(id="category_name")
	private WebElement siblingCategoryName;
	
	@FindBy(id="FormikActionCreateNewProduct")
	private WebElement saveSiblingCategory;
	
	@FindBy(xpath = "//div[text()='Saved Sibling Successfully']")
	private WebElement savedSiblingSuccessfully;
	
	@FindBy(xpath = "//span[text()='Add Level']")
	private WebElement addLevel;
	
	@FindBy(id="category_name")
	private WebElement categoryNameLevel;
	
	@FindBy(id="FormikActionCreateNewProduct")
	private WebElement saveAddLevelButton;
	
	@FindBy(xpath ="//div[text()='Added Level Successfully']")
	private WebElement addedLevelSuccessfully;

	public WebElement getProductMasterBtn() {
		return productMasterBtn;
	}

	public WebElement getAddCategory() {
		return addCategory;
	}

	public WebElement getCreateNewCategory() {
		return createNewCategory;
	}

	public WebElement getCategoryName() {
		return categoryName;
	}

	public WebElement getActiveStatus() {
		return activeStatus;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCategoryAddedSuccessfully() {
		return categoryAddedSuccessfully;
	}

	public WebElement getManageHierarchy() {
		return manageHierarchy;
	}

	public WebElement getLevel1() {
		return level1;
	}

	public WebElement getLevel2() {
		return level2;
	}

	public WebElement getLevel3() {
		return level3;
	}

	public WebElement getLevel4() {
		return level4;
	}

	public WebElement getLevel5() {
		return level5;
	}

	public WebElement getLevel6() {
		return level6;
	}

	public WebElement getLevel7() {
		return level7;
	}

	public WebElement getLevel8() {
		return level8;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getSaveDescriptionButton() {
		return saveDescriptionButton;
	}

	public WebElement getUpdatedLevelSuccessfully() {
		return updatedLevelSuccessfully;
	}

	public WebElement getMouseOnMoreOption() {
		return mouseOnMoreOption;
	}

	public WebElement getAddSibling() {
		return addSibling;
	}

	public WebElement getSiblingCategoryName() {
		return siblingCategoryName;
	}

	public WebElement getSaveSiblingCategory() {
		return saveSiblingCategory;
	}

	public WebElement getSavedSiblingSuccessfully() {
		return savedSiblingSuccessfully;
	}

	public WebElement getAddLevel() {
		return addLevel;
	}

	public WebElement getCategoryNameLevel() {
		return categoryNameLevel;
	}

	public WebElement getSaveAddLevelButton() {
		return saveAddLevelButton;
	}

	public WebElement getAddedLevelSuccessfully() {
		return addedLevelSuccessfully;
	}
	
	
	
	
	
}
