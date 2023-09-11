package com.viniculum.businessrole;

import org.testng.annotations.Test;

import com.viniculum.genericutility.FileUtlity;

public class Sample {
	
	@Test
	public void trialTest() throws Throwable
	{
		FileUtlity flib=new FileUtlity();
		flib.getFilePathFromPropertiesFile("./config/commonfilepath.properties");
		
	}

}
