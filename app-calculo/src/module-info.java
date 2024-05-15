module appCalculo {

	exports appCalculo;
	requires transitive appLogging;
	
	exports appCalculo.interno to AppFinanceiro;
}