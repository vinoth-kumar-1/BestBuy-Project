package pagecomponent;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import enginecomponent.Base;
import utility.WebUtil;

public class HomePages extends Base {

	
	WebUtil webutilobj = new WebUtil();
	
	@FindBy(className = "us-link")
	WebElement us_countryselection;
	
//	@FindBy(xpath = "(//a[@class='us-link'])[1]")
//	WebElement us_countryselection;
	
//	@FindBy(xpath="//a[@xpath='1']")
//	WebElement us_countryselection;
	
	@FindBy(className = "canada-link")
	WebElement canada_countryselection;
	
	@FindBy(xpath = "//button[@data-lid='hdr_signin']")
	WebElement account_button;
	
	@FindBy(xpath = "//a[text()='Create Account']")
	WebElement create_account;
	
	@FindBy(id = "firstName")
	WebElement firstname;
	
	@FindBy(id = "lastName")
	WebElement lastname;
	
	@FindBy(id = "email")
	WebElement emailinsignup;
	
	@FindBy(id = "fld-p1")
	WebElement password;
	
	@FindBy(id = "reenterPassword")
	WebElement reenterpassword;
	
	@FindBy (id = "phone")
	WebElement phonenumber;
	
	@FindBy (xpath = "//button[text()='Create an Account']")
	WebElement create_an_account;
	
	@FindBy(xpath = "//a[@data-lid='ubr_mby_signin_b']")
	WebElement signin;
	
	@FindBy(id = "fld-e")
	WebElement emailinsignin;
	
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signin_for_signin;
	
	@FindBy(className = "hamburger-menu")
	WebElement hamburgermenu;
	
//	@FindBy(className = "bottom-nav-left lv")
//	WebElement titleselection;
	
//	@FindAll({@FindBy(xpath = "//ul[@class='.bottom-nav-left.lv']")})
//	List<WebElement> topmenulists;
	
	@FindAll({@FindBy(css = ".bottom-nav-left.lv")})
	List<WebElement> topmenulists;
	
//	@FindAll({@FindBy(className = "bottom-nav-left")})
//	List<WebElement> topmenulist;
	
	@FindAll({@FindBy(xpath = "//button[@data-lid='hdr_utility_more']")})
	List<WebElement> topmenulistmorebutton;
	
	@FindBy(css = "svg[class='v-p-top-xxs']")
	WebElement topmenudownarrow;
	
	@FindAll({@FindBy(xpath = "//ul[@class='utility-nav-drawer-flyout-list']")})
	List<WebElement> topmenuhiddenlists;
		
	@FindBy(xpath = "(//button[@aria-label='Close'])[2]")
	WebElement topmenulistclosebutton;
		  
	@FindBy(linkText ="Top Deals")
	WebElement topdeals;
	
	@FindBy(xpath = "//a[text()='Deal of the Day']")
	WebElement dealoftheday;
		
	@FindBy(css = "a[data-lid='hdr_best_buy_totaltech']")
	WebElement totaltechmembership;
	
	@FindBy(xpath = "//a[@data-lid='hdr_crd']")
	WebElement creditcards;
	
	@FindBy(xpath = "//*[@data-lid='hdr_crd']//following::li//a")
	WebElement giftcards;
	
//	@FindBy(xpath = "//a[text()='Gift Cards']")
//	WebElement giftcards;
		
	@FindBy(xpath = "//button[@data-lid='hdr_utility_more']")
	WebElement topmenumorebutton;
		
	@FindBy(xpath = "//ul[@class='utility-nav-drawer-flyout-list']")
	WebElement morebutton;
	
//	@FindBy(xpath = "//a[text()='Gift Ideas']")
//	WebElement giftideas;
	
//	@FindBy(xpath = "//a[@data-lid='hdr_gift_ideas']")
//	WebElement giftideas;
	
	@FindBy(linkText ="Gift Ideas")
	WebElement giftideas;
	
	@FindBy(linkText ="Health & Wellness")
	WebElement healthwellness;

	@FindBy(linkText ="Best Buy Outlet")
	WebElement bestbuyoutlet;

	@FindBy(linkText ="Best Buy Business")
	WebElement bestbuybusiness;
		
	@FindBy(linkText ="Accessibility")
	WebElement accessibility;
	
	@FindBy(linkText ="Terms & Conditions")
	WebElement termsandconditions;
	
	@FindBy(linkText ="Privacy")
	WebElement privacy;
	
	@FindBy(linkText ="Interest-Based Ads")
	WebElement interestbasedads;
	
	@FindBy(linkText ="State Privacy Rights")
	WebElement stateprivacyrights;
	
	@FindBy(linkText ="CA Do Not Sell/Share My Personal Information")
	WebElement casonotsellsharemypersonalinformation;
	
	@FindBy(xpath = "//a[@class='mini-header__nav']")
	WebElement returntohomepage;
	
	@FindBy(linkText ="Limit Use of My Sensitive Personal Information")
	WebElement limituseofmysensitivepersonalinformation;
		
	@FindBy(linkText ="Targeted Advertising Opt Out")
	WebElement targetedadvertisingoptout;
	
	@FindBy(linkText ="CA Supply Chain Transparency Act")
	WebElement casupplychaintransparencyact;
	
	@FindBy(id = "gh-search-input")
	WebElement searchbox;
	
	@FindBy(css = "button[class='header-search-button']")
	WebElement searchicon;
	
	@FindBy(css = "[data-button-state='ADD_TO_CART'][data-sku-id='6523167']")
	WebElement addtocartforsonyplaystation;
	
//	@FindBy(className = "hHrYVO")
//	WebElement addedtocart;
	
	@FindBy(xpath = "//div[@class='hHrYVO']")
	WebElement addedtocart;
	
	@FindBy(xpath = "//button[@aria-label='Menu']")
	WebElement hamburgermenus;
	
	@FindBy(xpath = "//button[@data-id='node-665']")
	WebElement camerascamcordersdronesmenu;
	
	@FindBy(xpath = "//button[@data-id='node-645']")
	WebElement dronesmenu;

	@FindBy(xpath = "//a[text()='Camera Drones']")
	WebElement cameradronesmenu;
	
	@FindBy(css = "[data-button-state='ADD_TO_CART'][data-sku-id='6534909']")
	WebElement addtocartfordrone;
	
	@FindBy(xpath = "//button[@data-id='node-87']")
	WebElement brands;
	
	@FindBy(linkText ="Sony")
	WebElement sony;
	
	@FindBy(linkText ="PlayStation")
	WebElement playstation;
	
	@FindBy(linkText ="PlayStation 5")
	WebElement playstation5;
	
	@FindBy(linkText ="Shop PlayStation 5")
	WebElement shopplaystation5;
	
	@FindBy(linkText ="Go to Cart")
	WebElement gotocart;
	
	@FindBy(xpath = "//button[text()='Checkout']")
	WebElement checkout;
	
//	@FindBy(linkText ="Continue as Guest")
//	WebElement continueasguest;
	
	@FindBy(xpath = "//button[text()='Continue as Guest']")
	WebElement continueasguest;
	
	@FindBy(xpath = "//input[@id='user.emailAddress']")
	WebElement emailincheckoutpage;
	
	@FindBy(xpath = "//input[@id='user.phone']")
	WebElement phonenumberincheckoutpage;
	
	@FindBy(xpath ="//button[text()='Switch to shipping']")
	WebElement switchtoshipping;
	
//	@FindBy(css = "button[class='btn.btn-lg.btn-block.btn-secondary']")
//	WebElement continuetopaymentinformation;
	
//	@FindBy(css = "button[class='btn.btn-lg']")
//	WebElement continuetopaymentinformation;
	
	@FindBy(xpath = "//div[@class='button--continue']")
	WebElement continuetopaymentinformation;
	
	@FindBy(xpath = "//input[@id='number'][@name='number']")
	WebElement cardnumber;
	
	@FindBy(className = "firstName")
	WebElement firstnameincheckout;
	
	@FindBy(className = "lastName")
	WebElement lastnameincheckout;
	
	@FindBy(className = "addressLine1")
	WebElement addressincheckout;
	
	@FindBy(className = "city")
	WebElement cityincheckout;
	
	@FindBy(xpath = "//button[@data-track='Place your Order - Contact Card']")
	WebElement placeyourorder;
	
	@FindBy(xpath = "//button[@data-track='Shipping: Save shipping address']")
	WebElement applybutton;
	
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement firstnameinshipping;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastnameinshipping;
	
	@FindBy(xpath = "//input[@name='street']")
	WebElement addressinshipping;
	
	
	public HomePages() {
		
		PageFactory.initElements(WebUtil.driver, this);
	}
	
	
	public void openBestBuy() {
	
	}
	
	
	public void bestBuyLinkValidation() {
		Assert.assertEquals(webutilobj.getCurrentUrlMethod(), (readProperty("url")));
		//System.out.println(webutilobj.getCurrentUrlMethod());
		//webutilobj.getCurrentUrlMethod().contains(excelmethod(0,2,2));
		//Assert.assertEquals((excelmethod(0,2,2)), getCurrentUrlMethod());
		//Assert.assertTrue(webutilobj.getCurrentUrlMethod().contains(excelmethod(0,2,2)));
		//System.out.println(webutilobj.getCurrentUrlMethod().contains(excelmethod(0,2,1)));
		//System.out.println(webutilobj.getCurrentUrlMethod().contains(readProperty("url")));
		//System.out.println(webutilobj.getCurrentUrlMethod().contains("https://www.bestbuy.com/"));
		//System.out.println(webutilobj.getCurrentUrlMethod().compareToIgnoreCase(readProperty("url")));
		//System.out.println(webutilobj.getCurrentUrlMethod().compareToIgnoreCase(excelMethod(0,2,2)));
		//System.out.println(webutilobj.getCurrentUrlMethod().equalsIgnoreCase(excelMethod(0,2,1)));
		//Assert.assertSame(webutilobj.getCurrentUrlMethod(), (readProperty("url")));
	}
	
	public void signUp() {
		
		eleClick(us_countryselection);
		explicitWaitMethod(account_button,5);
		eleClick(account_button);
		eleClick(create_account);
		
		eleClick(firstname);
		clearMethod(firstname);
		sendKeysMethod(firstname,(readProperty("firstname")));
		
		eleClick(lastname);
		clearMethod(lastname);
		sendKeysMethod(lastname,(readProperty("lastname")));
		
		eleClick(emailinsignup);
		clearMethod(emailinsignup);
		sendKeysMethod(emailinsignup,(readProperty("email")));
		
		eleClick(password);
		clearMethod(password);
		sendKeysMethod(password,(readProperty("password")));
		
		eleClick(reenterpassword);
		clearMethod(reenterpassword);
		sendKeysMethod(reenterpassword,(readProperty("reenterpassword")));
		
		eleClick(phonenumber);
		clearMethod(phonenumber);
		sendKeysMethod(phonenumber,(readProperty("phonenumber")));
		
		eleClick(create_an_account);
	}
	
	
	public void login() {
		
		eleClick(us_countryselection);
		explicitWaitMethod(account_button,5);
		eleClick(account_button);
		eleClick(signin);
		
		eleClick(emailinsignin);
		sendKeysMethod(emailinsignin ,(readProperty("email")));
		
		eleClick(password);
		sendKeysMethod(password ,(readProperty("password")));
		
		eleClick(signin_for_signin);
	
	}
	
	public void topMenuValidation1() throws Throwable {
		
		try {
			
			//String  value1 = null;
			eleClick(us_countryselection);
			//eleClick(canada_countryselection);
			
			
			listElementsMethod(topmenulists);
			//listElementsMethod(topmenulist);
			//eleClick();
			//Assert.assertTrue(topmenulists,excelMethodWithSheetNo(0,1,1));
			//Assert.assertEquals(topmenulists ,excelMethodWithSheetNo(0,1,1));
			//Assert.assertSame(topmenulists ,excelMethodWithSheetNo(0,1,1));
			//String  value = topmenulists.contains(excelMethodWithSheetNo(0,1,1));
//			WebElement  value = topmenulists.get(0);
//			Assert.assertEquals(value,excelMethodWithSheetNo(0,1,1));
//			String  value2 = excelMethodWithSheetNo(0,1,1);
//			Assert.assertEquals(value,value2);
			
			 for (WebElement webElement : topmenulists) {
		            String name = webElement.getText();
		            Assert.assertEquals(name,excelMethodWithSheetNo(0,0,0));
		            
		            //Assert.assertEquals(name,excel());
//		            Assert.assertEquals(name,"Top Deals 
//		            		 Deal of the Day
//		            		 Totaltech Membership
//		            		 Credit Cards
//		            		 Gift Cards");
		            //Assert.assertTrue(name.contains(readProperty("menutitles")));
		           // Assert.assertEquals(name, readProperty("menutitles"));
		            //System.out.println(name);
		            //System.out.println(excelMethodWithSheetNo(0,1,1));
		            
			 }
			 
			//Assert.assertEquals(name ,excelMethodWithSheetNo(0,1,1));
			 
			 
			listElementsMethod(topmenulistmorebutton);
			 for (WebElement webElement : topmenulistmorebutton) {
		            String name = webElement.getText();
		            Assert.assertEquals(name,excelMethodWithSheetNo(0,5,0));
			      //Assert.assertEquals(topmenulists ,excelMethodWithSheetNo(0,6,1));
			 }
			 
			 
			eleClick(topmenudownarrow);
			
	        listElementsMethod(topmenuhiddenlists);
	        
	        for (WebElement webElement : topmenuhiddenlists) {
	            String name = webElement.getText();
	            Assert.assertEquals(name,excelMethodWithSheetNo(0,6,0));
		      //Assert.assertEquals(topmenulists ,excelMethodWithSheetNo(0,6,1));
	          //Assert.assertEquals(topmenulists ,excelMethodWithSheetNo(0,7,1));
		 }
	       
			
			eleClick(topmenulistclosebutton);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
	}
	
	public void topMenuValidation2() throws Throwable {
		
		eleClick(us_countryselection);	
		listElementsMethod(topmenulists);
		

		 for (WebElement webElement : topmenulists) {
	            String name = webElement.getText();
	            Assert.assertEquals(name,readExcel());
		 }
	}
	
	public void topMenus() throws Throwable {
		
		eleClick(us_countryselection);
		
		eleClick(topdeals);	
		String title1 = getTitleMethod();
		//System.out.println(title1);
		Assert.assertEquals("Top Deals and Featured Offers on Electronics - Best Buy", title1);
		//Assert.assertEquals(topdeals ,excelMethodWithSheetNo(0,11,1));
		//Assert.assertEquals(topdeals ,excel());
		
		eleClick(dealoftheday);	
		String title2 = getTitleMethod();
		//System.out.println(title2);
		Assert.assertEquals("Deal of the Day: Electronics Deals - Best Buy", title2);
		
		
		eleClick(totaltechmembership);	
    	String title3 = getTitleMethod();
     	//System.out.println(title3);
		//Assert.assertEquals(title3,"Best Buy Totaltech™️ – Best Buy");
		Assert.assertEquals("Best Buy Totaltech™ – Best Buy",title3);
		                   //Best Buy Totaltech™ – Best Buy
		
		
		eleClick(creditcards);	
		String title4 = getTitleMethod();
		//System.out.println(title4);
		Assert.assertEquals("Best Buy Credit Card: Rewards & Financing", title4);
		
		
		eleClick(giftcards);	
		String title5 = getTitleMethod();
		//System.out.println(title5);
		Assert.assertEquals("Gifts Cards and E-Gift Cards - Best Buy", title5);
		
		eleClick(topmenudownarrow);
		//eleClick(morebutton);
		
		eleClick(giftideas);
		String title6 = getTitleMethod();
		//System.out.println(title6);
		Assert.assertEquals("Gift Ideas 2023: Best Gifts to Give This Year - Best Buy", title6);
		
		eleClick(topmenudownarrow);	
		eleClick(healthwellness);
		String title7 = getTitleMethod();
		//System.out.println(title7);
		Assert.assertEquals("Health & Wellness Solutions & Technology - Best Buy", title7);
		
		eleClick(topmenudownarrow);
		eleClick(bestbuyoutlet);
		String title8 = getTitleMethod();
		//System.out.println(title8);
		Assert.assertEquals("Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy", title8);
		
		eleClick(topmenudownarrow);
		eleClick(bestbuybusiness);
		String title9 = getTitleMethod();
		//System.out.println(title9);
		Assert.assertEquals("Best Buy for Business - Best Buy", title9);
		
		//eleClick(topmenudownarrow);
		//eleClick(topmenulistclosebutton);
		
	
	}
	
	public void bottomMenus() {
		
		eleClick(us_countryselection);
		
		eleClick(accessibility);
		String title1 = getTitleMethod();
		//System.out.println(title1);
		Assert.assertEquals("Accessibility - Best Buy", title1);
		
		
		eleClick(termsandconditions);
		String title2 = getTitleMethod();
		//System.out.println(title2);
		Assert.assertEquals("BestBuy.com Terms and Conditions", title2);
		
		
		eleClick(privacy);
		String title3 = getTitleMethod();
		//System.out.println(title3);
		Assert.assertEquals("Privacy Policy Hub - Best Buy", title3);
		
		
		eleClick(interestbasedads);
		String title4 = getTitleMethod();
		//System.out.println(title4);
		Assert.assertEquals("Interest-Based Ads - Best Buy", title4);
		
		
		eleClick(stateprivacyrights);
		String title5 = getTitleMethod();
		//System.out.println(title5);
		Assert.assertEquals("State Privacy Rights - Best Buy", title5);
		
		
		eleClick(casonotsellsharemypersonalinformation);
		String title6 = getTitleMethod();
		//System.out.println(title6);
		Assert.assertEquals("Start Request - Best Buy", title6);
		
		eleClick(returntohomepage);
		
		
		eleClick(limituseofmysensitivepersonalinformation);
		String title7 = getTitleMethod();
		//System.out.println(title7);
		Assert.assertEquals("Best Buy", title7);
		
		eleClick(returntohomepage);
		
		eleClick(targetedadvertisingoptout);
		String title8 = getTitleMethod();
		//System.out.println(title8);
		Assert.assertEquals("Start Request - Best Buy", title8);
		
		eleClick(returntohomepage);
		
		eleClick(casupplychaintransparencyact);
		String title9 = getTitleMethod();
		//System.out.println(title9);
		Assert.assertEquals("California Supply Chain Transparency Act - Best Buy", title9);
	
		
	}
	
	public void searchForAndAddAnItemToTheShoppingCart() {
		
		eleClick(us_countryselection);
		eleClick(searchbox);
		sendKeysMethod(searchbox,"Sony - PlayStation 5");
		eleClick(searchicon);
		eleClick(addtocartforsonyplaystation);
		
		explicitWaitMethod(addedtocart,7);
		String cart = getTextMethod(addedtocart);
		//System.out.println(cart);
		Assert.assertTrue(cart.contains("Added to cart"));
		
	
	}
	
	
	public void  selectAndAddAnItemFromMenuAShopByDepartment() {
		
		eleClick(us_countryselection);
		eleClick(hamburgermenus);
		eleClick(camerascamcordersdronesmenu);
		eleClick(dronesmenu);
		eleClick(cameradronesmenu);
		eleClick(addtocartfordrone);
		
		explicitWaitMethod(addedtocart,7);
		String cart = getTextMethod(addedtocart);
		//System.out.println(cart);
		Assert.assertTrue(cart.contains("Added to cart"));

	}
	
	public void selectAndAddAnItemFromMenuABrandsASelectAnyBrand() {
		
		eleClick(us_countryselection);
		eleClick(hamburgermenus);
		eleClick(brands);
		eleClick(sony);
		eleClick(playstation);
		eleClick(playstation5);
		eleClick(shopplaystation5);
		eleClick(addtocartforsonyplaystation);
		
		explicitWaitMethod(addedtocart,7);
		String cart = getTextMethod(addedtocart);
		//System.out.println(cart);
		Assert.assertTrue(cart.contains("Added to cart"));
	
	}
	
	public void navigateToTheCheckoutPageWithDummyPayment() {
		
		eleClick(us_countryselection);
		eleClick(hamburgermenus);
		eleClick(brands);
		eleClick(sony);
		eleClick(playstation);
		eleClick(playstation5);
		eleClick(shopplaystation5);
		eleClick(addtocartforsonyplaystation);
		
		explicitWaitMethod(addedtocart,7);
		String cart = getTextMethod(addedtocart);
		//System.out.println(cart);
		Assert.assertTrue(cart.contains("Added to cart"));
		
		eleClick(gotocart);
		
		eleClick(checkout);
		
		eleClick(continueasguest);
		
//		eleClick(switchtoshipping);
//		
//		eleClick(firstnameinshipping);
//		sendKeysMethod(firstnameinshipping,(readProperty("firstname")));
//		
//		eleClick(lastnameinshipping);
//		sendKeysMethod(lastnameinshipping,(readProperty("lastname")));
//		
//		
//		eleClick(addressinshipping);
//		sendKeysMethod(addressinshipping,(readProperty("address")));
//		explicitWaitMethod(addressinshipping,17);
//		
//		eleClick(applybutton);
		
		eleClick(emailincheckoutpage);
		sendKeysMethod(emailincheckoutpage,(readProperty("email")));
		
		eleClick(phonenumberincheckoutpage);
		sendKeysMethod(phonenumberincheckoutpage,(readProperty("phonenumber")));
		
		
		eleClick(continuetopaymentinformation);
		
//		eleClick(cardnumber);
//		sendKeysMethod(cardnumber,(readProperty("cardnumber")));
//		
//		
//		eleClick(firstnameincheckout);
//		sendKeysMethod(firstnameincheckout,(readProperty("firstname")));
//		
//		eleClick(lastnameincheckout);
//		sendKeysMethod(lastnameincheckout,(readProperty("lastname")));
//		
//		
//		eleClick(addressincheckout);
//		sendKeysMethod(addressincheckout,(readProperty("address")));
//		explicitWaitMethod(addressincheckout,17);
//	
//		eleClick(cityincheckout);
//		
//		
//		eleClick(placeyourorder);
		
		
		
	}
	
	
	
}
