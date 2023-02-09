package projeto_aluguel_veiculos;


public class ClientePF extends Cliente {

    private String cpf;
    private Veiculo veiculoAlugado;

    public ClientePF(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public ClientePF() {

    }


    public String getCPF() {
        return cpf;
    }

    @Override
    public void alugarVeiculo() {
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " CPF: " + cpf + "\n";
    }



    @Override
    public boolean devolverVeiculo() {
        return false;
    }
}
