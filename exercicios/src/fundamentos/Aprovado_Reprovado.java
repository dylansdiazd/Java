package fundamentos;

import java.util.Scanner;

public class Aprovado_Reprovado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String cond = "";
		int nAlunos = 0;
		int cont = 0;
		
		System.out.println("Deseja Cadastrar algum aluno?");
		 cond = entrada.nextLine();
		 
		 if(cond.equalsIgnoreCase("sim")) {
			 System.out.println("Quantos alunos deseja cadastrar");
			 nAlunos = entrada.nextInt();

		 while (cont <= nAlunos) {	
			 
			System.out.println("Insira o nome do Aluno");
			String nome = entrada.next();

			System.out.printf("Digite a media de %s ", nome);
			double media = entrada.nextDouble();

			if (media > 0 && media < 5) {
				System.out.printf("%s esta REPROVADO!", nome);
			} else if (media == 5) {
				System.out.printf("%s esta de RECUPERAÇÂO!", nome);
			} else if (media > 5 && media <= 10) {
				System.out.printf("%s esta APROVADO!", nome);
			} else { 
				 System.out.println("Insira uma media entra 0 e 10.");
				 cont += nAlunos;
			}
			
			cont++;
			 
				}
		 }
		 
		 System.out.println("Você encerrou o programa.");
		

		entrada.close();
	}

}
