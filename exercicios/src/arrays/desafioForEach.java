package arrays;

import java.util.Scanner;

public class desafioForEach {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quantas notas deseja cadastrar?");
		int numNotas = scanner.nextInt();

		double[] notas = new double[numNotas]; 
		
		for (int i = 0; i < numNotas; i++) {
			System.out.println("Digite a nota " + (i + 1) + ":");
			notas[i] = scanner.nextDouble();
		}


		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		double media = soma / numNotas;

		System.out.println("A média das notas é: " + media);

		scanner.close();

	}
}