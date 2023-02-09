package projeto_aluguel_veiculos;


import java.util.Scanner;

public class LocadoraDeVeiculosMenu {
    public static void main(String[] args) {

        Repositorio repositorioEmMemoriaDeVeiculos = new RepositorioEmMemoriaDeVeiculos();
        ClientePF clientePF = new ClientePF();
        ClientePJ clientePJ = new ClientePJ();


        String fecharMenu = "N";
        while (fecharMenu.equals("N")) {
            int escolha = MenuDeEscolhas.imprimirMenu();
            if (escolha == 1) {
                repositorioEmMemoriaDeVeiculos.cadastrarVeiculo();
            }
            if (escolha == 2) {
                repositorioEmMemoriaDeVeiculos.alterarVeiculoCadastrado();
            }
            if (escolha == 3) {
                repositorioEmMemoriaDeVeiculos.buscarVeiculoPorParteDoNome();
            }
            if (escolha == 4) {
                repositorioEmMemoriaDeVeiculos.cadastrarCliente();
            }
            if (escolha == 5) {
                repositorioEmMemoriaDeVeiculos.alterarCadastroCliente();
            }
            if (escolha == 6) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("""
                        1- Cliente Pessoa Física
                        2- Cliente Pessoa Jurídica
                        Escolha o Tipo do Cliente (Número):\040""");
                int tipoDoCliente = scanner.nextInt();
                if (tipoDoCliente == 1) {
                    clientePF.alugarVeiculo();
                }
                if (tipoDoCliente == 2) {
                    clientePJ.alugarVeiculo();
                }
            }
            if (escolha == 8) {
                System.out.println(repositorioEmMemoriaDeVeiculos.listarVeiculos());
            }
            if (escolha == 9) {
                repositorioEmMemoriaDeVeiculos.listarClientes();
            }
            if (escolha == 0) {
                fecharMenu = "S";
            }
        }
    }
}
