package Projeto;

public class JogoDaVelha {
    public static void main(String[] args) {
        System.out.println("====== BEM-VINDO AO JOGO DA VELHA ======");
        System.out.println("Escolha as posições de acordo com " +
                "o número da Linha e Coluna quando solicitado.\nLinha é " +
                "o valor na vertical e Coluna na horizontal.");
        System.out.println("==========================================");
        System.out.println("O Jogador 1 será o 'O' (círculo) e o Jogador 2 o 'X' (xis).");


        Character[][] matriz = new Character[3][3];
        matriz[0][0] = 'X';
        matriz[0][1] = 'O';

        imprimirTabuleiro(matriz);

        System.out.println("Escolha a posição para começar com 'O': ");
    }


    public static void imprimirTabuleiro(Character[][] matriz){
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
    public static int[] escolherPosicao(int linha, int coluna){
        int[] posicao = new int[2];
        posicao[1] = linha;
        posicao[2] = coluna;
        return posicao;
    }
}
