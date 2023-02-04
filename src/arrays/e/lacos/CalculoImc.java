package ArraysELacos;


import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomesPessoas[] = new String[5];
        double alturasPessoas[] = new double[5];
        double pesosPessoas[] = new double[5];
        double imcPessoas[] = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o nome da %da pessoa: ", i + 1);
            nomesPessoas[i] = scanner.nextLine();
            // Para corrigir o bug do scanner:
            if (i > 0) {
                nomesPessoas[i] = scanner.nextLine();
            }

            System.out.printf("Digite a altura do(a) %s em [m]: ", nomesPessoas[i]);
            alturasPessoas[i] = scanner.nextDouble();

            System.out.printf("Digite o peso do(a) %s em [kg]: ", nomesPessoas[i]);
            pesosPessoas[i] = scanner.nextDouble();

            imcPessoas[i] = pesosPessoas[i] / (alturasPessoas[i] * alturasPessoas[i]);
        }

        int contador = 0;
        for (int i = 0; i < 5; i++) {
            if (imcPessoas[i] < 18.5 || imcPessoas[i] > 25) {
                System.out.printf("%s está fora do peso ideal com IMC = %.2f, pesando %.2fkg e com %.2fm de altura.\n",
                        nomesPessoas[i], imcPessoas[i], pesosPessoas[i], alturasPessoas[i]);
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("Ninguém está fora do peso ideal.");
        }
    }
}