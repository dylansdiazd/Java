package fundamentos;

import java.util.Scanner;

public class fahrenheitParaCelcius {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit:");
		double temp = entrada.nextDouble();
		
		
		  double cel = (temp - 32) / 1.8;
		  
		  System.out.printf("Sua temperatura convertida é: %f", cel);
		  entrada.close();
	}

}
