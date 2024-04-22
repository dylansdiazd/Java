package campoMinado.modelo;

import java.util.ArrayList;
import java.util.List;

import campoMinado.execao.explosaoException;

public class campo {

	private int linha;
	private int coluna;

	private boolean aberto;
	private boolean minado;
	private boolean marcado;

	private List<campo> vizinhos = new ArrayList<>();

	campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
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

	void alterarMarcacao() {
		if (!aberto) {
			marcado = !marcado;
		}

	}

	boolean abrir() {

		if (!aberto && !marcado) {
			aberto = true;

			if (minado) {
				throw new explosaoException();
			}

			if (vizinhacaSegura()) {
				vizinhos.forEach(V -> V.abrir());
			}
			return true;
		} else {
			return false;
		}

	}

	boolean vizinhacaSegura() {
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
	
	long minasNaVizinhanca() {
		return vizinhos.stream().filter(V -> V.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	public String toString() {
		if(marcado) {
			return "x";
		} else if (aberto && minado) {
			return "*";
		} else if (aberto && minasNaVizinhanca() > 0 ) {
			return Long.toString(minasNaVizinhanca());
		} else if (aberto) {
			return " ";
		} else {
			return "?";
		}
	}
}


