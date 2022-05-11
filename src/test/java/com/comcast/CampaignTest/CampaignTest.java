package com.comcast.CampaignTest;

import org.testng.annotations.Test;

public class CampaignTest {
	@Test(groups="smokeTest")
	public void createCampaignTest()
	{
		System.out.println("Campaign created");
		String someParameter = System.getProperty("browser");
		System.out.println(someParameter);
	}
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
