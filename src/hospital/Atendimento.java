package Hospital;

import java.util.Scanner;

public class Atendimento {
    private static String codigo;
    /*  codigo VERDE - Não prioritário
        codigo AMARELO - Prioritário
        codigo VERMELHO - Urgente
    */

    public Atendimento(){

    }

    public static void prioridadeAtendimento(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha a prioridade do atendimento, código [VERDE, AMARELO, VERMELHO]: ");
        codigo = scanner.nextLine().toUpperCase();
    }
}
