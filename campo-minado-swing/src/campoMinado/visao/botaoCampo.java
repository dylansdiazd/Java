package campoMinado.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import campoMinado.modelo.campo;
import campoMinado.modelo.campoEvento;
import campoMinado.modelo.campoObservador;

@SuppressWarnings("serial")
public class botaoCampo extends JButton implements campoObservador, MouseListener{
	
	private final Color BG_PADRAO = new Color(184, 184, 184);
	private final Color BG_MARCAR = new Color(8, 179, 247);
	private final Color BG_EXPLODIR = new Color(189, 66, 68);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);
	
	private campo campo;
	
	public botaoCampo(campo campo) {
		campo.registrarObservador(this);
		this.campo = campo;
		setBackground(BG_PADRAO);
		setOpaque(true);
		setBorder(BorderFactory.createBevelBorder(0));
		
		addMouseListener(this);
		campo.registrarObservador(this);
	}

	@Override
	public void eventoOcorreu(campo campo, campoEvento evento) {
		switch(evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case EXPLODIR:
			aplicarEstiloExplodir();
			break;
    	default:
    		aplicarEstiloPadrao();
			
		}
		
		SwingUtilities.invokeLater(() ->{
			repaint();
			validate();
		});
	}

	private void aplicarEstiloPadrao() {
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(0));
		setText("");
		
	}

	private void aplicarEstiloExplodir() {
		setBackground(BG_EXPLODIR);
		setText("X");
		
	}

	private void aplicarEstiloMarcar() {
		setBackground(BG_MARCAR);
		setText("M");
		
	}

	private void aplicarEstiloAbrir() {
		
	    setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
	    if(campo.isMinado()) {
			setBackground(BG_EXPLODIR);
			return;
		}
		
      setBackground(BG_PADRAO);

      
      switch (campo.minasNaVizinhanca()) {
      case 1:
    	  setForeground(TEXTO_VERDE);
    	  break;
      case 2:
    	  setForeground(Color.BLUE);
    	  break;
      case 3:
    	  setForeground(Color.YELLOW);
    	  break;
      case 4:
      case 5:
      case 6:
    	  setForeground(Color.RED);
    	  break;
      default:
    	  setForeground(Color.PINK);
      }
      
      String valor = !campo.vizinhacaSegura() ? campo.minasNaVizinhanca() + "" : "";
      setText(valor);
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getButton() == 1) {
			campo.abrir();
		}else {
			campo.alternarMarcacao();
		}
	}
	
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
}
