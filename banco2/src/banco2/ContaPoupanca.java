package banco2;

public class ContaPoupanca extends Conta {

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Poupanca");
		super.imprimirInfosComuns();
		
	}
	
}
