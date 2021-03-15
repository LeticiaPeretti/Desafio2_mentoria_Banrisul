package testBases.apiDeTarefas;

import org.junit.jupiter.api.Assertions;

public class TarefaValidaDados {
	
	public void ValidaDados(String resposta, String guardado) {
		
		Assertions.assertEquals(resposta, guardado);
	}

}
