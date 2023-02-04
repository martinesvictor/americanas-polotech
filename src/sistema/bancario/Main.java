package SistemaBancario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Sistema Bancário
            - Deposito
            - Sacar
            - Transferir

            - Transferir apenas se tiver saldo
            - Sacar apenas se tiver saldo

            - Todos os atributos tem que ser privados
         */
        int escolha = -1;

        Conta conta1 = new Conta(1);
        Conta conta2 = new Conta(2);

        while (escolha != 0) {
            Scanner scanner = new Scanner(System.in);

            System.out.println();
            System.out.println("Digite o valor da operção desejada:");
            System.out.println("1 - Sacar");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Transferir");
            System.out.println("0 - Finalizar sessão.");
            System.out.print("Realizar operação: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println();
                System.out.print("Digite o valor: ");
                double valor = scanner.nextDouble();
                conta1.sacar(valor);
                conta1.mostrarSaldo();
            } else if (escolha == 2) {
                System.out.println();
                System.out.print("Digite o valor: ");
                double valor = scanner.nextDouble();
                conta1.depositar(valor);
                conta1.mostrarSaldo();
            } else if (escolha == 3) {
                conta1.mostrarSaldo();
            } else if (escolha == 4) {
                System.out.print("Digite o valor: ");
                double valor = scanner.nextDouble();
                conta1.transferir(conta2, valor);
                System.out.println("Conta: " + conta1.getNumConta());
                conta1.mostrarSaldo();
                System.out.println("Conta: " + conta2.getNumConta());
                conta2.mostrarSaldo();
            }
        }
    }
}
