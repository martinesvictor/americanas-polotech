package projeto_aluguel_veiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class LocadoraDeVeiculos {
    public static void main(String[] args) {


//        String senha = null;
//        while (!Atendente.getSenha().equals(senha)) {
//            System.out.print("[Senha] para acessar o menu: ");
//            Scanner scanner = new Scanner(System.in);
//            senha = scanner.nextLine().toLowerCase();
//            if (!Atendente.getSenha().equals(senha)) {
//                System.out.println("# Incorreta. Tente novamente. #");
//            }
//        }

        String fecharMenu = "N";
        List<Veiculo> listaDeVeiculos = new ArrayList<>();
        List<Cliente> listaDeCliente = new ArrayList<>();

        while (fecharMenu.equals("N")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("""
                    ======= LOCADORA DE VEICULOS - MENU DO ATENDENTE =======
                    1- Cadastrar Veículo
                    2- Alterar Veículo Cadastrado
                    3- Buscar Veículo por parte do Nome
                    4- Cadastrar Cliente
                    5- Alterar dados Cliente
                    6- Alugar Veículo
                    7- Devolver Veículo
                    8- Ver Veículos Disponíveis
                    0- Fechar Menu""");
            System.out.print("===== Digite o Número p/ Escolher: ");
            int escolha = scanner.nextInt();
            if (escolha == 1) {
                Veiculo novoVeiculo = Atendente.cadastrarVeiculo();
                try {
                    for (Veiculo veiculo : listaDeVeiculos) {
                        if (veiculo.getPlaca().equals(novoVeiculo.getPlaca())) {
                            throw new RuntimeException();
                        }
                    }
                    listaDeVeiculos.add(novoVeiculo);
                    System.out.println("Veículo Cadastrado com Sucesso!");
                } catch (RuntimeException e) {
                    System.out.println("# Erro. Veículo já Cadastrado. #");
                }
            }
            if (escolha == 2) {
                scanner = new Scanner(System.in);
                System.out.println(listaDeVeiculos);
                System.out.print("Digite a Placa do Veículo que Deseja Alterar: ");
                String alterarVeiculo = scanner.nextLine();
                for (Veiculo veiculo : listaDeVeiculos) {
                    if (veiculo.getPlaca().equals(alterarVeiculo)) {
                        int sair = 1;
                        while (sair == 1) {
                            scanner = new Scanner(System.in);
                            System.out.println("""
                                    1- Alterar Nome do Veículo
                                    2- Alterar Modelo do Veículo
                                    3- Alterar Placa do Veículo
                                    0- Sair""");
                            System.out.print("Digite o Número p/ Escolher: ");
                            int num = scanner.nextInt();
                            if (num == 1) {
                                scanner = new Scanner(System.in);
                                System.out.print("Digite o Novo Nome: ");
                                String novoNome = scanner.nextLine();
                                veiculo.setNome(novoNome);
                            }
                            if (num == 2) {
                                scanner = new Scanner(System.in);
                                System.out.print("Digite o Novo Modelo: ");
                                String novoModelo = scanner.nextLine();
                                veiculo.setModelo(novoModelo);
                            }
                            if (num == 3) {
                                scanner = new Scanner(System.in);
                                System.out.print("Digite a Nova Placa: ");
                                String novaPlaca = scanner.nextLine();
                                veiculo.setPlaca(novaPlaca);
                            }
                            if (num == 0) {
                                sair = num;
                            }
                            System.out.println(veiculo);
                        }
                    }
                }
            }

            if (escolha == 8) {
                System.out.println(listaDeVeiculos);
            }
            if (escolha == 0) {
                fecharMenu = "S";
            }

        }
//        Veiculo veiculo = new Veiculo("Corola", "médio", "SDA4312");
//        Veiculo veiculo2 = new Veiculo("Uno", "pequeno", "QWE1234");
//
//        System.out.println(veiculo);
//        System.out.println(veiculo2);
    }
}
