package ArraysELacos;

import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[5];
        int maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, media = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o %dº valor: ", i + 1);
            array[i] = scanner.nextInt();
            media += array[i];
            if (array[i] > maior) {
                maior = array[i];
            }
            if (array[i] < menor) {
                menor = array[i];
            }
        }

        System.out.printf("Maior valor: %d\nMenor valor: %d\nMedia dos valores: %d",
                maior, menor, media / array.length);

    }
}
