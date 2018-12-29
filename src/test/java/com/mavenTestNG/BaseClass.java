package com.mavenTestNG;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	WebDriver driver;
	

	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("I'm invoking the driver");
		
	}

	
	public void tearDown() {
	
		driver.quit();
	}
	
}
