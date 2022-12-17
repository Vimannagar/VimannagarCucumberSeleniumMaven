package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	
public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

public WebDriver driver;
	
//	method returns the object of webdriver type as well as open the browser

	public WebDriver initBrowser(String browser)
	{
		if(browser.equals("Chrome"))
		{
		tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox"))
		{
			tlDriver.set(new FirefoxDriver());
		}
		
		else
		{
			System.out.println("Please check the name of browser in properties file");
		}
		
		getDriver().manage().window().maximize();
		
		return getDriver();
		
	}
	
	
//	this method will just return the object of webdriver type
	
	public static synchronized WebDriver getDriver()
	{
		return  tlDriver.get();
	}
	
	
	

}
