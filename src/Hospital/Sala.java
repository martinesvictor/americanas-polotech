package Hospital;

public class Sala {

    private Sala() {
    }

    public static void reservar(int dia, int mes, int ano) {
        System.out.printf("Sala reservada para a data: %d/%d/%d\n", dia, mes, ano);
    }
}
