package ArraysELacos;

import java.util.Scanner;

public class CaracterImparMaiusculo {

    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scaner.nextLine();

        char[] letras = palavra.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            if ((i + 1) % 2 == 0) {
                System.out.print(Character.toString(letras[i]).toLowerCase());
            } else {
                System.out.print(Character.toString(letras[i]).toUpperCase());
            }
        }
    }
}
