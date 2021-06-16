package com.techproed2.javaapi3;

import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class GetRequest03 {
//  I send a GET request to REST API URL             https://jsonplaceholder.typicode.com/todos/23  
//And Accept type is “application/JSON”
//Then
//HTTP Status Code should be 200
//And Response format should be "application/JSON"
//And "title" is "et itaque necessitatibus maxime molestiae qui quas velit",
//And "completed" is false
//And "userId" is 2
//
	@Test
	public void get03() {
		
		//1.step set url
		String url = " https://jsonplaceholder.typicode.com/todos/23";
		
		//2.step accepted data
		
		//3.step sent url
		Response response= given().accept(ContentType.JSON).when().get(url);
		response.prettyPrint();
		
		//4.step make assertion
//		response.then()
//		.assertThat()
//		.statusCode(200)
//		.contentType("application/json charset=utf-8 ")
//		.body("title",Matchers.equalTo("et itaque necessitatibus maxime molestiae qui quas velit"))
//		.body("completed", Matchers.equalTo(false)).body("userId",Matchers.equalTo(2) );
		
//		response.then()
//		.assertThat()
//		.statusCode(200)
//		.contentType("application/json charset=utf-8 ")
//		.body("title",equalTo("et itaque necessitatibus maxime molestiae qui quas velit")
//		,"completed",equalTo(false)
//		,"userId",equalTo(2)) ;
		
		//2.Way for assertion
		assertEquals(200,response.getStatusCode());
		
		assertEquals("application/json; charset=utf-8",response.getContentType());
		
		assertTrue(response.asString().contains("et itaque necessitatibus maxime molestiae qui quas velit"));
		
		assertTrue(response.asString().contains("false"));
		
		assertTrue(response.asString().contains("2"));
		
		assertTrue(response.asString().contains("title"));
		
		
		
		
		
		
		
		
	}
	

}
