package projeto_aluguel_veiculos;

import java.util.Scanner;

public class MenuDeEscolhas {
    public static int imprimirMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                    ======= LOCADORA DE VEICULOS - MENU =======
                    1- Cadastrar Veículo
                    2- Alterar Veículo Cadastrado
                    3- Buscar Veículo por parte do Nome
                    4- Cadastrar Cliente
                    5- Alterar Dados Cliente
                    6- Alugar Veículo para Cliente
                    7- Devolver Veículo do Cliente
                    8- Ver Veículos Disponíveis
                    9- Ver Lista de Clientes
                    0- Fechar Menu""");
        System.out.print("===== Digite o Número p/ Escolher: ");
        int escolha = scanner.nextInt();
        return escolha;
    }
}
