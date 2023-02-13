package projeto_aluguel_veiculos;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositorioEmMemoriaDeVeiculos implements Repositorio {

    private final List<Veiculo> listaDeVeiculos;
    private final List<ClientePF> listaDeClientesPF;
    private final List<ClientePJ> listaDeClientesPJ;

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
        System.out.print("Digite o modelo do Veículo [pequeno, medio, SUV]: ");
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                1- Cliente Pessoa Física
                2- Cliente Pessoa Jurídica
                Escolha o Tipo do Cliente (Número):\040""");
        int tipoDoCliente = scanner.nextInt();
        if (tipoDoCliente == 1) {
            scanner = new Scanner(System.in);
            System.out.print("Digite o CPF do Cliente: ");
            String cpfDigitado = scanner.nextLine();
            for (ClientePF clientePF : listaDeClientesPF) {
                if (clientePF.getCPF().equals(cpfDigitado)) {
                    scanner = new Scanner(System.in);
                    System.out.println(listaDeVeiculos);
                    System.out.printf("Digite a Placa do Carro para Alugar para %s: ", clientePF.getNome());
                    String placaParaAlugar = scanner.nextLine();
                    for (Veiculo veiculo : listaDeVeiculos) {
                        if (veiculo.getPlaca().equals(placaParaAlugar)) {
                            scanner = new Scanner(System.in);
                            System.out.print("Digite o Local da Locação do Veículo: ");
                            String localAlugado = scanner.nextLine();
                            System.out.println("----- Digite a Data e o Horario do Aluguel -----");
                            System.out.print("Dia: ");
                            int dia = scanner.nextInt();
                            System.out.print("Mês: ");
                            int mes = scanner.nextInt();
                            System.out.print("Ano: ");
                            int ano = scanner.nextInt();
                            System.out.print("Horas: ");
                            int horas = scanner.nextInt();
                            System.out.print("Minutos: ");
                            int min = scanner.nextInt();
                            LocalDateTime dataEHorarioAlugado = LocalDateTime.of(ano, mes, dia, horas, min);
                            veiculo.setDataEHorarioQueFoiAlugado(dataEHorarioAlugado);
                            veiculo.setLocalDoVeiculo(localAlugado);
                            veiculo.setAlugado(true);
                            veiculo.setClienteQueAlugou(clientePF);
                            System.out.println("* Veiculo Alugado com Sucesso. *");
                        }
                    }
                }
            }
        }

        if (tipoDoCliente == 2) {
            scanner = new Scanner(System.in);
            System.out.print("Digite o CNPJ do Cliente: ");
            String cnpjDigitado = scanner.nextLine();
            for (ClientePJ clientePJ : listaDeClientesPJ) {
                if (clientePJ.getCNPJ().equals(cnpjDigitado)) {
                    scanner = new Scanner(System.in);
                    System.out.println(listaDeVeiculos);
                    System.out.printf("Digite a Placa do Carro para Alugar para %s: ", clientePJ.getNome());
                    String placaParaAlugar = scanner.nextLine();
                    for (Veiculo veiculo : listaDeVeiculos) {
                        if (veiculo.getPlaca().equals(placaParaAlugar)) {
                            scanner = new Scanner(System.in);
                            System.out.print("Digite o Local da Locação do Veículo: ");
                            String localAlugado = scanner.nextLine();
                            System.out.println("----- Digite a Data e o Horario do Aluguel -----");
                            System.out.print("Dia: ");
                            int dia = scanner.nextInt();
                            System.out.print("Mês: ");
                            int mes = scanner.nextInt();
                            System.out.print("Ano: ");
                            int ano = scanner.nextInt();
                            System.out.print("Horas: ");
                            int horas = scanner.nextInt();
                            System.out.print("Minutos: ");
                            int min = scanner.nextInt();
                            LocalDateTime dataEHorario = LocalDateTime.of(ano, mes, dia, horas, min);
                            veiculo.setDataEHorarioQueFoiAlugado(dataEHorario);
                            veiculo.setLocalDoVeiculo(localAlugado);
                            veiculo.setAlugado(true);
                            veiculo.setClienteQueAlugou(clientePJ);
                            System.out.println("* Veiculo Alugado com Sucesso. *");
                        }
                    }
                }
            }
        }
    }


    @Override
    public void devolverVeiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                1- Cliente Pessoa Física
                2- Cliente Pessoa Jurídica
                Escolha o Tipo do Cliente (Número):\040""");
        int tipoDoCliente = scanner.nextInt();
        if (tipoDoCliente == 1) {
            scanner = new Scanner(System.in);
            System.out.print("Digite a Placa do Carro para Devolver: ");
            String placaParaDevolver = scanner.nextLine();
            System.out.print("Digite o Local da Devolução do Veículo: ");
            String localDevolvido = scanner.nextLine();
            System.out.println("----- Digite a Data e o Horario do Aluguel -----");
            System.out.print("Dia: ");
            int dia = scanner.nextInt();
            System.out.print("Mês: ");
            int mes = scanner.nextInt();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            System.out.print("Horas: ");
            int horas = scanner.nextInt();
            System.out.print("Minutos: ");
            int min = scanner.nextInt();
            LocalDateTime dataEHorarioDevolucao = LocalDateTime.of(ano, mes, dia, horas, min);
            for (Veiculo veiculo : listaDeVeiculos) {
                if (veiculo.getPlaca().equals(placaParaDevolver)) {
                    veiculo.setAlugado(false);
                    Duration tempo = Duration.between(veiculo.getDataEHorarioQueFoiAlugado(), dataEHorarioDevolucao);
                    BigDecimal total = veiculo.getValorDoVeiculo().multiply(BigDecimal.valueOf(tempo.toDays()));
                    if ((tempo.toMinutes() % 60) > 0){
                        total = veiculo.getValorDoVeiculo().multiply(BigDecimal.valueOf(tempo.toDays()+1));
                    }
                    if (tempo.toDays() > 4) {
                        System.out.println("O Cliente Ganhou Desconto de 5%.");
                        total = total.multiply(BigDecimal.valueOf(0.95));
                    }
                    System.out.println("O Cliente deve Pagar: R$" + total);
                }
            }
        }
        if (tipoDoCliente == 2) {
            scanner = new Scanner(System.in);
            System.out.print("Digite a Placa do Carro para Devolver: ");
            String placaParaDevolver = scanner.nextLine();
            System.out.print("Digite o Local da Devolução do Veículo: ");
            String localDevolvido = scanner.nextLine();
            System.out.println("----- Digite a Data e o Horario do Aluguel -----");
            System.out.print("Dia: ");
            int dia = scanner.nextInt();
            System.out.print("Mês: ");
            int mes = scanner.nextInt();
            System.out.print("Ano: ");
            int ano = scanner.nextInt();
            System.out.print("Horas: ");
            int horas = scanner.nextInt();
            System.out.print("Minutos: ");
            int min = scanner.nextInt();
            LocalDateTime dataEHorarioDevolucao = LocalDateTime.of(ano, mes, dia, horas, min);
            for (Veiculo veiculo : listaDeVeiculos) {
                if (veiculo.getPlaca().equals(placaParaDevolver)) {
                    veiculo.setAlugado(false);
                    Duration tempo = Duration.between(veiculo.getDataEHorarioQueFoiAlugado(), dataEHorarioDevolucao);
                    BigDecimal total = veiculo.getValorDoVeiculo().multiply(BigDecimal.valueOf(tempo.toDays()));
                    if ((tempo.toMinutes() % 60) > 0){
                        total = veiculo.getValorDoVeiculo().multiply(BigDecimal.valueOf(tempo.toDays()+1));
                    }
                    if (tempo.toDays() > 2) {
                        System.out.println("O Cliente Ganhou Desconto de 10%.");
                        total = total.multiply(BigDecimal.valueOf(0.90));
                    }
                    System.out.println("O Cliente deve Pagar: R$" + total);
                }
            }
        }
    }

    @Override
    public void listarVeiculos() {
        int contador = 0;
        for (Veiculo veiculo : listaDeVeiculos) {
            if (!veiculo.isAlugado()) {
                System.out.println(veiculo);
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("# Nenhum Veículo Disponível para Alugar. #");
        }
    }

    @Override
    public void listarClientes() {
        System.out.println("Clientes PF:");
        System.out.println(listaDeClientesPF);
        System.out.println("Clientes PJ:");
        System.out.println(listaDeClientesPJ);
    }

}