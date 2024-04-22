package campoMinado.modelo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class campoTeste {
	
	private campo campo = new campo(3, 3);
	
	void testeVizinhoDist1() {
		campo vizinho = new campo(3, 2);
		
	boolean resultado = campo.adicionarVizinho(vizinho);
	
	@test
	assertTrue(resultado);
		
	}

}
