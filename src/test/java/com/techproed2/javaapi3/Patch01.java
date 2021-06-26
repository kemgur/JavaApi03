package com.techproed2.javaapi3;

import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import testBaseClassess.RestApiExampleHolder;
import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Patch01 extends RestApiExampleHolder {

	@Test
	public void Patch() {
		/*
		 When
                     I send PATCH Request to the Url https://jsonplaceholder.typicode.com/todos/198
                     with the PUT Request body like {
                                                     "title": "Tidy your room"
                                                      }
         Then
               Status code is 200
               And response body is like {
                                            "userId": 10,
                                            "title": "Tidy your room",
                                            "completed": true,
                                            "id": 198
                                         }
		 */
		
		spec.pathParams("todos","todos","id",198);
		
		HashMap<String, Object> data = new HashMap<String, Object>();
		
		data.put("title", "Tidy your room");
		
		Response response = given().contentType(ContentType.JSON).spec(spec).body(data).when().put("/{todos}/{id}");
		response.prettyPrint();
		
		response.then().assertThat().statusCode(200)
		.body("completed", Matchers.equalTo(true),
			       "title",Matchers.equalTo("Tidy your room"),
			      "userId",Matchers.equalTo(10));
		
		
	}
}
