package viaCep;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Utils.FileOperations;
import io.restassured.response.Response;
import testBases.apiDeTarefas.TarefaValidaDados;
import testBases.viaCep.ValidaEnderecoTestBase;

public class validaEndereco extends ValidaEnderecoTestBase{
	
	private static TarefaValidaDados tarefaValidaDados = new TarefaValidaDados();
	public static String[] cepExpected = {"94085-170" , "94175-000"};
	public static String[] logradouroExpected = {"Rua Ari Barroso" , "Rua Almirante Barroso"};
	public static String[] complementoExpected = {"" , ""};
	public static String[] bairroExpected = {"Morada do Vale I" , "Recanto Corcunda"};
	public static String[] localidadeExpected = {"Gravataí" , "Gravataí"};
	public static String[] ufExpected = {"RS" , "RS"};
	public static String[] ibgeExpected = {"4309209" , "4309209"};
	public static String[] giaExpected = {"" , ""};
	public static String[] dddExpected = {"51" , "51"};
	public static String[] siafiExpected = {"8683" , "8683"};
	
	@Test
	public void extraViaCepNovoFormato() {
		Response payload =
		 given()
         .spec(requestSpec)
              .log().all()
         .when()
              .get()
         .then()
                .log().all()
         .spec(responseSpec).extract().response();
		
		
		ArrayList<String> cepDaResposta         = payload.then().extract().path("cep");
		tarefaValidaDados.validaEndereco(cepDaResposta, cepExpected);
		ArrayList<String> logradouroDaResposta  = payload.then().extract().path("logradouro");
		tarefaValidaDados.validaEndereco(logradouroDaResposta, logradouroExpected);
		ArrayList<String> complementoDaResposta = payload.then().extract().path("complemento");
		tarefaValidaDados.validaEndereco(complementoDaResposta, complementoExpected);
		ArrayList<String> bairroDaResposta      = payload.then().extract().path("bairro");
		tarefaValidaDados.validaEndereco(bairroDaResposta, bairroExpected);
		ArrayList<String> localidadeDaResposta  = payload.then().extract().path("localidade");
		tarefaValidaDados.validaEndereco(localidadeDaResposta, localidadeExpected);
		ArrayList<String> ufDaResposta          = payload.then().extract().path("uf");
		tarefaValidaDados.validaEndereco(ufDaResposta, ufExpected);
		ArrayList<String> ibgeDaResposta        = payload.then().extract().path("ibge");
		tarefaValidaDados.validaEndereco(ibgeDaResposta, ibgeExpected);
		ArrayList<String> giaDaResposta         = payload.then().extract().path("gia");
		tarefaValidaDados.validaEndereco(giaDaResposta, giaExpected);
		ArrayList<String> dddDaResposta         = payload.then().extract().path("ddd");
		tarefaValidaDados.validaEndereco(dddDaResposta, dddExpected);
		ArrayList<String> siafiDaResposta       = payload.then().extract().path("siafi");
		tarefaValidaDados.validaEndereco(siafiDaResposta, siafiExpected);
		   
	}
}
