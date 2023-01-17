package Hospital;

import java.util.Random;
import java.util.Scanner;

public final class Neuro extends Medico {

    public Neuro() {
    }

    public Neuro(String nome, String cpf) {
        super(nome, cpf);
    }

    public void avaliarPaciente(Paciente paciente) {
        System.out.println("===== Neuro avaliando paciente... =====");
        Random aleatorio = new Random();
        int tumor = aleatorio.nextInt(0, 2);
        Scanner scanner = new Scanner(System.in);

        if (tumor == 1) {
            System.out.println(paciente.getNome() + " foi encontrado um tumor em sua cabeça, agende uma cirurgia!!");
            System.out.print("Digite o dia: ");
            int dia = scanner.nextInt();
            System.out.print("Digite o mês: ");
            int mes = scanner.nextInt();
            System.out.print("Digite o ano: ");
            int ano = scanner.nextInt();
            Sala.reservar(dia, mes, ano);
        } else {
            System.out.println(paciente.getNome() + " tome uma Dipirona e você irá melhorar.");
        }
    }
}
