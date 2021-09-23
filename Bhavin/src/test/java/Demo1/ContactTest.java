package Demo1;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test(groups="SmokeSuite")
	public void createContactTest() {
		String url = System.getProperty("url");
		String browser = System.getProperty("browser");
		System.out.println("execute createContactTest");
		System.out.println("===="+url);
		System.out.println("===="+browser);

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
