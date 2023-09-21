package com.viniculum.objectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class RoleManagementPage {
	public RoleManagementPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	
}
