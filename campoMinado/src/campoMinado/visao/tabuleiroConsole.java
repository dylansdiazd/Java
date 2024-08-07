package campoMinado.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import campoMinado.execao.explosaoException;
import campoMinado.execao.sairException;
import campoMinado.modelo.tabuleiro;

public class tabuleiroConsole {
	
	private tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);
	
	public tabuleiroConsole(tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			
			while(continuar) {
				cicloDoJogo();
				
				System.out.println("Outra partida? (S/n)");
				String resposta = entrada.nextLine();
				
				if("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();	
				}
			}
		} catch (sairException e) {
			System.out.println("Tchau!!!");
		} finally {
			entrada.close();
		}
		
	}

	private void cicloDoJogo() {
		try {
			
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (x, y):");
				
				
                Iterator<Integer> xy = Arrays.stream(digitado.split(","))
                .map(e -> Integer.parseInt(e.trim())).iterator();
                
        		digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar:");
        		
        		if("1".equals(digitado)) {
        			tabuleiro.abrir(xy.next(), xy.next());
        		} else if ("2".equals(digitado)) {
        			tabuleiro.alternarMarcacao(xy.next(), xy.next());
        		}
               
			}
			System.out.println(tabuleiro);
			System.out.println("Você ganhou!");
		} catch(explosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Você perdeu!");
		}
	}

 private String capturarValorDigitado(String texto) {
	 System.out.println(texto);
	 String digitado = entrada.nextLine();
	 
	 if("sair".equalsIgnoreCase(digitado)) {
		 throw new sairException();
	 }
	 
	 return digitado;
 }
}