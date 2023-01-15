package Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Paciente extends Pessoa {

    public Paciente(){

    }
    public Paciente(String nome, String cpf) {
        super(nome, cpf);
    }

    public List<String> sintomas() {
        System.out.println(getNome() + " digite os seus sintomas. ");

        List<String> listaDeSintomas = new ArrayList<>();
        String resposta;
        int num = 1;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print(num + "º sintoma: ");
            String sintoma = scanner.nextLine();
            num++;
            listaDeSintomas.add(sintoma);
            System.out.print("Tem mais sintomas [S/N]? ");
            resposta = scanner.next().toUpperCase();

        } while (resposta.equals("S"));

        return listaDeSintomas;
    }
}
