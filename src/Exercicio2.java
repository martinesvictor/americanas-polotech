import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a hora: ");
        int hora = scanner.nextInt();

        System.out.println("Informe os minutos: ");
        int minutos = scanner.nextInt();

        System.out.println("Quantidade adicionar: ");
        int adicionar = scanner.nextInt();

        hora = (hora+adicionar) % 24;

        int horaLondres = (hora+3) % 24;
        int horaMexico= ((hora-3) +24) % 24;

        System.out.println("Brasil: " + hora + "h" + minutos + "min");
        System.out.println("Mexico (dst): " + horaMexico + "h" + minutos + "min");
        System.out.println("Londres: " + horaLondres + "h" + minutos + "min");
    }
}
