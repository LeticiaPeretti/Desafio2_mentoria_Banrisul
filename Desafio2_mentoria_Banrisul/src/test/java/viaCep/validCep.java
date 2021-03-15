package viaCep;

import org.junit.jupiter.api.Test;

import Utils.FileOperations;
import io.restassured.response.Response;
import testBases.apiDeTarefas.TarefaValidaDados;
import testBases.viaCep.SimpleTestBase;

import static io.restassured.RestAssured.given;


public class validCep extends SimpleTestBase{
	
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
		
		String cepDaResposta  = payload.then().extract().path("cep");
		System.out.println("cepDaResposta" + cepDaResposta);
		String cepGuardado    = FileOperations.getProperties("contact").getProperty("cep");
		System.out.println("cepGuardado" + cepGuardado);
		tarefaValidaDados.ValidaDados(cepDaResposta, cepGuardado);
				
		
		String logradouroDaResposta  = payload.then().extract().path("logradouro");
		String logradouroGuardado  = FileOperations.getProperties("contact").getProperty("logradouro");
		tarefaValidaDados.ValidaDados(logradouroDaResposta, logradouroGuardado);
		
		
		String complementoDaResposta  = payload.then().extract().path("complemento");
		String complementoGuardado = FileOperations.getProperties("contact").getProperty("complemento");
		tarefaValidaDados.ValidaDados(complementoDaResposta, complementoGuardado);
		
		String bairroDaResposta  = payload.then().extract().path("bairro");
		String bairroGuardado    = FileOperations.getProperties("contact").getProperty("bairro");
		tarefaValidaDados.ValidaDados(bairroDaResposta, bairroGuardado);
		
		String localidadeDaResposta  = payload.then().extract().path("localidade");
		String localidadeGuardado  = FileOperations.getProperties("contact").getProperty("localidade");
		tarefaValidaDados.ValidaDados(localidadeDaResposta, localidadeGuardado);
		
		String ufDaResposta  = payload.then().extract().path("uf");
		String ufGuardado      = FileOperations.getProperties("contact").getProperty("uf");
		tarefaValidaDados.ValidaDados(ufDaResposta, ufGuardado);
		
		String ibgeDaResposta  = payload.then().extract().path("ibge");
		String ibgeGuardado    = FileOperations.getProperties("contact").getProperty("ibge");
		tarefaValidaDados.ValidaDados(ibgeDaResposta, ibgeGuardado);
		
		String giaDaResposta  = payload.then().extract().path("gia");
		String giaGuardado    = FileOperations.getProperties("contact").getProperty("gia");
		tarefaValidaDados.ValidaDados(giaDaResposta, giaGuardado);
		
		String dddDaResposta  = payload.then().extract().path("ddd");
		String dddGuardado    = FileOperations.getProperties("contact").getProperty("ddd");
		tarefaValidaDados.ValidaDados(dddDaResposta, dddGuardado);
		
		String siafiDaResposta  = payload.then().extract().path("siafi");
		String siafiGuardado    = FileOperations.getProperties("contact").getProperty("siafi");
		tarefaValidaDados.ValidaDados(siafiDaResposta, siafiGuardado);
		
		

	}
}
