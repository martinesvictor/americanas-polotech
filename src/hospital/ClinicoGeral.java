package Hospital;

public class ClinicoGeral extends Medico {
    public ClinicoGeral(){
    }

    public ClinicoGeral(String nome, String cpf){
        super(nome, cpf);
    }

    public void receitarMedicamentos(Paciente paciente){
        System.out.println(paciente.getNome() + " você deve tomar Doril 2x ao dia, durante 5 dias.");
        System.out.println("Caso os sintomas persistirem, retorne ao Hospital.");
    }

}
