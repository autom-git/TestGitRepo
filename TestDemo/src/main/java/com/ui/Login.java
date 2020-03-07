package com.ui;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {

	
	RemoteWebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("BEFORE SUITE");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separator+"\\src\\main\\resources\\ Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS
				
				
				
				);
		driver.get("https://google.com");
	}
	
	@Test
	public void testOne()
	{
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		
		System.out.println("URL   : "+url);
		System.out.println("Title : "+title);
	}
	@AfterSuite
	public void tearDown()
	{
		driver.close();
	}
}
