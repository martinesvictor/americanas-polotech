package projeto_aluguel_veiculos;

import java.util.List;
import java.util.Scanner;

public class ClientePJ extends Cliente {

    private String cnpj;
    private Veiculo veiculoAlugado;

    public ClientePJ(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public ClientePJ() {

    }

    public String getCNPJ() {
        return cnpj;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " CNPJ: " + cnpj + "\n";
    }


    @Override
    public void alugarVeiculo() {

    }

    @Override
    public boolean devolverVeiculo() {
        return false;
    }
}
