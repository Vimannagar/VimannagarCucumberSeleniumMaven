package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

	WebDriver driver; 
	private By hoverelement = By.xpath("//*[@id='nav-link-accountList']");
	
	private By hoversigninbutton = By.xpath("//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']");
		
	private By emailaddress = By.xpath("//*[@id='ap_email']");
	
	private By continueforemail = By.xpath("//input[@id='continue']");
		
	private By passwordfield = By.xpath("//input[@id='ap_password']");
		
	private By signinsubmit = By.xpath("//input[@id='signInSubmit']");
	
	private By carticon = By.xpath("//*[@id='nav-cart']");
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	public String getTitleOfPage()
	{
		String title = driver.getTitle();
		
		return title;
	}
	
	
	public void enterUsername()
	{
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(hoverelement)).perform();
		
		driver.findElement(hoversigninbutton).click();
		
		driver.findElement(emailaddress).sendKeys("7878787887");
		
		driver.findElement(continueforemail).click();
		
	}
	
	public void enterPassword()
	{
		driver.findElement(passwordfield).sendKeys("");
		driver.findElement(signinsubmit).click();
		
	}
	
	public boolean isCartIconDisplayed()
	{
		boolean isdisplayingoverpage = driver.findElement(carticon).isDisplayed();
		
		return isdisplayingoverpage;
	}
	
	
	
}
