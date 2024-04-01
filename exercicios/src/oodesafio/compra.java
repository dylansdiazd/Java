package oodesafio;

import java.util.ArrayList;
import java.util.List;

public class compra {
    private cliente cliente;
    private List<item> carrinho;

    // Construtor
    public compra(cliente cliente) {
        this.cliente = cliente;
        this.carrinho = new ArrayList<>();
        criarCarrinho();
    }

    // Método para criar o carrinho para o cliente
    private void criarCarrinho() {
        for (int i = 0; i < 4; i++) {
            item novoItem = new item();
            carrinho.add(novoItem);
        }
    }

    // Método para calcular o valor total da compra
    public double calcularValorTotal() {
        double valorTotal = 0;
        for (item item : carrinho) {
            valorTotal += item.getPrecoTotal();
        }
        return valorTotal;
    }

    // Método para mostrar no console o valor pago pelo cliente
    public void mostrarValorPago() {
        double valorTotal = calcularValorTotal();
        String valorFormatado = String.format("%.2f", valorTotal); // Formata o valor com duas casas decimais
        System.out.println("O cliente " + cliente.getNome() + " pagou: R$" + valorFormatado);
    }

    // Método main para executar o programa
    public static void main(String[] args) {
        // Criar clientes
        cliente cliente1 = new cliente();
        cliente cliente2 = new cliente();

        // Criar compras para cada cliente
        compra compraCliente1 = new compra(cliente1);
        compra compraCliente2 = new compra(cliente2);

        // Mostrar valor pago por cada cliente
        compraCliente1.mostrarValorPago();
        compraCliente2.mostrarValorPago();
    }
}
