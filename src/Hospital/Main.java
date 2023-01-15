package Hospital;

public class Main {

    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        Medico medico = new Medico();
        paciente.setNome("Lucas Fer");
//        paciente.sintomas();
        System.out.println(medico.realizarDiagnostico(paciente.sintomas()));

    }


}
