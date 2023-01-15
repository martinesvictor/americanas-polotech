package Hospital;

public class Atendimento {
    private String urgencia;

    public Atendimento(){

    }

    public Atendimento(String urgencia) {
        this.urgencia = urgencia;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }
}
