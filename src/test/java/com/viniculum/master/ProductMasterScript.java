package com.viniculum.master;

import org.testng.annotations.Test;

import com.viniculum.genericutility.BaseClass;
import com.viniculum.genericutility.ExcelUtlity;
import com.viniculum.genericutility.JavaUtlity;
import com.viniculum.genericutility.WebActionUtility;
import com.viniculum.objectrepo.HomePage;
import com.viniculum.objectrepo.ProductMasterPage;

public class ProductMasterScript extends BaseClass{

	
	
	Verify that user is able to create the New Category 
	
	//MA001
	@Test
	public void verifyToCreateNewCategory() throws InterruptedException
	{
		HomePage homepage=new HomePage(driver);
		ProductMasterPage productMaster=new ProductMasterPage(driver);	
		homepage.getVinculumLogo();
		homepage.getMasterBtn().click();
		productMaster.getProductMasterBtn().click();
		productMaster.getAddCategory().click();
		productMaster.getCreateNewCategory().click();
		productMaster.getCategoryName().clear();
//		String CategoryName = excelUtility.getDataFromExcel("./src/test/resource/TestData.xlsx" ,"Master","MA001","Category Name");
//		System.out.println(CategoryName);
		productMaster.getCategoryName().sendKeys("Locker8");
		productMaster.getActiveStatus().isEnabled();
		productMaster.getSaveButton().click();
		productMaster.getCategoryAddedSuccessfully();
	}
	
	
//	MA002
	@Test
	public void verifyUserIsAbleToManageHierarchy()
	{
		HomePage homepage=new HomePage(driver);
		ProductMasterPage productMaster=new ProductMasterPage(driver);	
		homepage.getVinculumLogo();
		homepage.getMasterBtn().click();
		productMaster.getProductMasterBtn().click();
		productMaster.getManageHierarchy().click();
		productMaster.getLevel3().click();
		productMaster.getDescription().sendKeys("Test");
		productMaster.getSaveDescriptionButton().click();
		productMaster.getUpdatedLevelSuccessfully();
	}
	
//	MA003
	@Test
	public void 
}
