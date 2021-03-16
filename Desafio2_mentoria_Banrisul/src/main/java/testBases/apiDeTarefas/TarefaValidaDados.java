package testBases.apiDeTarefas;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Assertions;

import io.restassured.response.Response;

public class TarefaValidaDados {
	
	public static String MensagemErro = "Erro 400 Ops! Verifique a sua URL (Bad Request)";
	
	
	
	public void ValidaDados(String resposta, String guardado) {
		
	   Assertions.assertEquals(resposta, guardado);
	}
	
	
	public void validaCepInexistente(boolean erro) {
		
		Assertions.assertTrue(erro); 
	}
	
	public void validaCepFormatoInvalido (String mensagem) {
		
		Assertions.assertEquals(MensagemErro, mensagem);
	}
	
	
	public void validaMensagemCepFormatoInvalido(Response payload) {
		String   html       = payload.asString();
		Document document   = Jsoup.parse(html);			
		String   mensagem   = document.body().text();
		
		
		/*
		Element tagH1 = document.select("h1").first();		
		String mensagem2   = tagH1.text();
		System.out.println("Usando tag " + mensagem2); */
		
		
		Assertions.assertEquals(MensagemErro, mensagem);
		
	}
	
	public void validaEndereco(ArrayList<String> resposta, String[] esperado) {
		
		Assertions.assertArrayEquals(esperado, resposta.toArray());
		
	}

}
