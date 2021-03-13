package com.flipkart.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flipkart.qa.base.BrowserStackTestBase;
import com.flipkart.qa.base.TestBase;
import com.flipkart.qa.pages.HomePage;

public class HomePageTest extends BrowserStackTestBase{   //BrowserStack
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Exception {
	//	intialization();
		homepage = new HomePage();
	}
	
	@Test
	public void HomePageValidation() {
		homepage.cancelSignIn();
		homepage.searchProduct("iPhone 11");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
