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
	public void deleteCampaignTest()
	{
		System.out.println("Campaign deleted");
	}
	@Test
	public void createCampaignWithProduct() 
	{
		System.out.println("Campaign created with product");
	}

}
