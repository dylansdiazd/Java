package campoMinado;

import campoMinado.modelo.tabuleiro;
import campoMinado.visao.tabuleiroConsole;

public class aplicacao {
 public static void main(String[] args) {
	tabuleiro tabuleiro = new tabuleiro(6, 6, 6);
	
	new tabuleiroConsole(tabuleiro);
}
}
