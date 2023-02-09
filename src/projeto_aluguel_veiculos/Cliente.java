package projeto_aluguel_veiculos;

public abstract class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente() {

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void alugarVeiculo();

    public abstract boolean devolverVeiculo();


}
