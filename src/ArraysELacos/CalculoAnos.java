package ArraysELacos;


public class CalculoAnos {
    public static void main(String[] args) {
        int populacaoA = 80_000;
        int populacaoB = 200_000;
        final double TAXA_POPULACAO_A = 0.03f;
        final double TAXA_POPULACAO_B = 0.015f;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * TAXA_POPULACAO_A;
            populacaoB += populacaoB * TAXA_POPULACAO_B;
            anos++;
        }
        System.out.printf("Para que a População A ultrapasse ou se iguale a Polulação B " +
                "serão necessários %d anos.", anos);
    }
}
