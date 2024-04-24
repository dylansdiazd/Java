import java.util.Scanner;

public class ContaTerminal {
    private String nome;
    private String numeroConta;
    private int digitoAgencia;
    private double saldo;

    // Construtor da classe
    public ContaTerminal(String nome, String numeroConta, int digitoAgencia, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.digitoAgencia = digitoAgencia;
        this.saldo = saldo;
    }

    // Método para exibir informações da conta
    public void exibirInfoConta() {
        System.out.println("Nome do titular: " + nome);
        System.out.println("Número da conta: " + numeroConta + "-" + digitoAgencia);
        System.out.println("Saldo: R$" + saldo);
    }

    // Método para depositar dinheiro na conta
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    // Método para sacar dinheiro da conta
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados da conta ao usuário
        System.out.println("Informe o nome do titular da conta:");
        String nomeTitular = scanner.nextLine();

        System.out.println("Informe o número da conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Informe o dígito da agência:");
        int digitoAgencia = scanner.nextInt();

        System.out.println("Informe o saldo inicial da conta:");
        double saldoInicial = scanner.nextDouble();

        // Cria uma instância da classe ContaTerminal com os dados fornecidos
        ContaTerminal conta = new ContaTerminal(nomeTitular, numeroConta, digitoAgencia, saldoInicial);

        // Exibe as informações da conta criada
        System.out.println("\nInformações da conta criada:");
        conta.exibirInfoConta();

        // Exibe a mensagem de agradecimento
        System.out.println("\nOlá " + nomeTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + digitoAgencia + ", conta " + numeroConta + "-" + digitoAgencia + " e seu saldo R$" + saldoInicial + " já está disponível para saque.");

        // Fecha o scanner
        scanner.close();
    }
}
