package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createNewUserSystemAdminPage {


	public createNewUserSystemAdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	v
//	SA001
//	Verify user is able to create new user 

	
	@FindBy(id = "user_name")
	private WebElement userNameField;
	
	@FindBy(id = "first_name")
	private WebElement firstNameField;
	
	@FindBy(id = "last_name")
	private WebElement lastNameField;
	
	@FindBy(id = "email")
	private WebElement emailField;
	
	@FindBy(xpath = "//*[text()='Save']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//*[text()='User has been created successfully']")
	private WebElement userCreatedMessage;
	
}
