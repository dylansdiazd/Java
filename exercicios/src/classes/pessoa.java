package classes;

public class pessoa {
	
	String nome;
	double peso;
	
	pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(comida comida) {
		this.peso += comida.peso;
	}

	String apresentar() {
		return "Ola eu sou " + nome + " e tenho " + peso +"kg";
	}
}
