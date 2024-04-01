package fundamentos;

import java.util.Scanner;

public class calcIMC {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println();

		System.out.println("Insira seu peso");
		double peso = entrada.nextDouble();

		System.out.println("Insira sua altura");
		double altura = entrada.nextDouble();

		double imc = peso / (altura * altura);

		System.out.printf("Seu IMC é: %f", imc);

		entrada.close();
	}

}
