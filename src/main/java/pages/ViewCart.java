package pages;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewCart extends ProjectMethods{
	
	public ViewCart() {		
		PageFactory.initElements(driver,this);
	
}
	
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'cart-title')]")
	private WebElement cartsuccessmessage;
	
	
	public ViewCart verifycarttitle() 
	{
		
		verifyDisplayed(cartsuccessmessage);
		highLighterMethod(driver, cartsuccessmessage);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'search2 ui-autocomplete-input')]")
	private WebElement searchfield;
	
	@FindBy(how=How.XPATH,using="//div[@id='specialist2']/div/form/div/input[@value='SEARCH']")
	private WebElement searchbutton;
	

	
	public Searchresults entersecondproduct(String data)
	{


		
		
		verifyDisplayed(searchfield);
		
		type(searchfield, data);
		
		click(searchbutton);
		return new Searchresults();
		
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'getThisPrice') and contains(@class,'get-this-vip-price')]")
	private WebElement getthispricelink;
	
	public ViewCart getthisprice() 
	{
		
		verifyDisplayed(getthispricelink);
		highLighterMethod(driver, getthispricelink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'vip-price-lbl')]")
	private WebElement viplink;
	
	public ViewCart vip() 
	{
		
		verifyDisplayed(viplink);
		highLighterMethod(driver, viplink);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'checkout_guest checkout-guest-wrap-btn')]")
	private WebElement guest;
	
	public ViewCart clickGuest() 
	{
		
		click(guest);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'header-back-button')]/a")
	private WebElement editbutton;
	
	public UserCreatedConfirmation clickshopping() 
	{
		highLighterMethod(driver, editbutton);
		click(editbutton);
		return new UserCreatedConfirmation();
	}
	
	
	
	
	
	
	public ViewCart guestbutton() 
	{
		
		verifyDisplayed(guest);
		highLighterMethod(driver, guest);
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'signin-button')]")
	private WebElement signin;
	
	public ViewCart signinbutton() 
	{
		
		verifyDisplayed(signin);
		highLighterMethod(driver, signin);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'ajaxasync pod5')]/button")
	private WebElement paypal;
	
	public ViewCart paypalbutton() 
	{
		
		verifyDisplayed(paypal);
		highLighterMethod(driver, paypal);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'vip-rebutal-btn')]")
	private WebElement withoutvip;
	
	public ViewCart withoutvipbutton() 
	{
		
		verifyDisplayed(withoutvip);
		highLighterMethod(driver, withoutvip);
		return this;
	}
	
	public OrderSummary clickWithoutVip() 
	{
		
	click(withoutvip);
		return new OrderSummary();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'Click Now to Join and Save!')]")
	private WebElement withvip;
	
	public ViewCart withvipbutton() 
	{
		
		verifyDisplayed(withvip);
		highLighterMethod(driver, withvip);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'get-vip-savings-wrap')]")
	private WebElement viplinks;
	
	public ViewCart vipbutton() 
	{
		
		verifyDisplayed(viplinks);
		highLighterMethod(driver, viplinks);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'have-promo-cards')]")
	private WebElement offers;
	
	public ViewCart offercode() 
	{
		
		verifyDisplayed(offers);
		highLighterMethod(driver, offers);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'signin-button')]")
	private WebElement placingorder;
	
	public OrderSummary placeanorder() 
	{
		
		click(placingorder);
		
		return new OrderSummary();
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='clickButton' and @value='PLACE YOUR ORDER']")
	private WebElement ordrbutton;
	
	public verifyOrder placeorderButtonclick()
{
		highLighterMethod(driver, ordrbutton);
		click(ordrbutton);
		
		return new verifyOrder();
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'header-bars email-header')]")
	private WebElement emailsec;
	
	public ViewCart emailsection() 
	{
		
		verifyDisplayed(emailsec);
		highLighterMethod(driver, emailsec);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'header-bars shipping-header')]")
	private WebElement shipsec;
	
	public ViewCart shippingsection() 
	{
		
		verifyDisplayed(shipsec);
		highLighterMethod(driver, shipsec);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@class,'header-bars billing-header')]")
	private WebElement billsec;
	
	public ViewCart billingsection() 
	{
		
		verifyDisplayed(billsec);
		highLighterMethod(driver, billsec);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'promo-number-fld')]")
	private WebElement coupon;
	@FindBy(how=How.XPATH,using="//*[contains(@onclick,'applyPromotion()')]")
	private WebElement apply;
	
	public ViewCart entercouponcode(String code) 
	{
		highLighterMethod(driver, coupon);
		type(coupon,code);
		click(apply);
		
		
		return this;
	}
	
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'rrsglobalnav-womens')]/p")
	private WebElement category;
	@FindBy(how=How.XPATH,using="//*[contains(@href,'/rrs/womensshoes/womensracing/?cm_sp=nav-_-womens-_-racing')]")
	private WebElement subcategory;
	
	
	public ViewCart clickcategory() 
	{
		
		mouseHover(category);
		mouseHover(subcategory);
		click(subcategory);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[contains(@id,'26026_img')]")
	private WebElement chooseshoe;
	
	@FindBy(how=How.XPATH,using="//*[contains(@title,'Black/White')]")
	private WebElement color;
	@FindBy(how=How.XPATH,using="//*[contains(@id,'Size;5')]")
	private WebElement size;
	public ViewCart shoeselect() 
	{
		
		click(chooseshoe);
		click(color);
		click(size);
		
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='smartGift']")
	private WebElement giftlinks;
	public HomePage_RRS viewgifts() 
	{
		
		try {
			pageScroll();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		verifyDisplayed(giftlinks);
		highLighterMethod(driver, giftlinks);
		
		
		
		return new HomePage_RRS();
	}
	
	
	
	
	
	
	
}
