package banco2;

public interface iConta {
	
	
	 void sacar(double valor);
	
     void depositar(double valor);
	
	 void transferir(double valor, Conta contaDestino);
	 
	 void imprimirExtrato(); 

}
