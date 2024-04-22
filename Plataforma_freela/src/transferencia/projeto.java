package transferencia;

// Projeto.java
public class projeto {
    private static final double VALOR_PROJETO = 700.0;
    private static final double TAXA_DESCONTO = 0.04;

    public static void transferirValor(cliente cliente, freelancer freelancer, plataforma plataforma) {
        double valorDescontado = VALOR_PROJETO * TAXA_DESCONTO;
        double valorTransferido = VALOR_PROJETO - valorDescontado;

        double dinheiroCliente = cliente.getDinheiro();
        double dinheiroFreelancer = freelancer.getDinheiro();

        if (dinheiroCliente >= VALOR_PROJETO) {
            dinheiroCliente -= VALOR_PROJETO;
            dinheiroFreelancer += valorTransferido;

            cliente.setDinheiro(dinheiroCliente);
            freelancer.setDinheiro(dinheiroFreelancer);

            double disponivelParaGasto = plataforma.getDisponivelParaGasto();
            disponivelParaGasto += valorDescontado;
            plataforma.setDisponivelParaGasto(disponivelParaGasto);
        } else {
            System.out.println("O cliente não possui saldo suficiente para realizar a transferência.");
        }
    }
}
