package Modulo1;

import java.util.Scanner;

public class ImprimirNovaData {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int ano = armazenarValor("Informe o ano: ", ler);
        int mes = armazenarValor("Informe o mes: ", ler);
        int dia = armazenarValor("Informe o dia: ", ler);
        int hora = armazenarValor("Informe a hora: ", ler);
        int minuto = armazenarValor("Informe o minuto: ", ler);
        int segundo = armazenarValor("Informe o segundo: ", ler);
        int adicionar = armazenarValor("Agora informe o valor a adicionar: ", ler);
        System.out.print("Agora o parametro [y, m, d, h, M, s]: ");
        String parametro = ler.next();

        int numDays = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((ano % 4 == 0) &&
                        !(ano % 100 == 0))
                        || (ano % 400 == 0)) // checking for leap year
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Mês inválido.");
                break;
        }

        switch (parametro) {
            case "y":
                ano = ano + adicionar;
                break;
            case "m":
                if ((adicionar + mes / 12) >= 1) {
                    ano = ano + (adicionar + mes) / 12;
                }
                mes = (mes + adicionar) % 12;
                break;
            case "d":
                dia = dia + adicionar % numDays;
                break;
            case "h":
                hora = hora + adicionar;
                break;
            case "M":
                minuto = minuto + adicionar;
                break;
            case "s":
                if (segundo + adicionar / 60 >= 1) {
                    minuto = minuto + (segundo + adicionar) / 60;
                    if (minuto >= 60){
                        hora = hora + minuto / 60;
                        minuto = minuto % 60;
                    }
                }
                segundo = (segundo + adicionar) % 60;
                break;
            default:
                System.out.println("Parametro inválido.");
        }

        System.out.printf("%d/%d/%d %d:%d:%d", ano, mes, dia, hora, minuto, segundo);

    }

    public static int armazenarValor(String mensagem, Scanner ler) {
        System.out.print(mensagem);
        int valor = ler.nextInt();
        return valor;
    }

}
