package viaCep;

import static io.restassured.RestAssured.given;


import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import io.restassured.response.Response;
import testBases.apiDeTarefas.TarefaValidaDados;
import testBases.viaCep.CepFormatoInvalidoTestBase;

@RunWith(JUnitPlatform.class)
public class cepFormatoInvalido extends CepFormatoInvalidoTestBase{
	
	private static TarefaValidaDados tarefaValidaDados = new TarefaValidaDados();
	
	
	@Test
	public void testFormatoInvalido() {
	Response payload =
		      given()
		             .spec(requestSpec)
		             .log().all()
		      .when()
		             .get()
		      .then()
		             .log().all()
		             .spec(responseSpec).extract().response();
	
	
		tarefaValidaDados.validaMensagemCepFormatoInvalido(payload);
	
	
	}
	
	
	

}

