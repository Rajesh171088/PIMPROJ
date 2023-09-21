package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class systemAdminRolesPage {

	public systemAdminRolesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	SA005
//	Verify user is assigned with role
	
//	SA006
//	Verify user is able to Assign respective  roles to the respective Users
	
	@FindBy(xpath = "(//*[text()='Assign Role'])[2]")
	private WebElement assignRoleBtn;
	
	@FindBy(xpath = "//*[text()='Assign Role']")
	private WebElement assignRole2ndBtn;
	
	@FindBy(id = "role_name")
	private WebElement roleNameSearch;
	
	@FindBy(xpath = "(//*[@type='checkbox'])[7]")
	private WebElement checkBox;
	
	@FindBy(xpath = "//*[text()='Assign']")
	private WebElement assignBtn;
	
	@FindBy(xpath = "//*[text()='Role Assigned successfully']")
	private WebElement roleAssignedSuccessfullyTxt;
	
//	SA006
//	Verify user is able to Assign respective  roles to the respective Users
	
	
	
	
}
