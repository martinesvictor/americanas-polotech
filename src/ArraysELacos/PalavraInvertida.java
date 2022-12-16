package ArraysELacos;



import java.util.Scanner;

public class PalavraInvertida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra para inverter: ");
        String palavra = scanner.nextLine();

        char[] arrayLetras = palavra.toCharArray();
        char letrasIvertida[] = new char[arrayLetras.length];

        for (int i = 0; i < arrayLetras.length; i++) {
            letrasIvertida[i] = arrayLetras[arrayLetras.length - 1 - i];
        }

        System.out.println("Palavra digitada: " + palavra);
        System.out.print("Palavra invertida: ");
        for (char letra : letrasIvertida) {
            System.out.print(letra);
        }
    }
}
