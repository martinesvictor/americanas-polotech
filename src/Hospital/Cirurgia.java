package Hospital;

import java.util.Random;

public class Cirurgia {
    static Random aleatorio = new Random();
    private static Integer urgencia = aleatorio.nextInt(0, 2);
    private Cirurgia(){

    }

    public static Integer getUrgencia() {
        return urgencia;
    }
}
