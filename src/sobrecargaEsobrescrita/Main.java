package sobrecargaEsobrescrita;

public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor();
        ProfessorMatematica professorMatematica = new ProfessorMatematica();
        ProfessorHistoria professorHistoria = new ProfessorHistoria();

        professor.darAula();
        professorMatematica.darAula();
        professor.aplicarProva();
        System.out.println(professor.calcularMediaAluno(10.0, 9.0, 8.0));
        professorHistoria.contarHistoria("Código Limpo");
        professorHistoria.contarHistoria();

    }
}
