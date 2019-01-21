package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import wdMethods.ProjectMethods;

public class NavigatethroughTabs extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Navigation across tabs in Step application";
		testDescription="Verify if the user is able through the tabs in application";
		testNodes="Navigation case";
		category="Regression";
		authors="arjun";
		browserName="chrome";
		dataSheetName="Login";

		
	}
	
	@Test(dataProvider="fetchData")
	public void navigatethruTabs(String email,String password)  {
		
		
			new HomePage()
			.enterEmail(email)
			.clickNext()
			.enterPassword(password)
			.clickSubmit()
			.verifyUsername()
			.verifyMyCourse()
			.verifyBuyCourse()
			.verifymyProfile()
			.verifysettings();
			
	}

}



