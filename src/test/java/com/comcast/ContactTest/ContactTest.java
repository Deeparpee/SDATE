package com.comcast.ContactTest;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups="smokeTest")
	public void createContactTest()
	{
		System.out.println(" new contact  created");
		String para = System.getProperty("url");
		System.out.println(para);
	}
	@Test(groups="regressionTest")
	public void editContactTest()
	{
		System.out.println("contact edited");
		String para = System.getProperty("url");
		System.out.println(para);
	}
	//rt test
	@Test(groups="regressionTest")
	public void deletContactTest()
	{
		System.out.println("contact deleted");
	}
}
