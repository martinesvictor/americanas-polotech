package Hospital;

import java.util.Scanner;

public class Atendente extends Funcionario {

    public Atendente() {
    }

    public Atendente(String nome, String cpf) {
        super(nome, cpf);
    }

    public final void iniciarAtendimento(Paciente paciente) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("+ + + Novo Cadastro de Paciente + + +\nDigite o nome do paciente: ");
        String nomePaciente = scanner.nextLine();
        paciente.setNome(nomePaciente);
        System.out.print("Digite o CPF do paciente (Somente Números): ");
        String cpfPaciente = scanner.nextLine();
        paciente.setCpf(cpfPaciente);
        Fila.entrarNaFila(paciente);
    }

    @Override
    public void baterPonto() {
        System.out.println("Batendo ponto do Atendente");
    }
}
