package fundamentos;

import java.util.Scanner;

public class console {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ola, Meu nome é Dylan, Eu sou uma inteligência artificial desenvolvida por Dylan Diaz e estou aqui para ajudar em que for preciso.");
		System.out.println("Mas antes precisamos fazer um cadastro, vamos começar?");
		
		System.out.println("Para começar, diga seu primeiro nome:  ");
		String nome = entrada.nextLine();
		
		System.out.println("Agora, me diga seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.printf("Ola %s %s, é um prazer conhecer você! ", nome, sobrenome);
		
		System.out.println("Quantos anos você tem?");
		int idade = entrada.nextInt();
		
		System.out.printf("Certo! seu nome é %s %s e sua idade é de %d anos ", nome, sobrenome, idade);
		System.out.println("Seu cadastro esta completo.");
		
		entrada.close();
		
	}

}
