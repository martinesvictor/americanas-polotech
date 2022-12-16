public class MoverElementoMatriz {
    public static void main(String[] args) {
        Character[][] mat = new Character[3][3];
        mat[0][0] = 'X';

        encontrar(mat);
        imprimir(mat);
        mover(mat);
        mover(mat);

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
        TUDO:
        for (int indiceLinha = 0; indiceLinha < mat.length; indiceLinha++) {
            for (int indiceColuna = 0; indiceColuna < mat[indiceLinha].length; indiceColuna++) {
                if (mat[indiceLinha][indiceColuna] == 'X') {
                    mat[indiceLinha][indiceColuna + 1] = 'X';
                    mat[indiceLinha][indiceColuna] = '_';
                    break TUDO;
                }
            }
        }
        imprimir(mat);
    }

    public static int[] encontrar(Character[][] mat) {
        return new int[] {0, 0};
    }

    private static void moverParaBaixoEComeco(Character[][] mat) {

    }
}
