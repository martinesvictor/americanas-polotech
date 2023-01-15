package Hospital;

public class Main {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente();
        Medico medico = new Medico();
        Atendente atendente = new Atendente();

//        atendente.iniciarAtendimento(paciente1);
        Sala.reservar(12,12,2023);
//        paciente.sintomas()
//        System.out.println(medico.realizarDiagnostico(paciente1.sintomas()));

    }


}
