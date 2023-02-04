package projeto_aluguel_veiculos;

import java.util.Scanner;

public class Atendente {

    private static String senha = "senha";

    public static String getSenha() {
        return senha;
    }

    public static Veiculo cadastrarVeiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do Veículo: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o modelo do Veículo [pequeno, médio, SUV]: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite a placa do Veículo: ");
        String placa = scanner.nextLine();
        return new Veiculo(nome, modelo, placa);
    }

}
