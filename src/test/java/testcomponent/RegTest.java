package testcomponent;

import org.testng.annotations.Test;

import enginecomponent.Base;
import pagecomponent.HomePages;

public class RegTest extends Base {
	
	@Test
	public void test01() throws Throwable {

		HomePages homepagesobject = new HomePages();

		homepagesobject.openBestBuy();
	}
	
	@Test
	public void test02() throws Throwable {

		HomePages homepagesobject = new HomePages();

		homepagesobject.bestBuyLinkValidation();
	}
	
	@Test
	public void test03() throws Throwable {

		HomePages homepagesobject = new HomePages();

		homepagesobject.signUp();
			
	}
	
	@Test
	public void test04() throws Throwable {

		HomePages homepagesobject = new HomePages();

		homepagesobject.login();
			
	}
	
	
	@Test
	public void test05() throws Throwable {

		HomePages homepagesobject = new HomePages();

		homepagesobject.topMenus();	
	}
	
	@Test
	public void test06() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.bottomMenus();	
	}

	@Test
	public void test07() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.searchForAndAddAnItemToTheShoppingCart();	
	}

	@Test
	public void test08() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.selectAndAddAnItemFromMenuAShopByDepartment();	
	}
	
	@Test
	public void test09() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.selectAndAddAnItemFromMenuABrandsASelectAnyBrand();	
	}
	
	@Test
	public void test10() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.navigateToTheCheckoutPageWithDummyPayment();
	}
	
	@Test
	public void test11() throws Throwable {
		HomePages homepagesobject = new HomePages();
		homepagesobject.navigateToTheCheckoutPageWithDummyPayment();
	}
	
	@Test
	public void test12() throws Throwable {

		HomePages homepagesobject = new HomePages();

		homepagesobject.topMenuValidation1();
	}
	
//	@Test
//	public void test13() throws Throwable {
//
//		HomePages homepagesobject = new HomePages();
//
//		homepagesobject.topMenuValidation2();
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
