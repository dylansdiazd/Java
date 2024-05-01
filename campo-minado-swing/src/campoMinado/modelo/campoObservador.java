package campoMinado.modelo;

@FunctionalInterface
public interface campoObservador {
	
	public void eventoOcorreu(campo c, campoEvento e); 

}
