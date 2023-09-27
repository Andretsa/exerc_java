package banco;

import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();

        while (true) {
            System.out.println(
                    "Menu:\n" +
                            "1. Consultar saldo \n" +
                            "2. Depositar \n" +
                            "3. Sacar \n" +
                            "4. Transferir \n" +
                            "5. Sair \n" +
                            "Escolha uma opção: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Digite o valor a ser depositado: R$");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso.");
                    break;
                case 3:
                    System.out.print("Digite o valor a ser sacado: R$");
                    double valorSaque = scanner.nextDouble();
                    if (conta.sacar(valorSaque)) {
                        System.out.println("Saque de R$" + valorSaque + " realizado com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente para saque.");
                    }
                    break;
                case 4:
                    System.out.print("Digite o valor a ser transferido: R$");
                    double valorTransferencia = scanner.nextDouble();
                    System.out.print("Digite o número da conta de destino: ");
                    int contaDestino = scanner.nextInt();

                    Conta contaDestinoObj = new Conta(); // Crio uma instancia para a conta destino?
                    if (conta.transferir(valorTransferencia, contaDestinoObj)) {
                        System.out.println("Transferência de R$" + valorTransferencia +
                                " para a conta " + contaDestino + " realizada com sucesso.");
                    } else {
                        System.out.println("Saldo insuficiente para transferência.");
                    }
                    break;
                case 5:
                    System.out.println("Saindo do sistema bancário. Obrigado!");
                    System.exit(0);// Fecha o sistema bancário e quebra o while
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
    }
}
