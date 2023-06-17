package vtiger.GenericUtilities;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseAPIClass {
	
	@BeforeSuite
	public void bsconfig()
	{
		baseURI = "https://reqres.in";
		System.out.println("---- Data base Connected ----");
	}
	
	@AfterSuite
	public void asConfig()
	{
		System.out.println("----- Database Closed ------");
	}

}
