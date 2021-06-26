package com.techproed2.javaapi3;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.hamcrest.Matchers;

import testBaseClassess.TestBaseDummy;

public class DeleteRequest01 extends TestBaseDummy {

	@Test
	public void DeleteRequest01() {
		/*
		 When
              I send DELETE Request to the Url http://dummy.restapiexample.com/api/v1/delete/2                 
       Then
              Status code is 200
              And Response body is {
                                                       "status": "success",
                                                       "data": "2",
                                                       "message": "message"
                                                     }
		 */
		spec.pathParams("api","api","version","v1","delete","delete","id","2");

		Response response = given().spec(spec).when().delete("/{api}/{version}/{delete}/{id}");
		response.prettyPrint();
		
		response.then()
		.assertThat()
		.statusCode(200)
		.body( "status",Matchers.equalTo("success"),
				 "data",Matchers.equalTo("2"),
			  "message",Matchers.equalTo("Successfully! Record has been deleted"));
		
	}
}
