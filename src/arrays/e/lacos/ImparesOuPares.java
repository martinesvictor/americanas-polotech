package ArraysELacos;


import java.util.Scanner;

public class ImparesOuPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valores[] = new int[5];
        int par = 0, impar = 0;

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o %dº valor: ", i + 1);
            valores[i] = scanner.nextInt();
            if (valores[i] % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }

        if (impar == 0) {
            System.out.print("Nenhum valor ímpar digitado.");
        } else {
            System.out.print("Valores ímpares digitados: ");
            for (int i = 0; i < valores.length; i++) {
                if (valores[i] % 2 == 1 || valores[i] % 2 == -1) {
                    System.out.print(valores[i] + " ");
                }
            }
        }

        System.out.println();
        if (par == 0) {
            System.out.print("Nenhum valor par digitado.");
        } else {
            System.out.print("Valores pares digitados: ");
            for (int i = 0; i < valores.length; i++) {
                if (valores[i] % 2 == 0) {
                    System.out.print(valores[i] + " ");
                }
            }
        }
    }
}
