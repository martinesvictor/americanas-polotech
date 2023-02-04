package Hospital;

public class Fila {
    private static Integer tamanhoFila = 0;


    private Fila() {

    }

    public static void entrarNaFila(Paciente paciente) {
        tamanhoFila++;
        System.out.println(paciente.getNome() + " você está na " + tamanhoFila + "ª posição da fila.");
    }

    public static void chamarPaciente(Paciente paciente){
        tamanhoFila--;
        System.out.println(paciente.getNome() + " você será atendido(a) agora.");
    }

    public static Integer getTamanhoFila() {
        return tamanhoFila;
    }

}
