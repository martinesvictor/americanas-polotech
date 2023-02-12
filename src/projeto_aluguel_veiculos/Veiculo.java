package projeto_aluguel_veiculos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Veiculo {

    private String nome;
    private String modelo; // pequeno, medio ou SUV
    private String placa;
    private Cliente clienteQueAlugou;
    private boolean isAlugado;
    private String localDoVeiculo;
    private BigDecimal valorDoVeiculo;
    private LocalDateTime dataEHorarioQueFoiAlugado;

    public Veiculo(String nome, String modelo, String placa) {
        this.nome = nome;
        this.modelo = modelo;
        this.placa = placa;
        this.clienteQueAlugou = null;
        this.isAlugado = false;
        this.localDoVeiculo = null;
        this.dataEHorarioQueFoiAlugado = null;
        if (modelo.equals("pequeno")) {
            this.valorDoVeiculo = BigDecimal.valueOf(100);
        } else if (modelo.equals("medio")){
            this.valorDoVeiculo = BigDecimal.valueOf(150);
        } else if(modelo.equals("SUV")){
            this.valorDoVeiculo = BigDecimal.valueOf(200);
        }
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

    public Cliente getClienteQueAlugou() {
        return clienteQueAlugou;
    }

    public void setClienteQueAlugou(Cliente clienteQueAlugou) {
        this.clienteQueAlugou = clienteQueAlugou;
    }

    public boolean isAlugado() {
        return isAlugado;
    }

    public void setAlugado(boolean alugado) {
        isAlugado = alugado;
    }

    public BigDecimal getValorDoVeiculo() {
        return valorDoVeiculo;
    }

    public String getLocalDoVeiculo() {
        return localDoVeiculo;
    }

    public void setLocalDoVeiculo(String localDoVeiculo) {
        this.localDoVeiculo = localDoVeiculo;
    }

    public LocalDateTime getDataEHorarioQueFoiAlugado() {
        return dataEHorarioQueFoiAlugado;
    }

    public void setDataEHorarioQueFoiAlugado(LocalDateTime dataEHorarioQueFoiAlugado) {
        this.dataEHorarioQueFoiAlugado = dataEHorarioQueFoiAlugado;
    }


    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", isAlugado=" + isAlugado +
                '}';
    }
}
