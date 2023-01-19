package sobrecargaEsobrescrita;

public class ProfessorHistoria extends Professor {

    // SOBREPOSIÇÃO
    @Override
    public void darAula() {
        System.out.println("Professor de História dando aula.");
    }

    @Override
    public void aplicarProva() {
        System.out.println("Aplicando prova específica de História.");
    }
    // SOBRECARGA
    public void contarHistoria(){
        System.out.println("Contando história da vida.");
    }

    public void contarHistoria(String livro){
        System.out.println("Contando história do livro: " + livro);
    }
}
