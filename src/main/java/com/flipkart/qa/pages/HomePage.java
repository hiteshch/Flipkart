package com.flipkart.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.qa.base.BrowserStackTestBase;
import com.flipkart.qa.base.TestBase;

public class HomePage extends BrowserStackTestBase{
	
	@FindBy(xpath="//*[@class='_2KpZ6l _2doB4z']")  
	WebElement sign_in_cross;
	
	@FindBy(name="q")
	WebElement search;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	WebElement searchBtn;
	
	public HomePage() {
		PageFactory.initElements(BrowserStackTestBase.driver, this);
	}
	
	public void cancelSignIn() {
		sign_in_cross.click();
	}
	
	public ProductPage searchProduct(String product) {
		search.sendKeys(product);
		searchBtn.submit();
		return new ProductPage();
	}
}
