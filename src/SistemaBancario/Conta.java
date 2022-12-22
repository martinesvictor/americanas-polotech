package SistemaBancario;

public class Conta {
    private double saldo;
    private int numConta;


    public Conta(int numConta) {
        this.saldo = 100;
        this.numConta = numConta;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " reais realizado com sucesso.");
            return true;
        }
        System.out.println("Saldo insuficiente.");
        return false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Deposito de " + valor + " reais realizado com sucesso.");
    }

    public void transferir(Conta contaParaTransferir, double valor) {
        if (sacar(valor)) {
            contaParaTransferir.depositar(valor);
            System.out.println("Valor transferido " + valor + " reais para a conta " + contaParaTransferir.getNumConta());
        } else {
            System.out.println("Não foi possível transferir.");
        }
    }

    public int getNumConta() {
        return numConta;
    }

    public void mostrarSaldo() {
        System.out.println("Seu saldo é: " + this.saldo);
    }
}
