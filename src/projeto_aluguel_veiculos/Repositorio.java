package projeto_aluguel_veiculos;

import poo2.Pessoa;

import java.util.List;

public interface Repositorio {

    /**
        Cadastrar os veículos;
        Alterar um veículo cadastrado;
        Buscar um veículo por parte do nome;
        Cadastrar o cliente (pessoa física e jurídica)
        Alterar o cliente (pessoa física e jurídica)
        Alugar um veículo para pessoa física e jurídica;
        Devolver um veículo para pessoa física e jurídica;
     */

    void cadastrarVeiculo();
    
    void alterarVeiculoCadastrado();

    void buscarVeiculoPorParteDoNome();

    void cadastrarCliente();

    void alterarCadastroCliente();
    
    void listarVeiculos();

    void listarClientes();

    void alugarVeiculo();

    void devolverVeiculo();
}
