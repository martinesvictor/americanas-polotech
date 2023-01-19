package sobrecargaEsobrescrita;

public class Professor {

    private String name;
    private String materia;

    public void darAula(){
        System.out.println("Professor dando aula genérica e tirando dúvidas.");
    }

    public void aplicarProva(){
        System.out.println("Aplicando prova de Conhecimentos Gerais.");
    }

    // SOBRECARGA
    public Double calcularMediaAluno(Double prova1, Double prova2){
        return (prova1+prova2)/2;
    }

    public Double calcularMediaAluno(Double prova1, Double prova2, Double prova3){
        return (prova1+prova2+prova3)/3;
    }

}
