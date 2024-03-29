package Hospital;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente("Julia", "123456789");
        Medico medico = new Medico();
        Neuro neuro = new Neuro();
        ClinicoGeral clinicoGeral = new ClinicoGeral();
        Cirurgiao cirurgiao = new Cirurgiao();
        Atendente atendente = new Atendente();


        System.out.println("+ + + Bem-vindo(a) ao Hospital + + +");
        atendente.iniciarAtendimento(paciente1);
        atendente.iniciarAtendimento(paciente2);
        Fila.chamarPaciente(paciente1);
        System.out.println(medico.realizarDiagnostico(paciente1.sintomas()));
        Fila.chamarPaciente(paciente2);
        System.out.println(medico.realizarDiagnostico(paciente2.sintomas()));
//        Sala.reservar(12,12,2023);
        neuro.avaliarPaciente(paciente1);
        cirurgiao.realizarCirurgia(paciente2);
        System.out.println(Fila.getTamanhoFila());
        clinicoGeral.receitarMedicamentos(paciente1);

    }
}
