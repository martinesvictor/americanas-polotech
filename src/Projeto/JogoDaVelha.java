package Projeto;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        introducao();

        String[][] matriz = new String[3][3];
        Scanner scanner = new Scanner(System.in);
        int linha, coluna;
        String continuar;
        boolean vitoria = false, empate = false;

        do {
            for (int i = 0; i < 9; i++) {
                int jogador;
                String simbolo;
                imprimirTabuleiro(matriz);
                if (i % 2 == 0) {
                    jogador = 1;
                    simbolo = "O";
                    System.out.printf("------------- Jogador %d '%s' -------------\n", jogador, simbolo);
                } else {
                    jogador = 2;
                    simbolo = "X";
                    System.out.printf("------------- Jogador %d '%s' -------------\n", jogador, simbolo);
                }
                do {
                    try {
                        System.out.print("Escolha a posição da Linha [Horizontal]: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Posição inválida. Digite [0, 1, 2] para posição da Linha: ");
                            scanner.nextLine();
                        }
                        linha = Integer.parseInt(scanner.nextLine());

                        System.out.print("Escolha a posição da Coluna [Vertical]: ");
                        while (!scanner.hasNextInt()) {
                            System.out.print("Posição inválida. Digite [0, 1, 2] para posição da Coluna: ");
                            scanner.nextLine();
                        }
                        coluna = Integer.parseInt(scanner.nextLine());

                    } catch (NumberFormatException NFE) {
                        System.out.println("Posição inválida. Tente novamente apenas com os números [0, 1, 2].");
                        linha = -1;
                        coluna = -1;
                    }
                } while (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || matriz[linha][coluna] != null);

                matriz[linha][coluna] = simbolo;

                if (i > 3) {
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            if ((matriz[j][0] == "X" && matriz[j][1] == "X" && matriz[j][2] == "X") ||
                                    (matriz[j][0] == "O" && matriz[j][1] == "O" && matriz[j][2] == "O") ||
                                    (matriz[0][k] == "X" && matriz[1][k] == "X" && matriz[2][k] == "X") ||
                                    (matriz[0][k] == "O" && matriz[1][k] == "O" && matriz[2][k] == "O") ||
                                    (matriz[0][0] == "X" && matriz[1][1] == "X" && matriz[2][2] == "X") ||
                                    (matriz[0][0] == "O" && matriz[1][1] == "O" && matriz[2][2] == "O") ||
                                    (matriz[0][2] == "X" && matriz[1][1] == "X" && matriz[2][0] == "X") ||
                                    (matriz[0][2] == "O" && matriz[1][1] == "O" && matriz[2][0] == "O")) {
                                vitoria = true;
                                break;
                            } else if (i > 7) {
                                empate = true;
                                break;
                            }
                        }
                        if (vitoria || empate) {
                            break;
                        }
                    }
                }
                if (vitoria) {
                    imprimirTabuleiro(matriz);
                    System.out.printf("* * * * O Jogador %d '%s' GANHOU!! * * * *\n", jogador, matriz[linha][coluna]);
                    break;
                } else if (empate) {
                    imprimirTabuleiro(matriz);
                    System.out.println("_ _ _ _ _ O jogo empatou _ _ _ _ _");
                    break;
                }
            }

            while (true) {
                System.out.print("Deseja jogar novamente? Digite [S] para Sim ou [N] para Não: ");
                continuar = scanner.next().toUpperCase().strip();
                if (continuar.equals("S") || continuar.equals("N")) {
                    break;
                }
            }

            if (continuar.equals("S")) {
                vitoria = false;
                empate = false;
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        matriz[j][k] = null;
                    }
                }
                System.out.println("------------------ NOVO TABULEIRO -----------------");
            }
            if (continuar.equals("N")) {
                System.out.println("---> Jogo encerrado. Obrigado por jogar! <---");
            }
        } while (continuar.equals("S"));
    }


    public static void imprimirTabuleiro(String[][] matriz) {
        System.out.println("  0   1   2");
        for (int indiceLinha = 0; indiceLinha < matriz.length; indiceLinha++) {
            String[] linha = matriz[indiceLinha];
            System.out.print(indiceLinha + " ");

            for (int indiceColuna = 0; indiceColuna < matriz[indiceLinha].length; indiceColuna++) {
                String elemento = matriz[indiceLinha][indiceColuna];

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
                "o valor na [Horizontal] e Coluna na [Vertical]. Digite apenas [0, 1, 2].");
        System.out.println("==================================================");
        System.out.println("O Jogador 1 será o 'O' (círculo) e o Jogador 2 o 'X' (xis).");
        System.out.println("-------------------- TABULEIRO -------------------");
    }
}
