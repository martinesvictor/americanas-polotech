package projeto_aluguel_veiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositorioEmMemoriaDeVeiculos implements Repositorio {

    private List<Veiculo> listaDeVeiculos;
    private final List<ClientePF> listaDeClientesPF;
    private final List<ClientePJ> listaDeClientesPJ;

    public RepositorioEmMemoriaDeVeiculos(List<Veiculo> listaDeVeiculos, List<ClientePF> listaDeClientesPF, List<ClientePJ> listaDeClientesPJ) {
        this.listaDeVeiculos = listaDeVeiculos;
        this.listaDeClientesPF = listaDeClientesPF;
        this.listaDeClientesPJ = listaDeClientesPJ;
    }

    public RepositorioEmMemoriaDeVeiculos() {
        this.listaDeVeiculos = new ArrayList<>();
        this.listaDeClientesPF = new ArrayList<>();
        this.listaDeClientesPJ = new ArrayList<>();
    }

    @Override
    public void cadastrarVeiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do Veículo: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o modelo do Veículo [pequeno, médio, SUV]: ");
        String modelo = scanner.nextLine();
        System.out.print("Digite a placa do Veículo: ");
        String placa = scanner.nextLine();

        Veiculo novoVeiculo = new Veiculo(nome, modelo, placa);
        try {
            for (Veiculo veiculo : listaDeVeiculos) {
                if (veiculo.getPlaca().equals(novoVeiculo.getPlaca())) {
                    throw new IllegalArgumentException();
                }
            }
            listaDeVeiculos.add(novoVeiculo);
            System.out.println("* Veículo Cadastrado com Sucesso! *");
        } catch (IllegalArgumentException e) {
            System.out.println("# Erro! Veículo já Cadastrado. #");
        }
    }

    @Override
    public void alterarVeiculoCadastrado() {
        Scanner scanner = new Scanner(System.in);
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
            } else {
                System.out.println("# Veículo Não Encontrado. #");
            }
        }
    }

    @Override
    public void buscarVeiculoPorParteDoNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite Parte do Nome do Veiculo: ");
        String procurarVeiculo = scanner.nextLine();
        for (Veiculo veiculo : listaDeVeiculos) {
            if (veiculo.getNome().contains(procurarVeiculo)) {
                System.out.println(veiculo);
            } else {
                System.out.println("# Nenhum Veículo Encontrado. #");
            }
        }
    }


    @Override
    public void cadastrarCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                1- Cliente Pessoa Física
                2- Cliente Pessoa Jurídica
                Escolha o Tipo do Cliente (Número):\040""");
        int tipoDoCliente = scanner.nextInt();
        if (tipoDoCliente == 1) {
            scanner = new Scanner(System.in);
            System.out.print("Digite o nome do Cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o CPF do Cliente: ");
            String cpf = scanner.nextLine();
            ClientePF cliente = new ClientePF(nome, cpf);
            listaDeClientesPF.add(cliente);
        }
        if (tipoDoCliente == 2) {
            scanner = new Scanner(System.in);
            System.out.print("Digite o nome do Cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Digite o CNPJ do Cliente: ");
            String cnpj = scanner.nextLine();
            ClientePJ cliente = new ClientePJ(nome, cnpj);
            listaDeClientesPJ.add(cliente);
        }
        System.out.println("* Cliente Cadastrado com Sucesso. *");
    }


    @Override
    public void alterarCadastroCliente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                1- Cliente Pessoa Física
                2- Cliente Pessoa Jurídica
                Escolha o Tipo do Cliente (Número):\040""");
        int tipoDoCliente = scanner.nextInt();
        if (tipoDoCliente == 1) {
            scanner = new Scanner(System.in);
            System.out.print("Digite o CPF do Cliente: ");
            String buscarCPF = scanner.nextLine();
            for (ClientePF cliente : listaDeClientesPF) {
                if (cliente.getCPF().equals(buscarCPF)) {
                    int sair = 1;
                    while (sair == 1) {
                        scanner = new Scanner(System.in);
                        System.out.println("""
                                1- Alterar Nome do ClientePF
                                0- Sair""");
                        System.out.print("Digite o Número p/ Escolher: ");
                        int num = scanner.nextInt();
                        if (num == 1) {
                            scanner = new Scanner(System.in);
                            System.out.print("Digite o Novo Nome do ClientePF: ");
                            String novoNome = scanner.nextLine();
                            cliente.setNome(novoNome);
                        }
                        if (num == 0) {
                            sair = num;
                        }
                        System.out.println(cliente);
                    }
                } else {
                    System.out.println("# ClientePF Não Encontrado. #");
                }
            }
        }
        if (tipoDoCliente == 2) {
            scanner = new Scanner(System.in);
            System.out.print("Digite o CNPJ do Cliente: ");
            String buscarCNPJ = scanner.nextLine();
            for (ClientePJ cliente : listaDeClientesPJ) {
                if (cliente.getCNPJ().equals(buscarCNPJ)) {
                    int sair = 1;
                    while (sair == 1) {
                        scanner = new Scanner(System.in);
                        System.out.println("""
                                1- Alterar Nome do ClientePJ
                                0- Sair""");
                        System.out.print("Digite o Número p/ Escolher: ");
                        int num = scanner.nextInt();
                        if (num == 1) {
                            scanner = new Scanner(System.in);
                            System.out.print("Digite o Novo Nome do ClientePJ: ");
                            String novoNome = scanner.nextLine();
                            cliente.setNome(novoNome);
                        }
                        if (num == 0) {
                            sair = num;
                        }
                        System.out.println(cliente);
                    }
                } else {
                    System.out.println("# ClientePJ Não Encontrado. #");
                }
            }
        }
    }


    public void alugarVeiculo() {

    }


    public void setListaDeVeiculos(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }

    @Override
    public List<Veiculo> listarVeiculos() {
        return new ArrayList<>(listaDeVeiculos);
    }

    @Override
    public void listarClientes() {
        System.out.println("Clientes PF:");
        System.out.println(listaDeClientesPF);
        System.out.println("Clientes PJ:");
        System.out.println(listaDeClientesPJ);
    }

}