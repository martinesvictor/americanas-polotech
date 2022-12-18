package Projeto;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        introducao();

        Character[][] matriz = new Character[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            imprimirTabuleiro(matriz);
            if (i % 2 == 0) {
                System.out.println("---------- Jogador 1 'O' ----------");
            } else {
                System.out.println("---------- Jogador 2 'X' ----------");
            }
            System.out.print("Escolha a posição da Linha [Horizontal]: ");
            int linha = scanner.nextInt();
            while (linha > 2 || linha < 0) {
                System.out.print("Posição inválida. Digite novamente [0, 1, 2]: ");
                linha = scanner.nextInt();
            }
            System.out.print("Escolha a posição da Coluna [Vertical]: ");
            int coluna = scanner.nextInt();
            while (coluna > 2 || coluna < 0) {
                System.out.print("Posição inválida. Digite novamente [0, 1, 2]: ");
                coluna = scanner.nextInt();
            }
            if (i % 2 == 0) {
                matriz[linha][coluna] = 'O';
            } else {
                matriz[linha][coluna] = 'X';
            }
        }
    }


    public static void imprimirTabuleiro(Character[][] matriz) {
        System.out.println("  0   1   2");
        for (int indiceLinha = 0; indiceLinha < matriz.length; indiceLinha++) {
            Character[] linha = matriz[indiceLinha];
            System.out.print(indiceLinha + " ");

            for (int indiceColuna = 0; indiceColuna < matriz[indiceLinha].length; indiceColuna++) {
                Character elemento = matriz[indiceLinha][indiceColuna];

                if (elemento == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(elemento);
                }

                if (indiceColuna == linha.length - 1) {
                    System.out.print("");
                } else {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

    public static void introducao() {
        System.out.println("=-=-=-=-=-= BEM-VINDO AO JOGO DA VELHA =-=-=-=-=-=");
        System.out.println("Escolha as posições de acordo com " +
                "o número da Linha e Coluna quando solicitado.\nLinha é " +
                "o valor na [Horizontal] e Coluna na [Vertical].");
        System.out.println("==================================================");
        System.out.println("O Jogador 1 será o 'O' (círculo) e o Jogador 2 o 'X' (xis).");
        System.out.println("-------------------- TABULEIRO -------------------");
    }
}
