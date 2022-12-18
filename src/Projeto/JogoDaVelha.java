package Projeto;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        introducao();

        Character[][] matriz = new Character[3][3];
        Scanner scanner = new Scanner(System.in);
        int linha, coluna;
        boolean acabou = false;

        for (int i = 0; i < 9; i++) {
            int jogador;
            imprimirTabuleiro(matriz);
            if (i % 2 == 0) {
                jogador = 1;
                System.out.printf("---------- Jogador %d 'O' ----------\n", jogador);
            } else {
                jogador = 2;
                System.out.printf("---------- Jogador %d 'X' ----------\n", jogador);
            }
            do {
                System.out.print("Escolha a posição da Linha [Horizontal]: ");
                linha = scanner.nextInt();

                System.out.print("Escolha a posição da Coluna [Vertical]: ");
                coluna = scanner.nextInt();
            } while (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || matriz[linha][coluna] != null);

            if (i % 2 == 0) {
                matriz[linha][coluna] = 'O';
            } else {
                matriz[linha][coluna] = 'X';
            }
            if (i > 3) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if ((matriz[k][0] == matriz[k][1] && matriz[k][1] == matriz[k][2]) ||
                                (matriz[0][k] == matriz[1][k] && matriz[1][k] == matriz[2][k]) ||
                                (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) ||
                                (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0])) {
                            acabou = true;
                            break;
                        }
                    }
                    if (acabou == true) {
                        break;
                    }
                }
            }
            if (acabou == true) {
                imprimirTabuleiro(matriz);
                System.out.printf("* * * * O Jogador %d '%s' GANHOU!! * * * *\n", jogador, matriz[linha][coluna]);
                break;
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
