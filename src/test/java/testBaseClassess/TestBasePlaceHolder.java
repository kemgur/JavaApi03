package testBaseClassess;

import org.junit.Before;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class TestBasePlaceHolder {

	
	protected RequestSpecification spec;//interface
	
	@Before
	public void setup() {
		
		spec=new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com/todos/123").build();
		
		
	}
}
