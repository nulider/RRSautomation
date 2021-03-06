package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage_RRS;
import wdMethods.ProjectMethods;

public class Sheet2_Order_LoginFlow extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Orders";
		testDescription="Verify the orders flow after login";
		testNodes="PDP";
		category="Regression";
		authors="arjun";
		browserName="chrome";
		dataSheetName="TC030";
		
		
	}
	
	@Test(dataProvider="fetchData")
	public void orderswithLogin(String email, String password, String brandname,String code)  {
		
		
			new HomePage_RRS()
			.clickaccount()
			.enteremail(email)
			.clickNext()
			.enterpassword(password)
			.login()
			.accountcreation()
			.entersearch(brandname)
			.clickproductlinksecondtime()
			.choosecolorforsecondproduct()
			.choosesize()
			.addtocart()
			.viewCart()
			.emailsection()
			.shippingsection()
			.billingsection()
			.entercouponcode(code)
			.placeorderButtonclick()
			.orderConfirmationmessage();
			
			
			
			
			
			
			
	}

	}


