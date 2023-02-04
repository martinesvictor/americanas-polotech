package projeto_aluguel_veiculos;

public class Veiculo {

    private String nome;
    private String modelo; // pequeno, médio ou SUV
    private String placa;


    public Veiculo(String nome, String modelo, String placa) {
        this.nome = nome;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
            this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Nome do Veículo: " + nome + ", Modelo: " + modelo + ", Placa: " + placa;
    }
}
