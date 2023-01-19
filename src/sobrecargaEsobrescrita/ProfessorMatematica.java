package sobrecargaEsobrescrita;

public class ProfessorMatematica extends Professor {

    // SOBREPOSIÇÃO
    @Override
    public void darAula() {
        System.out.println("Professor de Matemática dando aula.");
    }

    @Override
    public void aplicarProva() {
        System.out.println("Aplicando prova específica de Matemática.");
    }

}
