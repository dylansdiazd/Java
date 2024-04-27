package iOSReplica;

public class iPhone implements reprodutorMusical, aparelhoTelefonico, navegadorInternet {
    private int bateria;
    private String modelo;
    private int capacidadeArmazenamento;

    public iPhone(String modelo, int capacidade) {
        this.modelo = modelo;
        this.capacidadeArmazenamento = capacidade;
        this.bateria = 100;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo música...");

    }

    public void pausar() {
        System.out.println("Pausando música...");

    }


    public void avancar() {
        System.out.println("Avançando música...");

    }


    public void retroceder() {
        System.out.println("Retrocedendo música...");

    }


    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");

    }
    
    
    public void desligar() {
        System.out.println("Desligando o telefone...");

    }

    
    public void discar(String numero) {
        System.out.println("Discando para " + numero + "...");

    }

 
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);

    }


    public void fecharPagina() {
        System.out.println("Fechando página...");

    }
}

