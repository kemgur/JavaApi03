package com.techproed2.javaapi3;

import static io.restassured.RestAssured.*;

import org.junit.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojo.Data;
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
			
			Data data=new Data();		
			
			data.setAge(35);
			data.setDepartment("it");
			data.setName("bill");
			data.setSalary(1000);
			
			Response response=given().contentType(ContentType.JSON).spec(spec).
					body(data).when().post("/{api}/{version}/{create}");
			
			
		}
		
		
		
	}