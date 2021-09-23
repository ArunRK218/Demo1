package Demo1;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups="SmokeSuite")
	public void createContactTest() {
		System.out.println("execute createContactTest");
	}

	@Test(groups="RegresionSuite")
	public void createContactWithOrgTest() {
		System.out.println("execute createContactWithOrgTest");
	}
	@Test(groups="RegresionSuite")
	public void deleteContactTest() {
		System.out.println("execute deleteContactTest");
	}
}
