package viaCep;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import Utils.FileOperations;
import io.restassured.response.Response;
import testBases.apiDeTarefas.TarefaValidaDados;
import testBases.viaCep.ValidaCepTestBase;

import static io.restassured.RestAssured.given;

@RunWith(JUnitPlatform.class)
public class validaCep extends ValidaCepTestBase{
	
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
	    FileOperations.setProperties("contact", "cep", cepDaResposta);
	    String cepGuardado = FileOperations.getProperties("contact").getProperty("cep");
		tarefaValidaDados.ValidaDados(cepDaResposta, cepGuardado);
				
		
		String logradouroDaResposta  = payload.then().extract().path("logradouro");		
		FileOperations.setProperties("contact", "logradouro", logradouroDaResposta);
		String logradouroGuardado = FileOperations.getProperties("contact").getProperty("logradouro");
		tarefaValidaDados.ValidaDados(logradouroDaResposta, logradouroGuardado);
		

		
		String complementoDaResposta  = payload.then().extract().path("complemento");
		FileOperations.setProperties("contact", "complemento", complementoDaResposta);
		String complementoGuardado = FileOperations.getProperties("contact").getProperty("complemento");
		tarefaValidaDados.ValidaDados(complementoDaResposta, complementoGuardado);
		

		
		String bairroDaResposta  = payload.then().extract().path("bairro");
		FileOperations.setProperties("contact", "bairro", bairroDaResposta);
		String bairroGuardado = FileOperations.getProperties("contact").getProperty("bairro");
		tarefaValidaDados.ValidaDados(bairroDaResposta, bairroGuardado);	
		
		
		String localidadeDaResposta  = payload.then().extract().path("localidade");		
		FileOperations.setProperties("contact", "localidade", localidadeDaResposta);
		String localidadeGuardado = FileOperations.getProperties("contact").getProperty("localidade");
		tarefaValidaDados.ValidaDados(localidadeDaResposta, localidadeGuardado);
		
			
		String ufDaResposta  = payload.then().extract().path("uf");			
		FileOperations.setProperties("contact", "uf", ufDaResposta);
		String ufGuardado = FileOperations.getProperties("contact").getProperty("uf");
		tarefaValidaDados.ValidaDados(ufDaResposta, ufGuardado);
		
		
		String ibgeDaResposta  = payload.then().extract().path("ibge");
		FileOperations.setProperties("contact", "ibge", ibgeDaResposta);
		String ibgeGuardado = FileOperations.getProperties("contact").getProperty("ibge");
		tarefaValidaDados.ValidaDados(ibgeDaResposta, ibgeGuardado);
		
		
		
		String giaDaResposta  = payload.then().extract().path("gia");
		FileOperations.setProperties("contact", "gia", giaDaResposta);
		String giaGuardado = FileOperations.getProperties("contact").getProperty("gia");
		tarefaValidaDados.ValidaDados(giaDaResposta, giaGuardado);
		
		
		String dddDaResposta  = payload.then().extract().path("ddd");
		FileOperations.setProperties("contact", "ddd", dddDaResposta);
		String dddGuardado = FileOperations.getProperties("contact").getProperty("ddd");
		tarefaValidaDados.ValidaDados(dddDaResposta, dddGuardado);
		
		
		String siafiDaResposta  = payload.then().extract().path("siafi");
		FileOperations.setProperties("contact", "siafi", siafiDaResposta);
		String siafiGuardado = FileOperations.getProperties("contact").getProperty("siafi");
		tarefaValidaDados.ValidaDados(siafiDaResposta, siafiGuardado);
		

	}
}
