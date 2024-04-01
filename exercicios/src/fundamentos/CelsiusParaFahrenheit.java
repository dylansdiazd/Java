package fundamentos;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira temperatura em Celsius");
		double temp = entrada.nextDouble();
		
		double f = (temp * 1.8) + 32;
		
		System.out.printf("Temperatura convertida: %f", f);
		
		entrada.close();
		
	}

}
