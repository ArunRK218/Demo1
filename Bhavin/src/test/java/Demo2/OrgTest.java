package Demo2;

import org.testng.annotations.Test;

public class OrgTest 
{
	@Test(groups="SmokeSuite")
	public void createOrgTest() {
		System.out.println("execute createOrgTest");
	}

	@Test(groups="RegresionSuite")
	public void createOrgWithContactTest() {
		System.out.println("execute createOrgWithContactTest");
	}
	@Test(groups="RegresionSuite")
	public void deleteORGTest() {
		System.out.println("execute deleteORGTest");
	}
	
	@Test(groups="SmokeSuite")
	public void SearchOrgTest() {
		System.out.println("execute SearchOrgTest");
	}
}
