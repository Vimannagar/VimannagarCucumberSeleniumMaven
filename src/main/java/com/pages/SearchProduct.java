package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProduct {
	
	WebDriver driver; 
	private By textbox = By.xpath("//*[@id='twotabsearchtextbox']");
	
	private By searchbutton = By.xpath("//*[@id='nav-search-submit-button']");
		
	
	
	public SearchProduct(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public void enterProduct(String text)
	{
		driver.findElement(textbox).sendKeys(text);
		
		driver.findElement(searchbutton).click();
	}
	
	
	public String verifyMobile()
	{
		String titleofpage = driver.getTitle();
		
		return titleofpage;
	}

	
	
}
