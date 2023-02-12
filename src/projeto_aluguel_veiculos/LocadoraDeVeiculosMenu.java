package projeto_aluguel_veiculos;


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
                repositorioEmMemoriaDeVeiculos.alugarVeiculo();
            }
            if (escolha == 7) {
                repositorioEmMemoriaDeVeiculos.devolverVeiculo();
            }
            if (escolha == 8) {
                repositorioEmMemoriaDeVeiculos.listarVeiculos();
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
