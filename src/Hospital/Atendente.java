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
        System.out.println("Verificando se o paciente já possui cadastro...");
        if (paciente.getNome() != null && paciente.getCpf() != null) {
            System.out.println("* * * * Cadastro encontrado * * * *");
            System.out.println("Bem-vindo(a) " + paciente.getNome() + " você entrou na fila para ser atendido(a).");
            System.out.println("-------------------------------");
        } else {
            System.out.println("# # # # Cadastro NÃO encontrado # # # #");
            System.out.print("Informe o nome do paciente: ");
            String nomePaciente = scanner.nextLine();
            paciente.setNome(nomePaciente);
            System.out.print("Informe o CPF do paciente (Somente Números): ");
            String cpfPaciente = scanner.nextLine();
            paciente.setCpf(cpfPaciente);
            System.out.println("-------------------------------");
        }
        Atendimento.prioridadeAtendimento();
        Fila.entrarNaFila(paciente);
        System.out.println("-------------------------------");
    }

    @Override
    public void baterPonto() {
        System.out.println("Batendo ponto do Atendente");
    }
}
