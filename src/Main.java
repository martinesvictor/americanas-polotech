import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int hora = -1, minutos = -1;

        while (hora < 0 || hora > 23) {
            System.out.print("Informe a hora: ");
            hora = scanner.nextInt();
        }
        while (minutos < 0 || minutos > 59) {
            System.out.print("Informe os minutos: ");
            minutos = scanner.nextInt();
        }

        System.out.print("Quantidade adicionar: ");
        int adicionar = scanner.nextInt();

        minutos = (minutos+adicionar) % 60;

        int horaLondres = (hora + 3) % 24;
        int horaMexico = ((hora - 3) + 24) % 24;


        System.out.println("Brasil: " + hora + "h" + minutos + "min");
        System.out.println("Mexico (dst): " + horaMexico + "h" + minutos + "min");
        System.out.println("Londres: " + horaLondres + "h" + minutos + "min");
    }
}

