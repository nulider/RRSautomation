package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_Stores extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Stores section";
		testDescription="Verify the stores section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="Stores";
	}
	@Test(dataProvider="fetchData")
	public void Stores(String code)  {
		
		new HomePage_RRS()
		.storelink()
		.enterzip(code)
		.clickastore();
	}
	

}
