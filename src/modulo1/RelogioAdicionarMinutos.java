package Modulo1;

import java.util.Scanner;

public class RelogioAdicionarMinutos {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int horas = receberValorHorario("Informe as horas: ", ler);

        int minutos = receberValorHorario("Informe os minutos: ", ler);

        int addMin = receberValorHorario("Informe os minutos a adicionar: ", ler);

        horas = (horas + ((minutos + addMin) / 60));
        minutos = (minutos + addMin) % 60;

        System.out.println();
        horario("Brasil", horas, minutos, 0);
        horario("Mexico", horas, minutos, -3);
        horario("Londres", horas, minutos, 3);
    }

    public static void horario(String localizacao, int horas, int minutos, int dif) {
        System.out.printf("Horario %s: %dh%dmin\n", localizacao, ((horas + dif) + 24) % 24, minutos);
    }

    public static int receberValorHorario(String mensagem, Scanner ler) {
        System.out.print(mensagem);
        int valor = ler.nextInt();
        return valor;
    }
}
