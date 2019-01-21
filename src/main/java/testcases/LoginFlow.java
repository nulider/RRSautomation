package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import wdMethods.ProjectMethods;

public class LoginFlow extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Login flow for Step application";
		testDescription="Verify if the user is able to login to application";
		testNodes="Login case";
		category="Regression";
		authors="arjun";
		browserName="chrome";
		dataSheetName="Login";

		
	}
	
	@Test(dataProvider="fetchData")
	public void login(String email,String password)  {
		
		
			new HomePage()
			.enterEmail(email)
			.clickNext()
			.enterPassword(password)
			.clickSubmit()
			.verifyUsername();
			
	}

}
