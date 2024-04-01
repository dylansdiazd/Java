package oodesafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class produto {
    private String nome;
    private double valor;

    // Construtor
    public produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    // Método para gerar uma lista com 15 produtos aleatórios
    public static List<produto> gerarListaDeProdutos() {
        List<produto> produtos = new ArrayList<>();
        String[] nomes = {"Arroz", "Feijão", "Macarrão", "Azeite", "Leite", "Ovos", "Pão", "Café", "Açúcar", "Sal", "Farinha", "Banana", "Maçã", "Cebola", "Batata"};
        Random random = new Random();
        
        for (int i = 0; i < 15; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            double valor = 1 + random.nextDouble() * 10; // Gera um valor aleatório entre 1 e 10
            produto produto = new produto(nome, valor);
            produtos.add(produto);
        }
        
        return produtos;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

