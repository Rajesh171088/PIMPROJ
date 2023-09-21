package com.viniculum;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.viniculum.genericutility.BaseClass;
import com.viniculum.objectrepo.AddNewAttributePage;
import com.viniculum.objectrepo.AddNewReferenceAttributePage;
import com.viniculum.objectrepo.HomePage;
import com.viniculum.objectrepo.ProductAttributePage;
import com.viniculum.objectrepo.ProductEditPage;
import com.viniculum.objectrepo.ReferenceAttributePage;

public class AttributeTest extends BaseClass {
	@Test(groups = {"Smoke Test","Regression Test"})
	public void verifyUserIsAbleToCreateProductAttributeTest() throws Throwable
	{
		HomePage hm=new HomePage(driver);
		hm.clickOnProductAttribute(wLib);
		ProductAttributePage proAttrPage=new ProductAttributePage(driver);
		proAttrPage.clickOnAddNewAttribute(wLib);
		AddNewAttributePage addAttrPage=new AddNewAttributePage(driver);
		String subCategory=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Sub Category");
		String groupName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Group name");
		String attrName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Attribute Name")+jLib.getRandomNumber();
		String displayName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Display Name");
		String attrLength=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Attribute length");
		String fieldType=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Field Type");
		String dataType=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Data Type");
		addAttrPage.createNewAttribute(wLib, subCategory, groupName, attrName, displayName, attrLength, fieldType, dataType);
		String exptMsg="Attribute Group has been updated successfully";
		wLib.waitForElement(driver,proAttrPage.getAttrGrpCrtSuccessMsg());
		String actMsg=proAttrPage.getAttrGrpCrtSuccessMsg().getText();
		Assert.assertEquals(actMsg, exptMsg);
		Reporter.log("Attribute Group has been updated successfully message is displayed",true);
	}
	
	@Test(groups = {"Regression Test"})
	public void verifyUserIsAbleToEditCreatedProductAttributeTest() throws Throwable
	{
		HomePage hm=new HomePage(driver);
		hm.clickOnProductAttribute(wLib);
		ProductAttributePage proAttrPage=new ProductAttributePage(driver);
		proAttrPage.clickOnAddNewAttribute(wLib);
		AddNewAttributePage addAttrPage=new AddNewAttributePage(driver);
		String subCategory=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Sub Category");
		String groupName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Group name");
		String attrName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Attribute Name")+jLib.getRandomNumber();
		String displayName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Display Name");
		String attrLength=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Attribute length");
		String fieldType=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Field Type");
		String dataType=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Data Type");
		addAttrPage.createNewAttribute(wLib, subCategory, groupName, attrName, displayName, attrLength, fieldType, dataType);
		String exptMsg="Attribute Group has been updated successfully";
		wLib.waitForElement(driver,proAttrPage.getAttrGrpCrtSuccessMsg());
		String actMsg=proAttrPage.getAttrGrpCrtSuccessMsg().getText();
		Assert.assertEquals(actMsg, exptMsg);
		Reporter.log("Attribute Group has been updated successfully message is displayed",true);
		proAttrPage.clickOnAttributeName(driver, wLib, attrName);
		ProductEditPage proEdit=new ProductEditPage(driver);
		proEdit.editDisplayName(wLib, "123");
		//save button not working 
	}
	
	@Test(groups = {"Regression Test"})
	public void VerifyThatUserIsAbleToAddMoreAttributeTest() throws Throwable
	{
		HomePage hm=new HomePage(driver);
		hm.clickOnProductAttribute(wLib);
		ProductAttributePage proAttrPage=new ProductAttributePage(driver);
		proAttrPage.clickOnAddNewAttribute(wLib);
		AddNewAttributePage addAttrPage=new AddNewAttributePage(driver);
		String subCategory=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Sub Category");
		String groupName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Group name");
		String attrName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Attribute Name")+jLib.getRandomNumber();
		String displayName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Display Name");
		String attrLength=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Attribute length");
		String fieldType=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Field Type");
		String dataType=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Data Type");
		addAttrPage.createExtraAttribute(wLib, subCategory, groupName, attrName, displayName, attrLength, fieldType, dataType);
		String ExpData="Add Attribute - 2";
		String actData=addAttrPage.getAddAttributeheader().getText();
		Assert.assertEquals(actData, ExpData);
		Reporter.log("Add Attribute - 2 is displayed",true);
		addAttrPage.getCloseBtn().click();
	}
	
	@Test(groups = {"Regression Test"})
	public void VerifyTheErrorMessageTest() throws Throwable
	{
		HomePage hm=new HomePage(driver);
		hm.clickOnProductAttribute(wLib);
		ProductAttributePage proAttrPage=new ProductAttributePage(driver);
		proAttrPage.clickOnAddNewAttribute(wLib);
		AddNewAttributePage addAttrPage=new AddNewAttributePage(driver);
		String subCategory=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Sub Category");
		String groupName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Group name");
		String attrName="";
		String displayName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Display Name");
		String attrLength=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Attribute length");
		String fieldType=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Field Type");
		String dataType=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT001", "Data Type");
		addAttrPage.createNewAttribute(wLib, subCategory, groupName, attrName, displayName, attrLength, fieldType, dataType);
		String exptMsg="Attribute name can not be blank";
		wLib.waitForElement(driver, addAttrPage.getAttrNameErrorMsg());
		String actMsg=addAttrPage.getAttrNameErrorMsg().getText();
		Assert.assertEquals(actMsg, exptMsg);
		Reporter.log(exptMsg+" is displayed",true);
		addAttrPage.getCloseBtn().click();
	}
	
	@Test(groups= {"Regression Test"})
	public void verifyuserIsAbleToCreateReferenceAttributeTest() throws Throwable
	{
		HomePage hm=new HomePage(driver);
		hm.clickOnReferenceAttribute(wLib);
		ReferenceAttributePage refAttrpage=new ReferenceAttributePage(driver);
		refAttrpage.clickOnAddNewAttrBtn(wLib);
		AddNewReferenceAttributePage addRefPage=new AddNewReferenceAttributePage(driver);
		String refMaster=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT005", "Reference Master Name");
		String attributeName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT005", "Attribute Name")+jLib.getRandomNumber();
		String displayName=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT005", "Display Name");
		String attributeLength=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT005", "Attribute length");;
		String attributeType=eLib.getDataFromExcelBasedTestId("./src/test/resources/testdata/Vinculum.xlsx", "Vinculum", "AT005", "Field Type");; 
		addRefPage.createNewRefAttribute(driver, wLib, refMaster, attributeName, displayName, attributeLength, attributeType);
		String exptMsg="Reference Attribute has been created successfully";
		wLib.waitForElement(driver, refAttrpage.getRefAttributeCrtMsg());
		String actMsg=refAttrpage.getRefAttributeCrtMsg().getText();
		Assert.assertEquals(actMsg, exptMsg);
		Reporter.log(exptMsg+" is displayed",true);
	}

}
