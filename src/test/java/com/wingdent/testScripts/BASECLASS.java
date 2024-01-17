package com.wingdent.testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BASECLASS {
	WebDriver driver;
	
	@BeforeMethod
	public void setBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/nagra/Downloads/wingdent%20final%201/WingDent2-master/index.html");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
