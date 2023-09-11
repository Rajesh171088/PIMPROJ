package com.viniculum.businessrole;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.viniculum.genericutility.BaseClass;
import com.viniculum.objectrepo.HomePage;

public class BusinessRoleTest extends BaseClass{
	
	@Test
	public void VerifyBusinessRoleCreationTest()
	{
		HomePage hm=new HomePage(driver);
		Assert.assertEquals(hm.verifyLogo(), true);
		hm.getBusinessRuleBtn().click();
	}

}
