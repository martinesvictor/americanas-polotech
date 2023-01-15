package Hospital;

import java.util.List;

public class Medico extends Funcionario{



    public String realizarDiagnostico(List<String> sintomas){
        for (String i: sintomas) {
            if (i.equals("fratura")) {
                return "Você deve ser atendido por um Cirurgiao.";
            }
            if (i.equals("dor de cabeça")) {
                return "Você deve ser atendido por um Neuro.";
            }
        }
        return "Você deve ser atendido por um Clinico Geral.";
    }


    @Override
    public void baterPonto() {
        System.out.println("Batendo ponto do Medico");
    }
}
