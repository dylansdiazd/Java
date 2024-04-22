package transferencia;

// Banco.java
public class banco {
    public double calcularSaldoTotal(cliente cliente, freelancer freelancer, plataforma plataforma) {
        double saldoCliente = cliente.getDinheiro();
        double saldoFreelancer = freelancer.getDinheiro();
        double disponivelParaGasto = plataforma.getDisponivelParaGasto();
        double saldoPlataforma = saldoCliente + saldoFreelancer + disponivelParaGasto;

        return saldoPlataforma;
    }
}
