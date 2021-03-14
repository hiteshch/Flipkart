package com.flipkart.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.flipkart.qa.base.BrowserStackTestBase;
import com.flipkart.qa.base.TestBase;

public class ProductPage extends BrowserStackTestBase{

	@FindBy(xpath="//*[@class='_2YxCDZ']")
	WebElement price;
	
	@FindBy(css=".\\_167Mu3:nth-child(6) .\\_24_Dny")
	WebElement brand;
	
	@FindBy(css=".\\_3tCU7L")
	WebElement fAssured;
	
	@FindBy(xpath="//div[@class='_4rR01T']")
	List<WebElement> productName;
	
	@FindBy(xpath="//div[@class='_30jeq3 _1_WHN1']")
	List<WebElement> productPrice;
	
	@FindBy(xpath="//*[@class='_1fQZEK']")
	List<WebElement> productLink;

	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public ProductPage() {
		PageFactory.initElements(BrowserStackTestBase.driver, this);
	}
	
	public void setPriceRange(String pricerange) {
		Select pricedropdown= new Select(price);
		pricedropdown.selectByVisibleText(pricerange);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setBrand() {	
	    js.executeScript("arguments[0].scrollIntoView();", brand); 
	    js.executeScript("arguments[0].click();", brand);
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setFAssured() {	
	    js.executeScript("arguments[0].scrollIntoView();", fAssured); 
	    js.executeScript("arguments[0].click();", fAssured);
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fetchProductName() {
		
		 for(int i=0;i<productName.size();i++) {
			 
				  String product_name = productName.get(i).getText();//Iterate and fetch product name
				  System.out.println((i+1) + " " + product_name + " "); 
				 
				  }
	}
	
	public void fetchProductPrice() {
		
		 for(int i=0;i<productPrice.size();i++) {
			
				  String product_price = productPrice.get(i).getText();	
				  product_price = product_price.replaceAll("[^0-9]", ""); 
				  int int_product_price = Integer.parseInt(product_price);
				  System.out.println(int_product_price + " "); 
				  
				  }
	}
	
	public void fetchProductLink() {
		
		for (WebElement webElement : productLink) {
		  	   
		  	   System.out.println(webElement.getAttribute("href"));
		  	
		  }     
	}
	
}
