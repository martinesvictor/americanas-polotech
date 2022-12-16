public class MoverElementoMatriz {
    public static void main(String[] args) {
        Character[][] mat = new Character[3][3];
        mat[0][1] = 'X';

        imprimir(mat);
        mover(mat);
        imprimir(mat);
        mover(mat);
        imprimir(mat);
        mover(mat);
        imprimir(mat);
        mover(mat);
        imprimir(mat);
        mover(mat);
        imprimir(mat);
        mover(mat);
        imprimir(mat);
        mover(mat);
        imprimir(mat);
        mover(mat);
        imprimir(mat);
        mover(mat);
        imprimir(mat);
        mover(mat);
        imprimir(mat);
        mover(mat);
        mover(mat);
        imprimir(mat);

    }

    public static void imprimir(Character[][] mat) {
        System.out.println();
        for (int indiceLinha = 0; indiceLinha < mat.length; indiceLinha++) {
            Character[] linha = mat[indiceLinha];
            System.out.print("[ ");

            for (int indiceColuna = 0; indiceColuna < mat[indiceLinha].length; indiceColuna++) {
                Character elemento = mat[indiceLinha][indiceColuna];

                if (elemento == null) {
                    System.out.print("_");
                } else {
                    System.out.print(elemento);
                }

                if (indiceColuna == linha.length - 1) {
                    System.out.print(" ]");
                } else {
                    System.out.print(" , ");
                }
            }
            System.out.println();
        }
    }

    public static void mover(Character[][] mat) {
        int[] posicao = encontrar(mat);
        int linha = posicao[0];
        int coluna = posicao[1];

        if (coluna == mat.length - 1) {
            moverParaBaixoEComeco(mat);
        } else {
            Character elemento = mat[linha][coluna];
            mat[linha][coluna] = null;
            mat[linha][coluna + 1] = elemento;
        }
    }

    public static int[] encontrar(Character[][] mat) {
        int[] posicoes = new int[2];
        TUDO:
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != null) {
                    posicoes[0] = i;
                    posicoes[1] = j;
                    break TUDO;
                }
            }
        }
        return posicoes;
    }

    private static void moverParaBaixoEComeco(Character[][] mat) {
        int[] posicao = encontrar(mat);
        int linha = posicao[0];
        int coluna = posicao[1];


        Character elemento = mat[linha][coluna];
        mat[linha][coluna] = null;
        if (linha == mat.length - 1 && coluna == mat[coluna].length - 1) {
            mat[0][0] = elemento;
        } else {
            mat[linha + 1][0] = elemento;
        }

    }
}
