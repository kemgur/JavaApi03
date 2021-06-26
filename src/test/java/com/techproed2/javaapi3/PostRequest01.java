package com.techproed2.javaapi3;

import org.hamcrest.Matchers;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import testBaseClassess.TestBaseDummy;

public class PostRequest01 extends TestBaseDummy{
	
	/*
	 When
            I send a POST Request to the Url http://dummy.restapiexample.com/api/v1/create
            by using the following Request Body {
                                                                                     "name":"bill",
                                                                                     "salary":1000,
                                                                                     "age":35,
                                                                                     "department": "it"
                                                                                  }
    Then
            Status code is 200
            And response body should be like { "status": "success",
 "data": {
 "name": "bill",
 "salary": "1000",
 "age": "33",
 "department": "it"
                                                                             },
 "message": "Successfully! Record has been added."
                                                                           }
	 */

    @Test
	public void post01() {
		
		spec.pathParams("api","api","version","v1","create","create");
		
//		Data data=new Data();		
//		
//		data.setAge(35);
//		data.setDepartment("it");
//		data.setName("bill");
//		data.setSalary(1000);
		
		
		//Data data=new Data( 0,35, 1000, "Bill", "it");
		
		HashMap<String ,Object> data=new HashMap<String, Object>();
		
		data.put("age", 35);
		data.put("salary", 1000);
		data.put("name", "Bill");
		data.put("department", "it");
		
		
		Response response=given().contentType(ContentType.JSON).spec(spec).
				auth().basic("admin", "password123").
				body(data).when().post("/{api}/{version}/{create}");
		response.prettyPrint();
		
		//assertEquals(200,response.getStatusCode());
		
		JsonPath json=response.jsonPath();
		assertEquals("Bill",json.getString("data.name"));
		assertEquals("it", json.getString("data.department"));
		
		response
		.then()
		.assertThat()
		.statusCode(200)
		.and()
		.body("data.age", Matchers.equalTo(35));
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}