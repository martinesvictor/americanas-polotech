package Hospital;

public abstract class Funcionario extends Pessoa{


    public Funcionario() {
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }
    public abstract void baterPonto();

}
