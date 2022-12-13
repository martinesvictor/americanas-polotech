package Modulo1;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        var ler = new Scanner(System.in);
        System.out.println("Primeiro numero: ");
        int numero1 = ler.nextInt();

        System.out.println("Segundo numero: ");
        int numero2 = ler.nextInt();

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(numero1, numero2));

        System.out.println(subtrair(numero1, numero2));

        System.out.println(dividir(numero1, numero2));

        System.out.println(multiplicar(numero1, numero2));
    }

    public int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static int subtrair(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public static float dividir(float numero1, float numero2) {
        if (numero2 == 0) {
            return 0;
        }
        return numero1 / numero2;
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }
}
