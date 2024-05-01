package campoMinado.modelo;

import java.util.ArrayList;
import java.util.List;


public class campo {

	private int linha;
	private int coluna;

	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;

	private List<campo> vizinhos = new ArrayList<>();
	private List<campoObservador> observadores = new ArrayList<>();
	

	campo(int linha, int coluna) {
		this.linha = linha; 
		this.coluna = coluna;
	}

	public void registrarObservador(campoObservador observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(campoEvento evento) {
		observadores.stream().forEach(o -> o.eventoOcorreu(this, evento));
	}
	
	boolean adicionarVizinho(campo vizinho) {
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;

		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int detalGeral = deltaColuna + deltaLinha;

		if (detalGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if (detalGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}

	public void alternarMarcacao() {
		if (!aberto) {
			marcado = !marcado;
			
			if(marcado) {
				notificarObservadores(campoEvento.MARCAR);
			} else {
				notificarObservadores(campoEvento.DESMARCAR);
			}
		}

	}

	public boolean abrir() {

		if (!aberto && !marcado) {

			if (minado) {
			notificarObservadores(campoEvento.EXPLODIR);
			return true;
			}
			
			setAberto(true);

			if (vizinhacaSegura()) {
				vizinhos.forEach(V -> V.abrir());
			}
			return true;
		} else {
			return false;
		}

	}

	public boolean vizinhacaSegura() {
		return vizinhos.stream().noneMatch(V -> V.minado);
	}

	void minar() {
		minado = true;
	}
	
	public boolean isMinado() {
		return minado;
	}

	public boolean isMarcado() {

		return marcado;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
		if(aberto) {
			notificarObservadores(campoEvento.ABRIR);
		}
	}

	public boolean isAberto() {
		 return aberto;
	 }
	
	public boolean isFechado() {
		return !isAberto();
	}

	public int getLinha() {
		return linha;
	}
	
	public int getColuna() {
		return coluna;
	}
	
	boolean objetivoAlcancado() {
		boolean devendado = !minado && aberto; 
		boolean protegido = minado && marcado;
		return devendado || protegido;
	}
	
	public int  minasNaVizinhanca() {
		return (int) vizinhos.stream().filter(V -> V.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
		
		notificarObservadores(campoEvento.REINICIAR);
	}
	

}


