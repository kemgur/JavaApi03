package com.techproed2.javaapi3;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import testBaseClassess.TestBaseHerOku;


public class GetRequest06 extends TestBaseHerOku{
/*
 When
               I send a GET request to REST API URL https://restful-booker.herokuapp.com/booking
       Then
               Among the data there should be someone whose first name is "Susan" and last name is "Ericsson"
 */
	@Test
	public void get06() {
		
		spec.pathParam("bookingName", "booking")
		.queryParams("firstname","Mark", "lastname","Wilson");
		
		
		Response response=given().spec(spec).when().get("/{bookingName}");
		
		response.prettyPrint();
		
		
		response.then().assertThat().statusCode(200);
		
		assertTrue(response.asString().contains("bookingid"));
		
		
	}
	
	
	
	
	
}