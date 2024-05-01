package campoMinado.visao;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import campoMinado.modelo.tabuleiro;

@SuppressWarnings("serial")
public class painelTabuleiro extends JPanel {

	public painelTabuleiro(tabuleiro tabuleiro) {

		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new botaoCampo(c)));
		
		tabuleiro.registrarObservador(e -> {
			
			SwingUtilities.invokeLater(() -> {
			if(e.isGanhou()) {
				JOptionPane.showMessageDialog(this, "Você Ganhou!");
			} else {
				JOptionPane.showMessageDialog(this, "Você Perdeu!");
			}
			
			tabuleiro.reiniciar();
			});
		});

		
		
		
	}	
}
