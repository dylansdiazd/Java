package fundamentos;

import java.util.Scanner;

public class salarios {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro salario");
		String salario1 = entrada.nextLine().replace("," , ".");
		
		System.out.println("Digite o segundo salario");
		String salario2 = entrada.nextLine().replace("," , ".");
		
		System.out.println("Digite o terceiro salario");
		String salario3 = entrada.nextLine().replace("," , ".");
		
		
		double salario1Convertido = Double.parseDouble(salario1);
		double salario2Convertido = Double.parseDouble(salario2);
		double salario3Convertido = Double.parseDouble(salario3);
		
		double media = (salario1Convertido + salario2Convertido + salario3Convertido)/3;
		
		
		System.out.printf("A media é de %.2f",media);
		
		
		entrada.close();
	}

	
   
}
