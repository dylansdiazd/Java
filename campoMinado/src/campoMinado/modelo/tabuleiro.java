package campoMinado.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import campoMinado.execao.explosaoException;

public class tabuleiro {

	private int linhas;
	private int colunas;
	private int minas;
	
	private final List<campo> campos = new ArrayList<>();
	
	public tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}
	
	public void abrir (int linha, int coluna) {
	try {
		campos.parallelStream()
		  .filter(C -> C.getLinha() == linha && C.getColuna() == coluna)
		  .findFirst()
		  .ifPresent(C -> C.abrir());
	} catch (explosaoException e) {
		campos.forEach(C -> C.setAberto(true));
		throw e;
	}
	}
	
	public void alternarMarcacao (int linha, int coluna) {
		campos.parallelStream()
		  .filter(C -> C.getLinha() == linha && C.getColuna() == coluna)
		  .findFirst()
		  .ifPresent(C -> C.alterarMarcacao());
	}

	private void gerarCampos() {
		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; c++) {
				campos.add(new campo (l, c));
			}
		}
		
	}

	private void associarVizinhos() {
		for(campo c1: campos) {
			for (campo c2: campos) {
				c1.adicionarVizinho(c2);
			}
		}
		
	}

	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<campo> minado = c -> c.isMinado();
		
		do {
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
			
		} while(minasArmadas < minas);
	}
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(C -> C.objetivoAlcancado());
	}
	
	public void reiniciar() {
		campos.stream().forEach(C -> C.reiniciar());
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("  ");
		for (int c = 0; c < colunas; c++) {
			sb.append(" ");
			sb.append(c);
			sb.append(" ");
		}
		
		sb.append("\n");
		
		int i = 0;
		for (int l = 0; l < linhas; l++) {
			sb.append(l);
			sb.append(" ");
			
			for(int c = 0; c < colunas; c++) {
				sb.append(" ");
				sb.append(campos.get(i));
				sb.append(" ");
				i++;
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
}
