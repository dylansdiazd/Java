package transferencia;

// main.java
public class main {
    public static void main(String[] args) {
        cliente cliente = new cliente();
        cliente.setDinheiro(2000.0); // Definindo o dinheiro do cliente como 2000.0

        freelancer freelancer = new freelancer();
        freelancer.setDinheiro(500.0); // Definindo o dinheiro do freelancer como 500.0

        plataforma plataforma = new plataforma();

        projeto.transferirValor(cliente, freelancer, plataforma);

        banco banco = new banco();

        double saldoTotal = banco.calcularSaldoTotal(cliente, freelancer, plataforma);
        System.out.println("Saldo total no banco: R$" + saldoTotal);

        double saldoCliente = cliente.getDinheiro();
        System.out.println("Saldo do cliente: R$" + saldoCliente);

        double saldoFreelancer = freelancer.getDinheiro();
        System.out.println("Saldo do freelancer: R$" + saldoFreelancer);

        double saldoDisponivelParaGasto = plataforma.getDisponivelParaGasto();
        System.out.println("Saldo disponível para gasto na plataforma: R$" + saldoDisponivelParaGasto);
    }
}
