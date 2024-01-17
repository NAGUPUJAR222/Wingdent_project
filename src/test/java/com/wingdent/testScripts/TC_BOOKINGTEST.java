package com.wingdent.testScripts;

import org.testng.annotations.Test;

import com.wingdent.pageObject.BookingDemo;

public class TC_BOOKINGTEST extends BASECLASS {
	
	@Test
	public void verifyBook()
	{
		BookingDemo bd=new BookingDemo(driver);
		bd.Booking();
		bd.BookingStatus("Nagaraj", "1234567890", "raaaj@gmail.com", "18-01-2024", "Good place to visit!");
		
	}

}
