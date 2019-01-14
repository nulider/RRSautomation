package testcases;

import java.awt.AWTException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_kidsSearch extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Search in kids's section";
		testDescription="Verify the search in kids section";
		testNodes="test";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="kidssearch";
	}
	@Test(dataProvider="fetchData")
	public void seachinkids(String xpath,String brandname,String model,String invalid) throws AWTException {
		
		new HomePage_RRS()
		.clickkidslink()
		.entersearchkeykids(xpath,brandname)
		.entersearchkeykids(xpath,model)
		.entersearchkeykids(xpath,invalid);
	
	}



}
