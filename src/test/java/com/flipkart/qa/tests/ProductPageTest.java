package com.flipkart.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.BrowserStackTestBase;
import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;
import com.flipkart.qa.pages.ProductPage;

public class ProductPageTest extends BrowserStackTestBase{   //BrowserStack
	HomePage homepage;
	ProductPage productpage;
	
	public ProductPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
	//	driver.get("https://www.flipkart.com/");
	//	intialization();
		homepage = new HomePage();
		homepage.cancelSignIn();
		productpage = homepage.searchProduct("iPhone 11");
		
	}
	
	@Test
	public void productPageValidation() {
		productpage.setPriceRange("₹50000");
		productpage.setBrand();
		productpage.setFAssured();
		productpage.fetchProductName();
		productpage.fetchProductPrice();
		productpage.fetchProductLink();
		
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
