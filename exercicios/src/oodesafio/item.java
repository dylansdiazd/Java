package oodesafio;

import java.util.Random;

public class item {
    private produto produto;
    private int quantidade;
    private double precoTotal;

    // Construtor
    public item() {
        this.produto = gerarProdutoAleatorio();
        this.quantidade = gerarQuantidadeAleatoria();
        this.precoTotal = this.quantidade * this.produto.getValor();
    }

    // Método para gerar um produto aleatório
    private produto gerarProdutoAleatorio() {
        String[] nomes = {"Arroz", "Feijão", "Macarrão", "Azeite", "Leite", "Ovos", "Pão", "Café", "Açúcar", "Sal", "Farinha", "Banana", "Maçã", "Cebola", "Batata"};
        Random random = new Random();
        String nomeProduto = nomes[random.nextInt(nomes.length)];
        double valor = 1 + random.nextDouble() * 10; // Gera um valor aleatório entre 1 e 10
        return new produto(nomeProduto, valor);
    }

    // Método para gerar uma quantidade aleatória
    private int gerarQuantidadeAleatoria() {
        Random random = new Random();
        return random.nextInt(5) + 1; // Quantidade aleatória entre 1 e 5
    }

    // Métodos getters e setters
    public produto getProduto() {
        return produto;
    }

    public void setProduto(produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
}
