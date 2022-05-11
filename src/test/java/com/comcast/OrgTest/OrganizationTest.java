package com.comcast.OrgTest;

import org.testng.annotations.Test;

public class OrganizationTest {
	@Test(groups="smokeTest")
	public void createOrganizationTest()
	{
		System.out.println("Organization created");
	}
	@Test(groups="regressionTest")
	public void editOrganizationTest()
	{
		System.out.println("Organization edited");
	}
	@Test(groups="regressionTest")
	public void deletOrganizationTest()
	{
		System.out.println("Organization deleted");
	}
}
