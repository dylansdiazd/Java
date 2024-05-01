package campoMinado.visao;
import javax.swing.JFrame;

import campoMinado.modelo.tabuleiro;

@SuppressWarnings("serial")
public class telaPrincipal extends JFrame {
	
	public telaPrincipal() {
		tabuleiro tabuleiro = new tabuleiro(16, 30, 50);
    	add(new painelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setSize(690, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new telaPrincipal();
	}

}
