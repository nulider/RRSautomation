package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class HomePage extends ProjectMethods{
	
	public HomePage() {		
		PageFactory.initElements(driver,this);
	
}
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'txtLoginId')]")
	private WebElement emailfield;
	
	
	public HomePage enterEmail(String email) 
	{
		
		highLighterMethod(driver, emailfield);
		type(emailfield,email);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'loginvalidation_button')]")
	private WebElement nextButton;
	
	public HomePage clickNext() 
	{
		
		click(nextButton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@name,'txtPin')]")
	private WebElement passwordfield;
	
	
	public HomePage enterPassword(String password) 
	{
		
		highLighterMethod(driver, passwordfield);
		type(passwordfield,password);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(text(),'SIGN IN')]")
	private WebElement submitButton;
	
	public HomePage clickSubmit() 
	{
		
		click(submitButton);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'header-responsive')]")
	private WebElement username;
	
	public LandingPage verifyUsername() 
	{
		
		verifyDisplayed(username);
		highLighterMethod(driver, username);
		return new LandingPage();
	}
	

}
