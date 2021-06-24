package testBaseClassess;
import org.junit.Before;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
public class TestBaseHerOku {
	
	
	protected RequestSpecification spec;
	
	@Before
	public void setUp() {
		
		spec=new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();
		
		
	}
	
	
	
}





