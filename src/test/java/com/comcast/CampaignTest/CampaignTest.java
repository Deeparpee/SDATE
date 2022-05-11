package com.comcast.CampaignTest;

import org.testng.annotations.Test;

public class CampaignTest {
	@Test(groups="smokeTest")
	public void createCampaignTest()
	{
		//smokeT
		System.out.println(" new Campaign created");
		String someParameter = System.getProperty("browser");
		System.out.println(someParameter);
	}
	//regression
	@Test(groups="regressionTest")
	public void editCampaignTest()
	{
		System.out.println("Campaign edited");
	}
	@Test(groups="regressionTest")
	public void deletCampaignTest()
	{
		System.out.println("Campaign deleted");
	}
	

}
