package fundamentos;

import java.util.Scanner;

public class calculadoraSilmples {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Insira o primeiro valor:");
		double n1 = entrada.nextDouble();
		
		System.out.println("Insira o operador:");
		String operador = entrada.next();
		
		System.out.println("Insira o segundo valor:");
		double n2 = entrada.nextDouble();
		

		double calculo = "+".equals(operador) ? n1 + n2 : 0;
		calculo = "-".equals(operador) ? n1 - n2 : calculo;
		calculo = "*".equals(operador) ? n1 * n2 : calculo;
		calculo = "/".equals(operador) ? n1 / n2 : calculo;
		
		System.out.printf("%.2f %s %.2f = %.2f", n1 , operador, n2, calculo);
		
		
		
		entrada.close();
	}
	
}
