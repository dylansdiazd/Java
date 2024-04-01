package fundamentos;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira um numero de 1 a 7:");
		
		int dia = entrada.nextInt();
		
		if(dia == 1) {
			
			System.out.println("Domingo");
			
		} else if(dia == 2) {
			System.out.println("Segunda");
		} else if (dia == 3 ) {
			System.out.println("Terça");
		} else if (dia == 4) {
			System.out.println("Quarta");
		} else if (dia == 5) {
			System.out.println("Quinta");
		} else if (dia == 6) {
		 System.out.println("Sexta");
		} else if (dia == 7) {
			System.out.println("Sabado");
			
		} else {
			System.out.println("Numero Invalido!");
		}
		
		entrada.close();
	}
	
}
