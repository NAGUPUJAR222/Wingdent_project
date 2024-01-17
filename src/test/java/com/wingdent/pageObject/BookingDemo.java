package com.wingdent.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingDemo {
	
	public static WebDriver driver;
	
	public BookingDemo(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-lg btn-book']")
	WebElement bookingbtn;
	
	public void Booking()
	{
		bookingbtn.click();
	}
	
	@FindBy(id="name")
	WebElement nametbx;
	
	@FindBy(id="phoneNumber")
	WebElement phtbx;
	
	@FindBy(id="emailInput")
	WebElement emtbx;
	
	@FindBy(id="date")
	WebElement appdatetbx;
	
	@FindBy(id="appointment-time")
	WebElement apptimetbx;
	
	@FindBy(xpath="//option[@value='10:00am-11:00am']")
	WebElement timetbx;
	
	@FindBy(id="message")
	WebElement msgtbx;
	
	@FindBy(xpath="//button[.='Book']")
	WebElement bookbtn;
	
	public void BookingStatus(String nm,String ph,String email,String date,String mes)
	{
		nametbx.sendKeys(nm);
		phtbx.sendKeys(ph);
		emtbx.sendKeys(email);
		appdatetbx.sendKeys(date);
		apptimetbx.click();
		timetbx.click();
		msgtbx.sendKeys(mes);
		bookbtn.click();
		String text = driver.findElement(By.xpath("//h3[.='Form submitted successfully!']")).getText();
		System.out.println(text);
		System.out.println("=================================================================");
		String text1 = driver.findElement(By.xpath("//p[.='Thank you! The form has been submitted successfully. We will reply to you soon!']")).getText();
		System.out.println(text1);
		System.out.println("================================================================");
	}

}
