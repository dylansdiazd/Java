package appCalculo;

import appCalculo.interno.operacoesAritmeticas;
import appLogging.logger;

public class calculadora {

private operacoesAritmeticas opAritmeticas = new operacoesAritmeticas();

public double soma(double... nums) {
	logger.info("somando...");
	return opAritmeticas.soma(nums);
}

} 
