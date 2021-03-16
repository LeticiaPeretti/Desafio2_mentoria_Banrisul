package testBases.viaCep;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;

public class CepFormatoInvalidoTestBase {
	protected static RequestSpecification requestSpec;
    protected static ResponseSpecification responseSpec;
    protected static final String requestType = "text/html; charset=utf-8";
    
    @BeforeAll
    public static void setUp() {
    	buildRequestSpec();
        buildResponseSpec();
    }
    
    public static void buildRequestSpec() {
    	requestSpec = new RequestSpecBuilder()
    			.setBaseUri("https://viacep.com.br")
                .setBasePath("/ws/90020101222/" + requestType)
                .build();
    }
    
    public static void buildResponseSpec(){
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(400)
                .expectContentType(ContentType.HTML)
                .build();
    }
    
    

}
