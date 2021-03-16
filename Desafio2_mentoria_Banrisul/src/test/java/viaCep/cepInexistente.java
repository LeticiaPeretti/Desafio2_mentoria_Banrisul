package viaCep;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import io.restassured.response.Response;
import testBases.apiDeTarefas.TarefaValidaDados;
import testBases.viaCep.CepInexistenteTestBase;

@RunWith(JUnitPlatform.class)
public class cepInexistente extends CepInexistenteTestBase{
	
	private static TarefaValidaDados tarefaValidaDados = new TarefaValidaDados();
	
	
	@Test
	public void newSimpleTestCase() {
		Response payload =
			      given()
			             .spec(requestSpec)
			             .log().all()
			      .when()
			             .get()
			      .then()
			             .log().all()
			             .spec(responseSpec).extract().response();
		
		boolean Resposta  = payload.then().extract().path("erro");
		System.out.println(Resposta);
		tarefaValidaDados.validaCepInexistente(Resposta);
		

	}
	
	
	
}
