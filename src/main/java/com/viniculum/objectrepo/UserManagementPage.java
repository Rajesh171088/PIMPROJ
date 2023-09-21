package com.viniculum.objectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  UserManagementPage {

	public UserManagementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	v
//	SA001
//	Verify user is able to create new user 
	
	@FindBy(xpath = "//*[text()='User Details']")
	private WebElement userDetailsText;
	
	@FindBy(xpath = "//*[text()='Create']")
	private WebElement createBtn;
	
//SA002
//	Verify number of active user under user details 
	
	
//	SA003
//	Verify number of inactive users from the user details 
	
	@FindBy(id = "user_name")
	private WebElement userNameField;
	
	@FindBy(id = "first_name")
	private WebElement firstNameField;
	
	@FindBy(id = "last_name")
	private WebElement lastNameField;
	
	@FindBy(id = "email")
	private WebElement emailField;
	
	@FindBy(xpath = "//*[text()='Select']")
	private WebElement selectDropdown;
	
	@FindBy(xpath = "//*[@value='true']")
	private WebElement activeCheckBox;

	@FindBy(xpath = "//*[@value=\"false\"]")
	private WebElement inactiveCheckBox;
	
	@FindBy(xpath = "(//*[@class='pagination-init12']//span)[4]")
	private WebElement countOfActiveUsers;
	
	@FindBy(xpath = "//*[text()='Reset']")
	private WebElement reset;
	
	// dynamic
	public void selectUserName(WebDriver driver,String userName)
	{
		userdriver.findElement(By.xpath("//*[text()='"+userName+"']"));
	}
	
	@FindBy(xpath = "//*[text()='Roles']")
	private WebElement rolesBtn;
	
	
	
	
	
	
	
	
}
