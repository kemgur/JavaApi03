package testBaseClassess;

import org.junit.Before;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class TestBaseDummy {

	
	protected RequestSpecification spec;//interface
	
	@Before
	public void setup() {
		
		spec=new RequestSpecBuilder().setBaseUri("http://dummy.restapiexample.com/api/v1/create").build();
		
		
	}
}
