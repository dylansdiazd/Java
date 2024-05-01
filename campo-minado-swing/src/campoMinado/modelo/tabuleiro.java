package campoMinado.modelo;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;



public class tabuleiro implements campoObservador{

	private final int linhas;
	private final int colunas;
	private final int minas;
	
	private final List<campo> campos = new ArrayList<>();
	private final List<Consumer<resultadoEvento>> observadores = new ArrayList<>();
	
	public tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;
			
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}
	
	public void paraCadaCampo(Consumer<campo> funcao) {
		campos.forEach(funcao);
		
	}
	
	public void registrarObservador(Consumer<resultadoEvento> observador) {
		observadores.add(observador);
	}
	
	private void notificarObservadores(boolean resultado) {
		observadores.stream().forEach(o -> o.accept(new resultadoEvento(resultado)));
	}
	
	public void abrir (int linha, int coluna) {
		campos.parallelStream()
		  .filter(C -> C.getLinha() == linha && C.getColuna() == coluna)
		  .findFirst()
		  .ifPresent(C -> C.abrir());
		}
	
	public void alternarMarcacao (int linha, int coluna) {
		campos.parallelStream()
		  .filter(C -> C.getLinha() == linha && C.getColuna() == coluna)
		  .findFirst()
		  .ifPresent(C -> C.alternarMarcacao());
	}

	private void gerarCampos() {
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				campo campo = new campo(linha, coluna);
				campo.registrarObservador(this);
				campos.add(campo);
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
	
	
	
	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}

	public void reiniciar() {
		    campos.forEach(C -> C.reiniciar());
		    sortearMinas();
		}
	
	public void eventoOcorreu(campo campo, campoEvento evento) {
		if(evento == campoEvento.EXPLODIR) {
			mostrarMinas();
			notificarObservadores(false);
		} else if(objetivoAlcancado()) {
			notificarObservadores(true);
			
		}
	}
	
	private void mostrarMinas() {
		campos.stream()
		.filter(c -> c.isMinado())
		.filter(c -> c.isMarcado())
		.forEach(c -> c.setAberto(true));
	}
}
