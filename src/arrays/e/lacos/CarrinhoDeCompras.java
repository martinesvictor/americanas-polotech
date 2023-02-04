package ArraysELacos;


import java.util.Scanner;

public class CarrinhoDeCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carrinhoDeCompras[] = new String[5];

        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            System.out.printf("Insira o nome da %da fruta: ", i+1);
            carrinhoDeCompras[i] = scanner.nextLine();
        }

        System.out.println("Lista completa de compras: ");
        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            System.out.printf("%d- %s\n", i+1, carrinhoDeCompras[i]);
        }
    }
}
