package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class VIPfamily extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="VIP pass is added to cart";
		testDescription="Verify if the user can vip pass to cart";
		testNodes="PDP";
		category="Smoke";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC025";

		
	}
	
	@Test
	public void vipfamilymember()  {
		
		
			new HomePage_RRS()
			.vipfamily()
			.clickjoin()
			.viewCartforvip()
			.verifycarttitle();
			

}
}