package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
    	String [] candidatos = {"João", "Maria", "Pedro", "Ana", "Carlos"};
    	for(String candidato: candidatos) {
    		entrandoEmContato(candidato);
    		
    	}
    }
    
    static void entrandoEmContato(String candidato) {
     int tentativasRealizadas = 1;
     boolean continuarTentando = true;
     boolean atendeu = false;
     
     do {
    	 atendeu = atender();
    	 continuarTentando = !atendeu;
    	 if(continuarTentando) {
    		 tentativasRealizadas++;
    	 } else {
    		 System.out.println("Contatao realizado com sucesso.");
    	 }
    	 
    	 }while(continuarTentando && tentativasRealizadas < 3);
     
     if(atendeu) {
    	 System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
     } else {
    	 System.out.println("Não conseguimos contato com " + candidato + " numero maximo de tentativas " + tentativasRealizadas + " realizada.");
     }
    }
    
    static boolean atender() {
    	return new Random().nextInt(3)==1;
    }
    
    static void imprimirSelecionados() {
    	String [] candidatos = {"João", "Maria", "Pedro", "Ana", "Carlos"};
    	
    	System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
    	
    	for(int indice=0; indice < candidatos.length; indice++) {
    		System.out.println("O candidato de Numero " + (indice+1) + " é o " + candidatos[indice]);
    	}
    }

    static void selecaoCandidatos() {
        // Lista de candidatos
        String[] candidatos = {"João", "Maria", "Pedro", "Ana", "Carlos", "Juliana", "Lucas", "Mariana", "Gustavo", "Larissa"};

        // Variáveis de controle
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        // Loop para seleção de candidatos
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido(); // Gera um valor de salário pretendido

            // Exibe informações sobre o candidato e seu salário pretendido
            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);

            // Verifica se o candidato foi selecionado com base no salário base e pretendido
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    // Gera um valor de salário pretendido aleatório entre 1800 e 2200
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // Função para analisar o candidato com base no salário pretendido
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        
        // Analisa o candidato com base no salário pretendido e no salário base
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }
}
