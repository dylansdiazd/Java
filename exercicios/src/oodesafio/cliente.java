package oodesafio;
import java.util.Random;

public class cliente {
    private String nome;
    private double dinheiro;

    // Construtor
    public cliente() {
        this.nome = gerarNomeAleatorio();
        this.dinheiro = gerarDinheiroAleatorio();
    }

    // Método para gerar um nome aleatório
    private String gerarNomeAleatorio() {
        String[] nomes = {"Alice", "Bob", "Carol", "David", "Emma", "Frank", "Grace", "Henry", "Isabella", "Jack"};
        Random random = new Random();
        return nomes[random.nextInt(nomes.length)];
    }

    // Método para gerar um valor de dinheiro aleatório entre 100 e 300
    private double gerarDinheiroAleatorio() {
        Random random = new Random();
        return 100 + random.nextDouble() * 200; // Gera um número aleatório entre 100 e 300
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
}

