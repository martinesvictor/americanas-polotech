package ArraysELacos;


import java.util.Scanner;

public class ListaDeConvidados {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] listaDeConvidados = new String[5];
        String maiorNome = "";
        int contador = 0;

        for (int i = 0; i < listaDeConvidados.length; i++) {
            System.out.printf("Digite o nome do convidado %d: ", i + 1);
            listaDeConvidados[i] = scanner.nextLine();
            if (maiorNome.length() == listaDeConvidados[i].length()) {
                contador++;
            }
            if (maiorNome.length() < listaDeConvidados[i].length()) {
                maiorNome = listaDeConvidados[i];
            }
        }

        if (contador == 0) {
            System.out.println("O nome mais longo da lista é: " + maiorNome);
        } else {
            String maioresNomes[] = new String[listaDeConvidados.length];
            System.out.println("Os nomes mais longos da lista são: ");
            for (int i = 0; i < listaDeConvidados.length; i++) {
                if (maiorNome.length() == listaDeConvidados[i].length()) {
                    maioresNomes[i] = listaDeConvidados[i];
                    System.out.println(maioresNomes[i]);
                }
            }
        }
    }
}
