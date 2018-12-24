package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class UserCreatedConfirmation extends ProjectMethods{
	
	public UserCreatedConfirmation() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.XPATH,using="//div[@class='myAccount-membership-wrapper']")
	private WebElement createdsuccessfully;
	
	public UserCreatedConfirmation accountcreation()
	{
		verifyDisplayed(createdsuccessfully);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//li[@class='myacount-dropdown']")
	private WebElement myaccountmousehover;
	
	public UserCreatedConfirmation mousehover()
	{
		mouseHover(myaccountmousehover);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//ul[@class='dropdown-sub']/li[2]/a")
	private WebElement logoutlink;
	
	public HomePage_RRS logout()
	{
		click(logoutlink);
		return new HomePage_RRS();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@src,'/rrs/img/home/ver2/Road_Runner_Logo.svg')]")
	private WebElement logo;
	
	public UserCreatedConfirmation clickLogo()
	{
		click(logo);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='recent-titles']")
	private WebElement recent;
	
	public UserCreatedConfirmation recentprod()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(recent);
		highLighterMethod(driver, recent);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='welcome-title']")
	private WebElement welcome;
	
	public UserCreatedConfirmation welcometext()
	{
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verifyDisplayed(welcome);
		highLighterMethod(driver, welcome);
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='order-slots-copy-container']")
	private WebElement previous;
	
	public UserCreatedConfirmation previousorder()
	{
		verifyDisplayed(previous);
	
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@class='brand-default-btn']")
	private WebElement next;
	
	public UserCreatedConfirmation nextorder()
	{
		highLighterMethod(driver, next);
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	mouseHover(next);
click(next);
	return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/accessories/?cm_sp=nav-_-accessories-_-accessories']")
	private WebElement access;
	@FindBy(how=How.XPATH,using="//*[@href='/rrs/accessories/insoles/?cm_sp=nav-_-gear-_-insoles']")
	private WebElement insole;
	
	public UserCreatedConfirmation accessories()
	{
		
	mouseHover(access);
mouseHover(insole);
click(insole);
	return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='16246_img']")
	private WebElement insolechoose;
	
	public UserCreatedConfirmation chooseanInsole()
	{
		
	
click(insolechoose);
	return this;
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id='20101_img']")
	private WebElement shoe;
	
	public UserCreatedConfirmation chooseashoe()
	{
		

click(shoe);
try {
	Thread.sleep(5000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	return this;
	}
	
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'search2 ui-autocomplete-input')]")
	private WebElement searchfield;
	
	
	@FindBy(how=How.XPATH,using="//div[@id='specialist2']/div/form/div/input[@value='SEARCH']")
	private WebElement searchbutton;

	
	public Searchresults entersearch(String data)
	{


		refresh();
		FluentWait();
		
		verifyDisplayed(searchfield);
		highLighterMethod(driver, searchfield);
		
		type(searchfield, data);
		
		click(searchbutton);
		return new Searchresults();
		
	}
	

}