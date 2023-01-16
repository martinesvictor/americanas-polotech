package Hospital;

import java.util.List;

public class Medico extends Funcionario {

    public Medico() {
    }

    public Medico(String nome, String cpf) {
        super(nome, cpf);
    }

    public String realizarDiagnostico(List<String> sintomas) {
        System.out.println("-------------------------------");
        System.out.println("De acordo com os seus sintomas: " + sintomas + ".");
        for (String i : sintomas) {
            if (i.equals("fratura")) {
                return "Você deve ser atendido por um Cirurgiao.";
            }
            if (i.equals("dor de cabeça")) {
                return "Você deve ser atendido por um Neuro.";
            }
        }
        return "Você deve ser atendido(a) por um Clinico Geral.";
    }


    @Override
    public void baterPonto() {
        System.out.println("Batendo ponto do Medico");
    }
}
