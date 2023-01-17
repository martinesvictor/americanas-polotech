package Hospital;

import java.util.Scanner;

public class Cirurgiao extends Medico {
    public Cirurgiao() {
    }

    public Cirurgiao(String nome, String cpf) {
        super(nome, cpf);
    }

    public void realizarCirurgia(Paciente paciente) {
        Scanner scanner = new Scanner(System.in);
        if (Cirurgia.getUrgencia() == 1) {
            System.out.println(paciente.getNome() + " você precisa realizar sua cirurgia AGORA!!");
        } else {
            System.out.println(paciente.getNome() + " agende sua cirurgia, ela não é urgente.");
            System.out.print("Digite o dia: ");
            int dia = scanner.nextInt();
            System.out.print("Digite o mês: ");
            int mes = scanner.nextInt();
            System.out.print("Digite o ano: ");
            int ano = scanner.nextInt();
            Sala.reservar(dia, mes, ano);
        }
    }
}
