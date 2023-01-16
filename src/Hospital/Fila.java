package Hospital;

public class Fila extends Sala {
    private static int posicao;


    public Fila() {

    }

    public Fila(Integer posicao) {
        this.posicao = posicao;
    }


    public static void entrarNaFila(Paciente paciente) {
        posicao++;
        System.out.println(paciente.getNome() + " você está na " + posicao + "ª posição da fila.");
    }

    public static void chamarPacienteParaAtendimento(Paciente paciente){
        posicao--;
        System.out.println(paciente.getNome() + " você será atendido agora.");
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }
}
