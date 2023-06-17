package vtigerAPITestScripts;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import vTigerPOJOLibraries.UserLibrary;
import vtiger.GenericUtilities.BaseAPIClass;


public class CreateUser extends BaseAPIClass {

	@Test
	public void createUserTesT()
	{
		
		// Step 1: create data
		UserLibrary uLib = new UserLibrary("karishma", "Actor");

		// Step 2: send request and validate response
		given().body(uLib).contentType(ContentType.JSON).when().post("/api/users").then().log().all();
	}

}
