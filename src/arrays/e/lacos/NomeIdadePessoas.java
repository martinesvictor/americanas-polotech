package ArraysELacos;


import java.util.Scanner;

public class NomeIdadePessoas {

    public static void main(String[] args) {
        String nomes[] = new String[5];
        int idades[] = new int[5];
        int maisNovo = Integer.MAX_VALUE, maisVelho = Integer.MIN_VALUE, mediaIdades = 0;
        int indiceMaisVelho = 0, indiceMaisNovo = 0;

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Nome da %da pessoa: ", i + 1);
            nomes[i] = scanner.nextLine();

            if (i > 0) {
                nomes[i] = scanner.nextLine();
            }

            System.out.printf("Idade do(a) %s: ", nomes[i]);
            idades[i] = scanner.nextInt();

            mediaIdades += idades[i];

            if (idades[i] > maisVelho) {
                maisVelho = idades[i];
                indiceMaisVelho = i;
            }
            if (idades[i] < maisNovo) {
                maisNovo = idades[i];
                indiceMaisNovo = i;
            }
        }

        System.out.printf("O mais novo é: %s com %d anos.\n", nomes[indiceMaisNovo], maisNovo);
        System.out.printf("O mais velho é: %s com %d anos.\n", nomes[indiceMaisVelho], maisVelho);
        System.out.printf("A média de idade é: %d anos.", (mediaIdades / nomes.length));
    }
}
