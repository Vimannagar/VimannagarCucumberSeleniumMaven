package com.qa;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	Properties prop;
	
	public Properties readConfig()
	{
		 prop = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(fis);
		
		} 
		catch (IOException e) {
			System.out.println("Exception arrived inside the catch block for readding the properties file");
		}
		
		return prop;
	
	}
	
	

}
