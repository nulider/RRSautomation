package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class LandingPage extends ProjectMethods{
	
	public LandingPage() {		
		PageFactory.initElements(driver,this);
	
}
	
	
	
	@FindBy(how=How.XPATH,using="//*[@href='/mycourse']")
	private WebElement mycoursebutton;
	
	
	public LandingPage verifyMyCourse() 
	{
		
		highLighterMethod(driver, mycoursebutton);
		click(mycoursebutton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@href='/buycourse']")
	private WebElement myfeebutton;
	
	
	public LandingPage verifyBuyCourse() 
	{
		
		highLighterMethod(driver, myfeebutton);
		click(myfeebutton);
		return this;
	}
	

	@FindBy(how=How.XPATH,using="//*[@href='/profile']")
	private WebElement myprofilebutton;
	
	
	public LandingPage verifymyProfile() 
	{
		
		highLighterMethod(driver, myprofilebutton);
		click(myprofilebutton);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[@href='/settings']")
	private WebElement settingsbutton;
	
	
	public LandingPage verifysettings() 
	{
		
		highLighterMethod(driver, settingsbutton);
		click(settingsbutton);
		return this;
	}
	
	public Test clickCourse() 
	{
		
		highLighterMethod(driver, mycoursebutton);
		click(mycoursebutton);
		return new Test();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
